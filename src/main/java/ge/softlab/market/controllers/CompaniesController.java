package ge.softlab.market.controllers;

import ge.softlab.market.entities.Companies;
import ge.softlab.market.entities.Countries;
import ge.softlab.market.entities.Products;
import ge.softlab.market.models.CompanyCreateModel;
import ge.softlab.market.repositories.ProductsRepository;
import ge.softlab.market.services.CompaniesService;
import ge.softlab.market.services.CountriesService;
import lombok.RequiredArgsConstructor;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class CompaniesController {
    private final CompaniesService companiesService;


    @GetMapping("companies")
    public List<Companies> search(String name, String name_geo) {

        return companiesService.search(name, name_geo);
    }

    @GetMapping("companies/{id}")
    public Companies companies(@PathVariable Integer id){
        return companiesService.getCompanies(id);
    }

    @GetMapping("companies/{id}/products")
    public List<Products> companiesProducts(@PathVariable Integer id){
        return companiesService.getCompaniesProducts(id);
    }
    @PostMapping("companies")
    public Companies companiesCreateNew(@RequestBody CompanyCreateModel companyCreateModel){
        return companiesService.companiesCreateNew(companyCreateModel);
    }


}