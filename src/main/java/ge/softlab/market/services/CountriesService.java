package ge.softlab.market.services;

import ge.softlab.market.entities.Countries;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;

import java.util.List;

public interface CountriesService {
    List<Countries> search(String name, String nameGeo, VarcharJdbcType isoCode2);
}
