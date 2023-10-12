package ge.softlab.market.repositories;

import ge.softlab.market.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductsRepository extends JpaRepository<Products,Integer> {
    List<Products> findAllByCompanyId(Integer company_id);
    List<Products> findAllByPname(String pname);

    List<Products> findAllByEan(String ean);
}
