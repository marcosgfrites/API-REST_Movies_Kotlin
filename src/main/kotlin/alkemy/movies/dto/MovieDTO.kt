package alkemy.movies.dto

import io.swagger.v3.oas.annotations.media.Schema
import java.time.LocalDate
import javax.validation.constraints.Max
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

@Schema(name = "Movie", description = "A movie object")
data class MovieDTO (
    @field:Schema(
        description = "The movie id",
        example = "3",
        required = false
    )
    val id_movie: Long? = null,

    @field:Schema(
        description = "The movie title",
        example = "A title",
        required = true
    )
    @field:NotNull
    @field:NotEmpty
    var title_movie: String = "DTO Title",

    @field:Schema(
        description = "The movie release",
        example = "2022-02-02",
        required = true
    )
    @field:NotNull
    @field:NotEmpty
    var release_movie: LocalDate = LocalDate.now(),

    @field:Schema(
        description = "The movie score",
        example = "5",
        required = true
    )
    @field:NotNull
    @field:Max(5)
    var score_movie: Int = 0,

    @field:Schema(
        description = "The movie genre",
        example = "A genre",
        required = false
    )
    var genre: GenreDTO? = GenreDTO(),

    @field:Schema(
        description = "The movie available",
        example = "true",
        required = true
    )
    @field:NotNull
    @field:NotEmpty
    var available_movie: Boolean = true,

    @field:Schema(
        description = "The movie character list",
        example = "Characters: {Character1, Character2, Character3}",
        required = false
    )
    var characters: List<CharacterDTO>? = null
)