package ge.softlab.market.services;

import ge.softlab.market.entities.Companies;
import ge.softlab.market.entities.Products;
import ge.softlab.market.repositories.CompaniesRepository;
import ge.softlab.market.repositories.ProductsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompaniesServiceImpl implements CompaniesService {

    private final CompaniesRepository companiesRepository;
    private final ProductsRepository productsRepository;
    @Override
    public List<Companies> search(String name, String name_geo) {
        return companiesRepository.findAllByName(name);
    }


    public Companies getCompanies(Integer id) {
        return companiesRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Products> getCompaniesProducts(Integer id) {
      return productsRepository.findAllByCompanyId(id);
    }



}
