package ge.softlab.market.services;

import ge.softlab.market.entities.Companies;
import ge.softlab.market.entities.Products;
import ge.softlab.market.models.CompanyCreateModel;

import java.util.List;

public interface CompaniesService {

    List<Companies> search(String name, String nameGeo);
    Companies getCompanies(Integer id);


     List<Products> getCompaniesProducts(Integer id);

    Companies companiesCreateNew(CompanyCreateModel companyCreateModel);
}
