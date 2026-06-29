package com.practice.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ProductRequest {

    @NotBlank(message="The productName must....")
    String productName;

    @NotBlank(message = "The product type must....")
    String productType;

    @NotNull(message = "The Product price must.....")
    Double price;

    @NotNull(message = "The product quantity must...")
    Integer quantity;

    Double rating;
}
