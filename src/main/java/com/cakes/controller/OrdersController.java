package com.cakes.controller;

import java.time.LocalDate;

import com.cakes.entity.Cakes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.cakes.entity.Orders;
import com.cakes.service.CakesService;
import com.cakes.service.OrderService;

@Controller
public class OrdersController {
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private CakesService cakeService;

	@GetMapping("/orders")
	public String Cakes(Model model) {
		
		model.addAttribute("orders", orderService.findAll());
		model.addAttribute("cakes", cakeService.findAll());
		model.addAttribute("order",new Orders());

		return "orders";
	}

	@PostMapping("/saveOrders")
	public String saveCakes(@ModelAttribute Orders orders,
						    @RequestParam String orderDate,
							@RequestParam String orderName,
							@RequestParam int numbers) {
		
		LocalDate Date = LocalDate.parse(orderDate);
		orders.setDate(Date);
		orders.setCakeName(orderName);
		orders.setNumber(numbers);

		
		orderService.save(orders);

		return "redirect:/orders";
	}

	@GetMapping("/deleteOrders/{id}")
	public String deleteCake(@PathVariable int id) {

		orderService.delete(id);

		return "redirect:/orders";
	}
	
	@GetMapping("/updateOrders/{id}")
	public String updateOrders(@PathVariable int id, Model model){
		
		Orders orders = orderService.findOne(id);
		
		model.addAttribute("cakes", cakeService.findAll());
		model.addAttribute("currentOrder", orders);
		
		return "updateOrders";
	}
	
	@PostMapping("/updateOrders/{id}")
	public String updateOrder(@PathVariable int id, 
 							  @RequestParam String orderType, 
						      @RequestParam String orderName, 
						      @RequestParam int numbers,
						      @RequestParam String orderDate){
					
	Orders order = orderService.findOne(id);
	
	LocalDate Date = LocalDate.parse(orderDate);
	
	order.setNumber(numbers);
	order.setDate(Date);
	
	orderService.save(order);
	
	return "redirect:/orders";
	}
}
