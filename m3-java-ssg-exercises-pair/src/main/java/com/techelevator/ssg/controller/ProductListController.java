package com.techelevator.ssg.controller;

import java.math.BigDecimal;
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
	
	@RequestMapping(path="/shoppingCart/addToCart", method=RequestMethod.POST)
	public String addToCart(@RequestParam("id") Long id, @RequestParam("quantity") Integer quantity, HttpSession session) {
		//input type = hidden field, use id to find item and then update quantity associated with product
		Product selectedProduct = productDao.getProductById(id);
		
		Map<Product, Integer> shoppingCart = new HashMap<>();
		
		if(session.getAttribute("shoppingCart") != null) {
			shoppingCart = (Map<Product, Integer>)session.getAttribute("shoppingCart");
		} else {
			shoppingCart = new HashMap<>();
		}
		
		if(shoppingCart.containsKey(selectedProduct)) {
			int cartQuantity = shoppingCart.get(selectedProduct);
			cartQuantity += quantity;
			shoppingCart.put(selectedProduct, cartQuantity);
		} else {
			shoppingCart.put(selectedProduct, quantity);
		}
		
		session.setAttribute("shoppingCart", shoppingCart);
		
		return "redirect:/shoppingCart/view";
	}
	
	private BigDecimal getTotal(Map<Product,Integer> shoppingCart) {
		
		BigDecimal total = BigDecimal.ZERO; 
		for(Product product: shoppingCart.keySet()) {
			total = total.add(product.getPrice().multiply(new BigDecimal (shoppingCart.get(product))));

		}
		return total;
	}
	
	@RequestMapping(path="/shoppingCart/view", method=RequestMethod.GET)
	public String displayShoppingCart(ModelMap mh, HttpSession session) {
		Map<Product, Integer> shoppingCart = new HashMap<>();
		
		if(session.getAttribute("shoppingCart") != null) {
			shoppingCart = (Map<Product, Integer>)session.getAttribute("shoppingCart");
		} else {
			shoppingCart = new HashMap<>();
		}
		mh.put("total", getTotal(shoppingCart));
		return "shoppingCart";
	}
	
	

	

}
