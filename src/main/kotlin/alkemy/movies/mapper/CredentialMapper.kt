package alkemy.movies.mapper

import alkemy.movies.dto.CredentialDTO
import alkemy.movies.model.Credential
import org.springframework.stereotype.Component

@Component("credentialMapper")
class CredentialMapper : AbstractMapper<CredentialDTO, Credential> {
    override fun toEntity(dto: CredentialDTO) = Credential (
        id_credential = dto.id_credential,
        username_credential = dto.username_credential,
        email_credential = dto.email_credential,
        password_credential = dto.password_credential,
        available_credential = dto.available_credential
    )

    override fun toDto(entity: Credential) = CredentialDTO (
        id_credential = entity.id_credential,
        username_credential = entity.username_credential,
        email_credential = entity.email_credential,
        password_credential = entity.password_credential,
        available_credential = entity.available_credential
    )
}