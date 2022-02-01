package alkemy.movies.model

import org.hibernate.annotations.SQLDelete
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDate
import javax.persistence.*

@Entity
@EntityListeners(AuditingEntityListener::class)
@SQLDelete(sql = "UPDATE Genre g SET g.available = false WHERE g.id = ?")
@Table(name = "genres", schema = "disney_movies")
class Genre (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    val id_genre: Long? = null,

    @Column(nullable = false, name = "name", columnDefinition = "varchar(50)")
    var name_genre: String = "Default Name",

    @CreatedDate
    var creation_date: LocalDate? = null,

    @LastModifiedDate
    var modified_date: LocalDate? = null,

    @Column(nullable = false, name = "available", columnDefinition = "tinyint(1)")
    var available_genre: Boolean = true,

    @OneToMany(mappedBy = "genre")
    var movies: List<Movie>? = null
    ) {
}