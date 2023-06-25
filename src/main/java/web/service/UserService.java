package web.service;

import org.springframework.stereotype.Service;
import web.model.User;

import java.util.List;
@Service
public interface UserService {
    List<User> getListUsers();

    User show(int id);

    void saveUser(User user);

    void updateUser(int id, User user);

    void deleteUser(int id);
}
