package ge.softlab.market.repositories;

import ge.softlab.market.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<ge.softlab.market.entities.Users, Integer> {
    Optional<Users> findAllByEmail(String email);
}
