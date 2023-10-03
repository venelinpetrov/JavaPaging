package dev.vpetrov.paging.model;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue
    @NonNull
    private Integer id;

    @Column
    @NonNull
    private String address;

    @Column
    @NonNull
    private String city;

    @Column
    @NonNull
    private String state;

    @Column
    @NonNull
    private String zip;

}