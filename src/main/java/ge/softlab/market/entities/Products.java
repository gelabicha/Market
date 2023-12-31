package ge.softlab.market.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import javax.xml.validation.Schema;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(schema = "public", name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="products_seq_generation")
    @SequenceGenerator(name="products_seq_generation", sequenceName="products_id_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "ean")
    private String ean;

    @Column(name = "name")
    private String name;

    @Column(name = "company_id")
    private Integer companyId;

    @Column(name = "country_id")
    private Integer countryId;

    @Column(name = "description")
    private String description;

    @Column(name = "created_at")
    private LocalDateTime craetedAt;
}
