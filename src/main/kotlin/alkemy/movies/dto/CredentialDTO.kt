package alkemy.movies.dto

import io.swagger.v3.oas.annotations.media.Schema
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

@Schema(name = "Credential", description = "A credential object")
data class CredentialDTO (
    @field:Schema(
        description = "The credential id",
        example = "3",
        required = false
    )
    val id_credential: Long? = null,

    @field:Schema(
        description = "The credential username",
        example = "A username",
        required = true
    )
    @field:NotNull
    @field:NotEmpty
    var username_credential: String = "DTO Username",

    @field:Schema(
        description = "The credential email",
        example = "A email",
        required = true
    )
    @field:NotNull
    @field:NotEmpty
    var email_credential: String = "DTO Email",

    @field:Schema(
        description = "The credential password",
        example = "A password",
        required = true
    )
    @field:NotNull
    @field:NotEmpty
    var password_credential: String = "DTO Password",

    @field:Schema(
        description = "The crededntial available",
        example = "true",
        required = true
    )
    @field:NotNull
    @field:NotEmpty
    var available_credential: Boolean = true
)