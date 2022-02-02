package alkemy.movies.model

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import org.hibernate.annotations.SQLDelete
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDate
import javax.persistence.*

@Entity
@EntityListeners(AuditingEntityListener::class)
@SQLDelete(sql = "UPDATE Character c SET c.available = false WHERE c.id = ?")
@Table(name = "characters", schema = "disney_movies")
class Character (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    val id_character: Long? = null,

    @Column(nullable = false, name = "name", columnDefinition = "varchar(50)")
    var name_character: String = "Default Name",

    @Column(name = "age", columnDefinition = "int")
    var age_character: Int? = 0,

    @Column(name = "weight", columnDefinition = "decimal(10,2)")
    var weight_character: Double? = 0.0,

    @Column(nullable = false, name = "story", columnDefinition = "varchar(200)")
    var story_character: String = "Default Story",

    @CreatedDate
    @Column(nullable = false, updatable = false)
    @JsonIgnore
    var creation_date: LocalDate? = null,

    @LastModifiedDate
    @JsonIgnore
    var modified_date: LocalDate? = null,

    @Column(nullable = false, name = "available", columnDefinition = "tinyint(1)")
    var available_character: Boolean = true,

    @ManyToMany(mappedBy = "characters")
    @JsonIgnoreProperties("characters")
    var movies: List<Movie>? = null
    ) {
}