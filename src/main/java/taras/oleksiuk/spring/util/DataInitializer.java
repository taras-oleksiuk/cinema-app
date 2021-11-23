package taras.oleksiuk.spring.util;

import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import taras.oleksiuk.spring.model.Role;
import taras.oleksiuk.spring.model.User;
import taras.oleksiuk.spring.service.AuthenticationService;
import taras.oleksiuk.spring.service.RoleService;
import taras.oleksiuk.spring.service.UserService;

@Component
public class DataInitializer {
    private final AuthenticationService authenticationService;
    private final RoleService roleService;
    private final UserService userService;

    public DataInitializer(AuthenticationService authenticationService,
                           RoleService roleService,
                           UserService userService) {
        this.authenticationService = authenticationService;
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        Role userRole = roleService.add(new Role(Role.RoleName.USER));
        authenticationService.register("admin@gmail.com", "admin123");
        Role adminRole = roleService.add(new Role(Role.RoleName.ADMIN));
        User admin = new User();
        admin.setEmail("user@gmail.com");
        admin.setPassword("user123 ");
        admin.setRoles(Set.of(adminRole));
        userService.add(admin);
    }
}
