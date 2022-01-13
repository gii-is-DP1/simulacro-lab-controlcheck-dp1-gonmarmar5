package org.springframework.samples.petclinic.product;

import java.security.Principal;
import java.util.Collection;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class ProductController {
	@Autowired
	ProductRepository productRepository;

	@Autowired
	ProductService productService;
    
	@PostMapping(path = "/product/created")
	public String processCreatingProduct(@Valid Product p, BindingResult result, Map<String, Object> model){
		if(result.hasErrors()){
			model.put("productType", this.productRepository.findAllNameProductTypes());
			return "products/createOrUpdateProductForm";
		}
		else{
			productService.save(p);
			model.put("message", "Producto añadido");
		}

		return "welcome";
	}

	@GetMapping({"/product/create"})
	public String initCreationForm(Map<String, Object> model,Principal principal) {
		model.put("productType", this.productRepository.findAllNameProductTypes());
		return "products/createOrUpdateProductForm";
	}
    
}
