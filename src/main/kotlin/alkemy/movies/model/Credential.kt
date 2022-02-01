package alkemy.movies.model

import org.hibernate.annotations.SQLDelete
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDate
import javax.persistence.*

@Entity
@EntityListeners(AuditingEntityListener::class)
@SQLDelete(sql = "UPDATE Credential c SET c.available = false WHERE c.id = ?")
@Table(name = "credentials", schema = "disney_movies")
class Credential (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    val id_credential: Long? = null,

    @Column(nullable = false, name = "username")
    var username_credential: String = "Default Username",

    @Column(nullable = false, name = "email")
    var email_credential: String = "Default Email",

    @Column(nullable = false, name = "password")
    var password_credential: String = "Default Password",

    @CreatedDate
    var creation_date: LocalDate? = null,

    @LastModifiedDate
    var modified_date: LocalDate? = null,

    @Column(nullable = false, name = "available", columnDefinition = "tinyint(1)")
    var available_credential: Boolean = true
    ) {
}