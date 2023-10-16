package ge.softlab.market.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(schema = "public", name = "companies")
public class Companies {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="companies_seq_generation")
    @SequenceGenerator(name="companies_seq_generation", sequenceName="companies_id_seq", allocationSize = 1)

    private Integer id;

    @Column(name = "parent_id")
    private Integer parentid;

    @Column(name = "country_id")
    private Integer countryid;

    @Column(name = "name")
    private String name;

    @Column(name = "name_geo")
    private String namegeo;

    @Column (name = "created_at")
    private LocalDateTime createdat;
}
