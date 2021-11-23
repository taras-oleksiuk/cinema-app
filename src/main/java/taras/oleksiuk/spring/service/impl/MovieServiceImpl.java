package taras.oleksiuk.spring.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import taras.oleksiuk.spring.dao.MovieDao;
import taras.oleksiuk.spring.exception.DataProcessingException;
import taras.oleksiuk.spring.model.Movie;
import taras.oleksiuk.spring.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {
    private final MovieDao movieDao;

    public MovieServiceImpl(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id).orElseThrow(
                () -> new DataProcessingException("Can't get movie by id " + id));
    }

    @Override
    public List<Movie> getAll() {
        return movieDao.getAll();
    }
}
