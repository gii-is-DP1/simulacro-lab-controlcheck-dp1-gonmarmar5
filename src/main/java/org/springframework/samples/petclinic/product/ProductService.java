package org.springframework.samples.petclinic.product;

import java.util.List;

public class ProductService {
     ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return this.productRepository.findAll();
    }

    public List<Product> getProductsCheaperThan(double price) {
        return null;
    }

    public ProductType getProductType(String typeName) {
        return null;
    }

    public Product save(Product p){
        return null;       
    }

    
}
