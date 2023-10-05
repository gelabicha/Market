package ge.softlab.market.services;

import ge.softlab.market.entities.Countries;
import ge.softlab.market.repositories.CountriesRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CountriesServiceImpl implements CountriesService {

    private final CountriesRepository countriesRepository;
    @Override
    public List<Countries> search(String name, String nameGeo, VarcharJdbcType isoCode2) {
        return countriesRepository.findAll();
    }
}
