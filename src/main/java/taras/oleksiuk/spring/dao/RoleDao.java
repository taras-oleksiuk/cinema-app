package taras.oleksiuk.spring.dao;

import java.util.Optional;
import taras.oleksiuk.spring.model.Role;

public interface RoleDao {
    Role add(Role role);

    Optional<Role> getRoleByName(Role.RoleName roleName);
}
