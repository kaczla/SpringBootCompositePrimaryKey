package pl.kaczla.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kaczla.app.model.User;
import pl.kaczla.app.model.UserPK;
import pl.kaczla.app.repository.UserRepositoryEM;

@Service
public class UserServiceEM {

    @Autowired
    UserRepositoryEM repository;

    public User findByKey(UserPK key) {
        if (key.valid()) {
            return null;
        }
        System.out.println(key.toString());
        return repository.findByKey(key);
    }

    public User insert(User user) {
        System.out.println(user.toString());
        return repository.save(user);
    }
}
