package web.dao;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Component
public interface UserDao {
    List<User> getListUser();

    User show(int id);

    void saveUser(User user);

    void updateUser(int id, User user);
    void deleteUser(int id);
}
