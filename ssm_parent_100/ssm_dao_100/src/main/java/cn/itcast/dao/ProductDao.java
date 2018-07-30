package cn.itcast.dao;



import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.itcast.domain.Product;

public interface ProductDao {
	@Select("select * from product")
	public List<Product> findAllProducts();
	@Insert("insert into product values(common_sequence.nextval,#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
	public void addProduct(Product product);
	@Select("select * from product where id= #{id}")
	public Product findProductById(Integer id);
	@Update("update product set productName=#{productName},cityName=#{cityName},departureTime=#{departureTime},productPrice=#{productPrice},productDesc=#{productDesc},productStatus=#{productStatus} where id=#{id}")
	public void updateProduct(Product product);
	@Delete("delete from product where id=#{id}")
	public void deleteProduct(Integer id);

}
