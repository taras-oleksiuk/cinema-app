package taras.oleksiuk.spring.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import taras.oleksiuk.spring.dao.AbstractDao;
import taras.oleksiuk.spring.dao.TicketDao;
import taras.oleksiuk.spring.model.Ticket;

@Repository
public class TicketDaoImpl extends AbstractDao<Ticket> implements TicketDao {
    public TicketDaoImpl(SessionFactory factory) {
        super(factory, Ticket.class);
    }
}
