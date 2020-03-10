package com.order.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.dto.OrderDTO;
import com.order.entity.Order;
import com.order.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository orderRepository;

	@Override
	public String createOrder(OrderDTO orderDTO) {

		Order order = new Order();
		BeanUtils.copyProperties(orderDTO, order);
		order.setStatus("received");

		order = orderRepository.save(order);
		return order.getId().toString();
	}

}
