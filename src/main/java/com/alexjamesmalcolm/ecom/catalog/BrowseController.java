package com.alexjamesmalcolm.ecom.catalog;

import java.util.Collection;
import java.util.Collections;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrowseController {
	
	@RequestMapping("/products")
	public void thing() {}

	public Collection<Product> getProducts() {
		return Collections.singleton(new Product());
	}
}
