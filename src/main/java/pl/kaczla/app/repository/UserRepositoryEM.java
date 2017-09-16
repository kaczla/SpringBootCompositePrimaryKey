package pl.kaczla.app.repository;

import org.springframework.stereotype.Repository;
import pl.kaczla.app.model.User;
import pl.kaczla.app.model.UserPK;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserRepositoryEM {

    @PersistenceContext
    private EntityManager entityManager;

    public User findByKey(UserPK key) {
        return entityManager.find(User.class, key);
    }

    public User save(User user) {
        entityManager.persist(user);
        entityManager.flush();
        return user;
    }
}
