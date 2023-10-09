package ge.softlab.market.repositories;

import ge.softlab.market.entities.Companies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompaniesRepository extends JpaRepository<Companies, Integer> {
}
