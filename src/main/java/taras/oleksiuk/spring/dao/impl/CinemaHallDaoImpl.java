package taras.oleksiuk.spring.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import taras.oleksiuk.spring.dao.AbstractDao;
import taras.oleksiuk.spring.dao.CinemaHallDao;
import taras.oleksiuk.spring.model.CinemaHall;

@Repository
public class CinemaHallDaoImpl extends AbstractDao<CinemaHall> implements CinemaHallDao {
    public CinemaHallDaoImpl(SessionFactory factory) {
        super(factory, CinemaHall.class);
    }
}
