package alkemy.movies.dto

import java.time.LocalDate

data class MovieDTO (
    val id_movie: Long? = null,
    var title_movie: String = "DTO Title",
    var release_movie: LocalDate = LocalDate.now(),
    var score_movie: Int = 0,
    var genre: GenreDTO? = GenreDTO(),
    var available_movie: Boolean = true,
    var characters: List<CharacterDTO>? = null
)