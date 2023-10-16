package ge.softlab.market.services;

import ge.softlab.market.entities.Products;
import ge.softlab.market.models.ProductsCreateModel;

import java.util.List;

public interface ProductsService {
    List<Products> search(String name, String ean);

    Products productsCreateNew(ProductsCreateModel productsCreateModel);
}
