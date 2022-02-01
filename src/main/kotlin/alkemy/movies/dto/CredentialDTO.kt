package alkemy.movies.dto


data class CredentialDTO (
    val id_credential: Long? = null,
    var username_credential: String = "DTO Username",
    var email_credential: String = "DTO Email",
    var password_credential: String = "DTO Password",
    var available_credential: Boolean = true
)