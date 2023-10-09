package ge.softlab.market.services;

import ge.softlab.market.entities.Companies;
import ge.softlab.market.repositories.CompaniesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompaniesServiceImpl implements CompaniesService {

    private final CompaniesRepository companiesRepository;
    @Override
    public List<Companies> search(String name, String nameGeo) {
        return companiesRepository.findAll();
    }
}
