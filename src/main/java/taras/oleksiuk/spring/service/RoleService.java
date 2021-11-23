package taras.oleksiuk.spring.service;

import taras.oleksiuk.spring.model.Role;

public interface RoleService {
    Role add(Role role);
  
    Role getRoleByName(Role.RoleName roleName);
}
