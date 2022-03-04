package com.example.customerservice.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.customerservice.model.OrdersDto;


@FeignClient(name="order-service", url="http://localhost:8082/")
public interface CustomerFeignProxy {
	
	@GetMapping("customers/cid/{cid}")
	public List<OrdersDto> findCaddressByCid(@PathVariable("cid") int cid);

}

