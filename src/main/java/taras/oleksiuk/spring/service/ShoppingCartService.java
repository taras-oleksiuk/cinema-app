package taras.oleksiuk.spring.service;

import taras.oleksiuk.spring.model.MovieSession;
import taras.oleksiuk.spring.model.ShoppingCart;
import taras.oleksiuk.spring.model.User;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}
