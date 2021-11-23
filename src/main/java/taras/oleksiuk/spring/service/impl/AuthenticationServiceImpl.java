package taras.oleksiuk.spring.service.impl;

import java.util.Set;
import org.springframework.stereotype.Service;
import taras.oleksiuk.spring.model.Role;
import taras.oleksiuk.spring.model.User;
import taras.oleksiuk.spring.service.AuthenticationService;
import taras.oleksiuk.spring.service.RoleService;
import taras.oleksiuk.spring.service.ShoppingCartService;
import taras.oleksiuk.spring.service.UserService;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserService userService;
    private final ShoppingCartService shoppingCartService;
    private final RoleService roleService;

    public AuthenticationServiceImpl(UserService userService,
                                     ShoppingCartService shoppingCartService,
                                     RoleService roleService) {
        this.userService = userService;
        this.shoppingCartService = shoppingCartService;
        this.roleService = roleService;
    }

    @Override
    public User register(String email, String password) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        Role roleByName = roleService.getRoleByName(Role.RoleName.USER);
        user.setRoles(Set.of(roleByName));
        userService.add(user);
        shoppingCartService.registerNewShoppingCart(user);
        return user;
    }
}
