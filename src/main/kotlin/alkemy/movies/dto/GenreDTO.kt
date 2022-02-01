package alkemy.movies.dto


data class GenreDTO (
    val id_genre: Long? = null,
    var name_genre: String = "DTO Name",
    var available_genre: Boolean = true,
    var movies: List<MovieDTO>? = null
)