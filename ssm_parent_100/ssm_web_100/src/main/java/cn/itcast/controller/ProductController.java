package cn.itcast.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.domain.Product;
import cn.itcast.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService productService;
	@RequestMapping("/findAllProducts")
	public String findAllProducts(Model model) {
		model.addAttribute("pList", productService.findAllProducts());
		return "product/productList";
		
		
		
	}
	@RequestMapping("/addProductUI")
	public String addProductUI() {
		
		return "product/addProduct";
	}
	@RequestMapping("/addProduct")
	public String addProduct(Product product) {
		productService.addProduct(product);
		return "redirect:/product/findAllProducts";
		
	}
	@RequestMapping("/updateProductUI")
	public String editProductUI(Integer id,Model model) {
		model.addAttribute("product",productService.findProductById(id));
		return "product/updateProduct";
	}
	@RequestMapping("/updateProduct")
	public String updateProduct(Product product) {
		productService.updateProduct(product);
		return "redirect:/product/findAllProducts";
		
	}
	@RequestMapping("/deleteProduct")
	public String deleteProduct(Integer id) {
		productService.deleteProduct(id);
		return "redirect:/product/findAllProducts";
		
	}

}
