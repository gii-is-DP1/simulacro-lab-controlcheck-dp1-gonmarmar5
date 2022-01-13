package org.springframework.samples.petclinic.product;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.mapping.PrimaryKey;
import org.springframework.context.annotation.Primary;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "productTypes")
public class ProductType {
    @Id
    @GeneratedValue
    Integer id;

    @Size(min=3,max=50)
    @Column(unique = true)
    String name;
}
