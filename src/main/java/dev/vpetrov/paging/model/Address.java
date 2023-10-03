package dev.vpetrov.paging.model;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class Address {

    @Id
    @GeneratedValue
    @NonNull
    private Integer id;

    @Column
    private final String address;

    @Column
    private final String city;

    @Column
    private final String state;

    @Column
    private final String zip;

}