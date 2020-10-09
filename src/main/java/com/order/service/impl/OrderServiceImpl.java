package com.order.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.order.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Override
	public Double getCost(List<String> fruits) {
		double d = 0;
		for(String fruit: fruits) {
			if(fruit.equals("Apple")) {
				d +=0.6;
			}
			if(fruit.equals("Orange")) {
				d +=0.25;
			}
		}
		return d;
	}
	
	
}
