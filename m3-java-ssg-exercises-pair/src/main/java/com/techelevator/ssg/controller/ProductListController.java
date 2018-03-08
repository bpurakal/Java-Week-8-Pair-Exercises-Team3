package com.techelevator.ssg.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.ssg.model.store.Product;
import com.techelevator.ssg.model.store.ProductDao;

@Controller
public class ProductListController {
	
	@Autowired
	ProductDao productDao;

	@RequestMapping(path="/shoppingCart/index", method=RequestMethod.GET)
	public String displayProductList(ModelMap mh) {
		mh.put("products", productDao.getAllProducts());
		return "productList";
	}
	
	@RequestMapping(path="/shoppingCart/detail/", method=RequestMethod.GET)
	public String displayProductDetail(@RequestParam Long id, ModelMap mh) {
		for (Product p : productDao.getAllProducts()) {
			if(p.getId().equals(id)) {
					mh.put("product", p);
				}
			}
			
		return "productDetail";
	}
	
	@RequestMapping(path="/shoppingCart/addToCart/", method=RequestMethod.POST)
	public String addToCart(@ModelAttribute("id") Long id, /*@ModelAttribute("quantity") int quantity,*/ HttpSession session) {
		//input type = hidden field, use id to find item and then update quantity associated with product
		Product selectedProduct = productDao.getProductById(id);
		
		Map<Product, Long> shoppingCart = new HashMap<>();
		
		if(session.getAttribute("shoppingCart") != null) {
			shoppingCart = (Map<Product, Long>)session.getAttribute("shoppingCart");
		} else {
			shoppingCart = new HashMap<>();
		}
		
		if(shoppingCart.containsKey(selectedProduct)) {
			Long quantity = shoppingCart.get(selectedProduct);
			quantity++;
			shoppingCart.put(selectedProduct, quantity);
		} else {
			shoppingCart.put(selectedProduct, 1L);
		}
		
		session.setAttribute("shoppingCart", shoppingCart);
		
		return "redirect:/productDetail";
	}
	
	@RequestMapping(path="/shoppingCart/view", method=RequestMethod.GET)
	public String displayShoppingCart() {
		return "shoppingCart";
	}
	
	

	

}
