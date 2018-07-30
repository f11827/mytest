package cn.itcast.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;

import cn.itcast.domain.Order;
import cn.itcast.service.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderService orderService;
	@RequestMapping("/findAllOrders")
	public String findAllOrders(Model model,@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="3")Integer pageSize) {
		
		PageInfo<Order> pif=orderService.findAllOrders(pageNum,pageSize);
		model.addAttribute("pif", pif);
		return "order/orderList";
		
		
	}

}
