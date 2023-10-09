package ge.softlab.market.services;

import ge.softlab.market.entities.Companies;
import ge.softlab.market.entities.Countries;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;

import java.util.List;

public interface CompaniesService {

    List<Companies> search(String name, String nameGeo);
}
