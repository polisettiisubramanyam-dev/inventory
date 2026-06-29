package com.practice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="supplier")
public class SupplierEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Integer id;

    @Column(name="supplier_name")
    String supplierName;

    String email;

    Long phoneNumber;

    @OneToMany(cascade = CascadeType.ALL)
    List<ProductEntity> products;
}
