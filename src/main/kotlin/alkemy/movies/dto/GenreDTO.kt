package alkemy.movies.dto

import io.swagger.v3.oas.annotations.media.Schema
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

@Schema(name = "Genre", description = "A genre object")
data class GenreDTO (
    @field:Schema(
        description = "The genre id",
        example = "3",
        required = false
    )
    val id_genre: Long? = null,

    @field:Schema(
        description = "The genre name",
        example = "A name",
        required = true
    )
    @field:NotNull
    @field:NotEmpty
    var name_genre: String = "DTO Name",

    @field:Schema(
        description = "The genre available",
        example = "true",
        required = true
    )
    @field:NotNull
    @field:NotEmpty
    var available_genre: Boolean = true,

    @field:Schema(
        description = "The genre movie list",
        example = "Movies: {Movie1, Movie2, Movie3}",
        required = false
    )
    var movies: List<MovieDTO>? = null
)