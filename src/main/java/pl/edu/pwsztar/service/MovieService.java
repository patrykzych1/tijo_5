package pl.edu.pwsztar.service;

import pl.edu.pwsztar.Exceptions.MovieNotFoundException;
import pl.edu.pwsztar.domain.dto.CreateMovieDto;
import pl.edu.pwsztar.domain.dto.MovieDto;

import java.util.List;

public interface MovieService {

    List<MovieDto> findAll();

    void creatMovie(CreateMovieDto createMovieDto);

    void deleteMovie(Long movieId) throws MovieNotFoundException;
}
