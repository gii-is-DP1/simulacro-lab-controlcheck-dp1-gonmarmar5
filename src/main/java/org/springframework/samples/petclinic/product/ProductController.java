package org.springframework.samples.petclinic.product;

import java.security.Principal;
import java.util.Map;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

public class ProductController {

    @GetMapping(value = "/product/create")
	public String initCreationForm(Map<String, Object> model,Principal principal) {
		return "createOrUpdateProductForm";
	}
    
}
