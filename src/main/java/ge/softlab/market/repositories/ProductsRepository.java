package ge.softlab.market.repositories;

import ge.softlab.market.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products,Integer> {
}
