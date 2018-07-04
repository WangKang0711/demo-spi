package com.example.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.vo.InventoryVo;

@FeignClient(value = "service-inventory",fallback = InventoryServiceFeignHystric.class)
public interface InventoryServiceFeign {

	@RequestMapping(value = "/getInventory",method = RequestMethod.GET)
	InventoryVo getInventory(@RequestParam(value = "sku") String sku);
}
