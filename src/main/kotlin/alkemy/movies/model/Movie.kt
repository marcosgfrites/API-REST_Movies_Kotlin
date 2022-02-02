package alkemy.movies.model

import com.fasterxml.jackson.annotation.JsonIgnore
import org.hibernate.annotations.SQLDelete
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDate
import javax.persistence.*

@Entity
@EntityListeners(AuditingEntityListener::class)
@SQLDelete(sql = "UPDATE Movie m SET m.available = false WHERE m.id = ?")
@Table(name = "movies", schema = "disney_movies")
class Movie (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "bigint")
    val id_movie: Long? = null,

    @Column(nullable = false, name = "title", columnDefinition = "varchar(50)")
    var title_movie: String = "Default Title",

    @Column(nullable = false, name = "release_date", columnDefinition = "date")
    var release_movie: LocalDate = LocalDate.now(),

    @Column(nullable = false, name = "score", columnDefinition = "int")
    var score_movie: Int = 0,

    @CreatedDate
    @Column(nullable = false, updatable = false)
    @JsonIgnore
    var creation_date: LocalDate? = null,

    @LastModifiedDate
    @JsonIgnore
    var modified_date: LocalDate? = null,

    @ManyToOne
    @JoinColumn(name = "genre")
    var genre: Genre? = Genre(),

    @Column(nullable = false, name = "available", columnDefinition = "tinyint(1)")
    var available_movie: Boolean = true,

    @JoinTable(name = "movies_characters",
        joinColumns = [JoinColumn(name = "FK_MOVIE")],
        inverseJoinColumns = [JoinColumn(name = "FK_CHARACTER")])
    @ManyToMany(cascade = [CascadeType.ALL])
    var characters: List<Character>? = null
    ) {
}