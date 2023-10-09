package ge.softlab.market.services;

import ge.softlab.market.entities.Products;
import ge.softlab.market.repositories.ProductsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.core.SpringVersion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductsServiceImpl implements ProductsService {
    private final ProductsRepository productsRepository;
    @Override
    public List<Products> search(String name, String ean) {
        return productsRepository.findAll();
    }
}
