package ge.softlab.market.services;

import ge.softlab.market.entities.Products;

import java.util.List;

public interface ProductsService {
    List<Products> search(String pname, String ean);
}
