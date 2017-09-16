package pl.kaczla.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.kaczla.app.model.User;
import pl.kaczla.app.model.UserPK;

@Repository
public interface UserRepository extends CrudRepository<User, UserPK> {

    User findByIdAndAndType(Long id, String type);
}
