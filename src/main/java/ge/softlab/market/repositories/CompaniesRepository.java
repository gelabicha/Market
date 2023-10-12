package ge.softlab.market.repositories;

import ge.softlab.market.entities.Companies;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompaniesRepository extends JpaRepository<Companies, Integer> {
List<Companies> findAllByName(String name);
}
