package taras.oleksiuk.spring.dao;

import java.util.List;
import taras.oleksiuk.spring.model.Order;
import taras.oleksiuk.spring.model.User;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
