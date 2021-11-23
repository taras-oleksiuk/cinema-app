package taras.oleksiuk.spring.service.impl;

import org.springframework.stereotype.Service;
import taras.oleksiuk.spring.dao.RoleDao;
import taras.oleksiuk.spring.model.Role;
import taras.oleksiuk.spring.service.RoleService;

@Service
public class RoleServiceImp implements RoleService {
    private final RoleDao roleDao;

    public RoleServiceImp(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role add(Role role) {
        roleDao.add(role);
        return role;
    }

    @Override
    public Role getRoleByName(Role.RoleName roleName) {
        return roleDao.getRoleByName(roleName).get();
    }
}
