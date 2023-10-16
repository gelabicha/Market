package ge.softlab.market.services;

import ge.softlab.market.entities.Products;
import ge.softlab.market.models.ProductsCreateModel;
import ge.softlab.market.repositories.ProductsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.core.SpringVersion;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductsServiceImpl implements ProductsService {
    private final ProductsRepository productsRepository;
    @Override
    public List<Products> search(String name, String ean) {
        List<Products> allByPname = productsRepository.findAllByname(name);
        return allByPname;
    }

    @Override
    public Products productsCreateNew(ProductsCreateModel productsCreateModel) {
        Products products = new Products();
        products.setEan(productsCreateModel.ean());
        products.setName(productsCreateModel.name());
        products.setCompanyId(productsCreateModel.companyId());
        products.setCountryId(productsCreateModel.countryId());
        products.setDescription(productsCreateModel.description());
        products.setCraetedAt(LocalDateTime.now());
        productsRepository.save(products);
        return products;
    }

    public List<Products> search(String ean){
        return productsRepository.findAllByEan(ean);
    }
}
