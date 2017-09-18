package pl.kaczla.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kaczla.app.model.User;
import pl.kaczla.app.model.UserPK;
import pl.kaczla.app.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public User findByKey(UserPK key) {
        if (key.valid()) {
            return null;
        }
        System.out.println(key.toString());
        return repository.findByUserPK(key);
    }

    public Iterable<User> findAll() {
        return repository.findAll();
    }

    public User insert(User user) {
        System.out.println(user.toString());
        return repository.save(user);
    }
}
