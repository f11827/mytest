package cn.itcast.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.dao.ProductDao;
import cn.itcast.domain.Product;
import cn.itcast.service.ProductService;
@Service
@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao productDao;
	@Override
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	public List<Product> findAllProducts() {
		
		return productDao.findAllProducts();
	}
	@Override
	public void addProduct(Product product) {
		productDao.addProduct(product);
		
	}
	@Override
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	public Product findProductById(Integer id) {
		// TODO Auto-generated method stub
		return productDao.findProductById(id);
	}
	@Override
	
	public void updateProduct(Product product) {
		productDao.updateProduct(product);
		
	}
	@Override
	public void deleteProduct(Integer id) {
		productDao.deleteProduct(id);
		
	}

}
