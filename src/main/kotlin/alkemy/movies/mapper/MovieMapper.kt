package alkemy.movies.mapper

import alkemy.movies.dto.MovieDTO
import alkemy.movies.model.Movie
import org.springframework.stereotype.Component

@Component("movieMapper")
class MovieMapper : AbstractMapper<MovieDTO, Movie> {
    override fun toEntity(dto: MovieDTO) = Movie (
        id_movie = dto.id_movie,
        title_movie = dto.title_movie,
        release_movie = dto.release_movie,
        score_movie = dto.score_movie,
        genre = null, //GenreMapper.toEntity(dto.genre),
        available_movie = dto.available_movie,
        characters = null //CharacterMapper.toEntity(dto.movies)
    )

    override fun toDto(entity: Movie) = MovieDTO (
        id_movie = entity.id_movie,
        title_movie = entity.title_movie,
        release_movie = entity.release_movie,
        score_movie = entity.score_movie,
        genre = null, //GenreMapper.toDto(entity.genre),
        available_movie = entity.available_movie,
        characters = null //CharacterMapper.toDto(entity.movies)
    )

}