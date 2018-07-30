package cn.itcast.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import cn.itcast.utils.DateUtils;

/*CREATE TABLE orders(
id NUMBER(9) PRIMARY KEY ,
orderNum VARCHAR2(20) NOT NULL UNIQUE,
orderTime TIMESTAMP(0),
peopleCount NUMBER,
orderDesc VARCHAR2(500),
payType NUMBER(2),
orderStatus NUMBER(2),
productId NUMBER(9),
FOREIGN KEY (productId) REFERENCES product(id)
)*/
public class Order {
	private Integer id;
	private String orderNum;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date orderTime;
	private String orderTimeStr;
	private Integer peopleCount;
	private String orderDesc;
	private Integer payType;
	private Integer orderStatus;
	private Product product;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public Integer getPeopleCount() {
		return peopleCount;
	}
	public void setPeopleCount(Integer peopleCount) {
		this.peopleCount = peopleCount;
	}
	public String getOrderDesc() {
		return orderDesc;
	}
	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}
	public Integer getPayType() {
		return payType;
	}
	public void setPayType(Integer payType) {
		this.payType = payType;
	}
	public Integer getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String getOrderTimeStr() {
		return DateUtils.formatDateToStr(orderTime);
	}
	public void setOrderTimeStr(String orderTimeStr) {
		this.orderTimeStr = orderTimeStr;
	}
	@Override
	public String toString() {
		return "Orders [id=" + id + ", orderNum=" + orderNum + ", orderTime=" + orderTime + ", peopleCount="
				+ peopleCount + ", orderDesc=" + orderDesc + ", payType=" + payType + ", orderStatus=" + orderStatus
				+ ", product=" + product + "]";
	}
	

}
