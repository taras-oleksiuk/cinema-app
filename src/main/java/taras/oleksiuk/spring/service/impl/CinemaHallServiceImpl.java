package taras.oleksiuk.spring.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import taras.oleksiuk.spring.dao.CinemaHallDao;
import taras.oleksiuk.spring.exception.DataProcessingException;
import taras.oleksiuk.spring.model.CinemaHall;
import taras.oleksiuk.spring.service.CinemaHallService;

@Service
public class CinemaHallServiceImpl implements CinemaHallService {
    private final CinemaHallDao cinemaHallDao;

    public CinemaHallServiceImpl(CinemaHallDao cinemaHallDao) {
        this.cinemaHallDao = cinemaHallDao;
    }

    @Override
    public CinemaHall add(CinemaHall cinemaHall) {
        return cinemaHallDao.add(cinemaHall);
    }

    @Override
    public CinemaHall get(Long id) {
        return cinemaHallDao.get(id).orElseThrow(
                () -> new DataProcessingException("Can't get cinema hall by id " + id));
    }

    @Override
    public List<CinemaHall> getAll() {
        return cinemaHallDao.getAll();
    }
}
