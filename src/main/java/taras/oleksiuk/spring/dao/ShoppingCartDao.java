package taras.oleksiuk.spring.dao;

import taras.oleksiuk.spring.model.ShoppingCart;
import taras.oleksiuk.spring.model.User;

public interface ShoppingCartDao {
    ShoppingCart add(ShoppingCart shoppingCart);

    ShoppingCart getByUser(User user);

    ShoppingCart update(ShoppingCart shoppingCart);
}
