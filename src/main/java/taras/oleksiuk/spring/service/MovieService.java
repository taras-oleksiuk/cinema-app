package taras.oleksiuk.spring.service;

import java.util.List;
import taras.oleksiuk.spring.model.Movie;

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);

    List<Movie> getAll();
}
