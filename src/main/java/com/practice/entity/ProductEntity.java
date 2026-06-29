package com.practice.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Integer id;

    @Column(name="product_name")
    String productName;

    @Column(name="product_type")
    String productType;

    @Column(name="price")
    Double price;

    Integer quantity;

    Double rating;

    @ManyToOne
    @JoinColumn(name="suppiler_id")
    @JsonIgnore
    SupplierEntity supplier;
}
