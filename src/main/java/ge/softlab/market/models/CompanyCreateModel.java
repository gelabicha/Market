package ge.softlab.market.models;

import java.time.LocalDateTime;

public record CompanyCreateModel(Integer parentId, Integer countryId, String name, String nameGeo, LocalDateTime createdat) {
}
