package alkemy.movies.dto


data class CharacterDTO (
    val id_character: Long? = null,
    var name_character: String = "DTO Name",
    var age_character: Int? = 0,
    var weight_character: Double? = 0.0,
    var story_character: String = "DTO Story",
    var available_character: Boolean = true,
    var movies: List<MovieDTO>? = null
)