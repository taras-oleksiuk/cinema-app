package taras.oleksiuk.spring.service;

import java.util.List;
import taras.oleksiuk.spring.model.CinemaHall;

public interface CinemaHallService {
    CinemaHall add(CinemaHall cinemaHall);

    CinemaHall get(Long id);

    List<CinemaHall> getAll();
}
