package recuiter.recuiterplatform.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import recuiter.recuiterplatform.models.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    public Optional<User> findUserByEmail(String email);
}
