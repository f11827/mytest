package cn.itcast.service;

import java.util.List;

import cn.itcast.domain.Product;

public interface ProductService {
	public List<Product> findAllProducts();

	public void addProduct(Product product);

	public Product findProductById(Integer id);

	public void updateProduct(Product product);

	public void deleteProduct(Integer id);

}
