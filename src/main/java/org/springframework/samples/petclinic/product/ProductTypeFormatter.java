package org.springframework.samples.petclinic.product;

import java.text.ParseException;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

@Component
public class ProductTypeFormatter implements Formatter<ProductType>{

    @Autowired
    ProductRepository productRepository;
    
    @Override
    public String print(ProductType object, Locale locale) {
        
        // El formatter debe mostrar los productos usando la cadena de su nombre, y debe obtener un tipo de
        // producto dado su nombre buscándolo en la BD. Recuerde que si el formatter no puede parsear un valor
        // apropiado a partir del texto proporcionado, debe lanzar una excepción de tipo ParseException.
        return object.getName();
    }

    @Override
    public ProductType parse(String text, Locale locale) throws ParseException {
        
        for (ProductType pt : this.productRepository.findAllProductTypes()){
            if(pt.getName().equals(text))
                return pt;
        }
        throw new ParseException("No se encuentra el tipo : "+text, 0);
       

    }
    
}
