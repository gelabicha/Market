package ge.softlab.market.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import javax.xml.validation.Schema;

@Entity
@Getter
@Setter
@Table(schema = "public", name = "products")
public class Products {
    @Id
    private Integer id;

    @Column(name = "ean")
    private String ean;

    @Column(name = "name")
    private String pname;

    @Column(name = "company_id")
    private Integer companyId;

    @Column(name = "country_id")
    private Integer country_id;

    @Column(name = "description")
    private String description;
}
