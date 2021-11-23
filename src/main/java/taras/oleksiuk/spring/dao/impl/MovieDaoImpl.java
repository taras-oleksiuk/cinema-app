package taras.oleksiuk.spring.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import taras.oleksiuk.spring.dao.AbstractDao;
import taras.oleksiuk.spring.dao.MovieDao;
import taras.oleksiuk.spring.model.Movie;

@Repository
public class MovieDaoImpl extends AbstractDao<Movie> implements MovieDao {
    public MovieDaoImpl(SessionFactory factory) {
        super(factory, Movie.class);
    }
}
