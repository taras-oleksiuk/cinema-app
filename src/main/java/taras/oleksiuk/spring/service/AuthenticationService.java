package taras.oleksiuk.spring.service;

import taras.oleksiuk.spring.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
