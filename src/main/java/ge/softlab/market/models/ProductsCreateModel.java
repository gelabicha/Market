package ge.softlab.market.models;

import java.time.LocalDateTime;

public record ProductsCreateModel(String ean, String name, Integer companyId, Integer countryId, String description, LocalDateTime createdAt) {
}
