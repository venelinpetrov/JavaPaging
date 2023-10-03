package dev.vpetrov.paging.model;


import io.micrometer.common.lang.NonNull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class Person {

    @Id
    @GeneratedValue
    @NonNull
    private Integer id;

    @Column
    private final String firstName;

    @Column
    private final String lastName;

    @Column
    private final String phoneNumber;

    @Column
    private final String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private final Address address;

}
