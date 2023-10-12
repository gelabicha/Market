package ge.softlab.market.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<ge.softlab.market.entities.Users, Integer> {
}
