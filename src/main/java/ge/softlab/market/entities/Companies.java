package ge.softlab.market.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Entity
@Getter
@Setter
@Table(schema = "public", name = "companies")
public class Companies {
    @Id
    private Integer id;

    @Column(name = "parent_id")
    private Integer parent_id;

    @Column(name = "country_id")
    private Integer country_id;

    @Column(name = "name")
    private String name;

    @Column(name = "name_geo")
    private String name_geo;


}
