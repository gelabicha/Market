package ge.softlab.market.controllers;

import ge.softlab.market.entities.Countries;
import ge.softlab.market.services.CountriesService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor



public class CountriesController {

    private final CountriesService countriesService;
     @GetMapping("countries")
    public List<Countries> search(String name, String name_geo, VarcharJdbcType iso_code_2){

        return countriesService.search(name, name_geo, iso_code_2);

    }

}
