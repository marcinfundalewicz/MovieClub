package pl.javastart.movieclub.domain.genre;

import pl.javastart.movieclub.domain.genre.dto.GenreDto;

public class GenreDtoMapper {

    public static GenreDto map(Genre genre) {
        return new GenreDto(
                genre.getId(),
                genre.getName(),
                genre.getDescription()
        );
    }
}
