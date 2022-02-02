package alkemy.movies.dto

import io.swagger.v3.oas.annotations.media.Schema
import javax.validation.constraints.Max
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

@Schema(name = "Character", description = "A character object")
data class CharacterDTO (
    @field:Schema(
        description = "The character id",
        example = "3",
        required = false
    )
    val id_character: Long? = null,

    @field:Schema(
        description = "The character name",
        example = "A name",
        required = true
    )
    @field:NotNull
    @field:NotEmpty
    var name_character: String = "DTO Name",

    @field:Schema(
        description = "The character age",
        example = "65",
        required = false
    )
    @field:Max(200)
    var age_character: Int? = 0,

    @field:Schema(
        description = "The character weight",
        example = "65",
        required = false
    )
    @field:Max(1000)
    var weight_character: Double? = 0.0,

    @field:Schema(
        description = "The character story",
        example = "A simple example of story",
        required = true
    )
    @field:NotNull
    @field:NotEmpty
    var story_character: String = "DTO Story",

    @field:Schema(
        description = "The character available",
        example = "true",
        required = true
    )
    @field:NotNull
    @field:NotEmpty
    var available_character: Boolean = true,

    @field:Schema(
        description = "The character movie list",
        example = "Movies: {Movie1, Movie2, Movie3}",
        required = false
    )
    var movies: List<MovieDTO>? = null
)