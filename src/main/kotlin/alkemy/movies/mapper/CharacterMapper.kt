package alkemy.movies.mapper

import alkemy.movies.dto.CharacterDTO
import alkemy.movies.model.Character
import org.springframework.stereotype.Component

@Component("characterMapper")
class CharacterMapper : AbstractMapper<CharacterDTO, Character> {
    override fun toEntity(dto: CharacterDTO) = Character (
        id_character = dto.id_character,
        name_character = dto.name_character,
        age_character = dto.age_character,
        weight_character = dto.weight_character,
        story_character = dto.story_character,
        available_character = dto.available_character,
        movies = null //MovieMapper.toEntity(dto.movies)
    )

    override fun toDto(entity: Character) = CharacterDTO (
        id_character = entity.id_character,
        name_character = entity.name_character,
        age_character = entity.age_character,
        weight_character = entity.weight_character,
        story_character = entity.story_character,
        available_character = entity.available_character,
        movies = null //MovieMapper.toDto(entity.movies)
    )
}