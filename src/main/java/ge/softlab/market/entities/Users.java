package ge.softlab.market.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import javax.xml.validation.Schema;

@Entity
@Getter
@Setter
@Table(schema = "public", name = "users")
public class Users {
    @Id
    private Integer id;

    @Column(name = "email")
    private String email;


    @Column(name = "password")
    private String pasword;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;



}
