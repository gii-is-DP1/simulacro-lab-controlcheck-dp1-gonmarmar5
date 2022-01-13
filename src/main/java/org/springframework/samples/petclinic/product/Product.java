package org.springframework.samples.petclinic.product;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue
    Integer id;

    @NotNull
    @Size(min=3,max=50)
    String name;

    @NotNull
    @Positive
    double price;

    @ManyToOne
    ProductType productType;
}
