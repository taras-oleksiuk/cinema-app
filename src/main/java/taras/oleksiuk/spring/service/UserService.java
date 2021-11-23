package taras.oleksiuk.spring.service;

import java.util.Optional;
import taras.oleksiuk.spring.model.User;

public interface UserService {
    User add(User user);

    User get(Long id);

    Optional<User> findByEmail(String email);
}
