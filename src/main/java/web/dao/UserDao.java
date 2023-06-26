package web.dao;


import org.springframework.stereotype.Component;
import web.model.User;

import java.util.List;
@Component
public interface UserDao {
    List<User> getListUser();

    User show(Long id);

    void saveUser(User user);

    void updateUser(User user);
    void deleteUser(Long id);
}
