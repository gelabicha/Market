package ge.softlab.market.controllers;

import ge.softlab.market.entities.Products;
import ge.softlab.market.services.ProductsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor


public class ProductsController {
    private final ProductsService productsService;

    @GetMapping("products")
    public List<Products>search(String name, String ean){
        return productsService.search(name,ean);
    }
}
