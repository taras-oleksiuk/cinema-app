package taras.oleksiuk.spring.service;

import java.util.List;
import taras.oleksiuk.spring.model.Order;
import taras.oleksiuk.spring.model.ShoppingCart;
import taras.oleksiuk.spring.model.User;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
