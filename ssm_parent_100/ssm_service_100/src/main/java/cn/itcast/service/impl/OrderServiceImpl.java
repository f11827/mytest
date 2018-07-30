package cn.itcast.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.itcast.dao.OrderDao;
import cn.itcast.domain.Order;
import cn.itcast.service.OrderService;
@Service
@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderDao orderDao;
	
	
	@Override
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	public PageInfo<Order> findAllOrders(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		List<Order> list=orderDao.findAllOrders();
		PageInfo<Order> pif=new PageInfo<Order>(list);
		return pif;
	}

}
