package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.example.demo.vo.InventoryVo;

@Component
public class InventoryServiceFeignHystric implements InventoryServiceFeign {

	private Logger logger = LoggerFactory.getLogger(InventoryServiceFeignHystric.class);
	
	@Override
	public InventoryVo getInventory(String sku) {
		logger.error("### InventoryServiceFeignHystric.getInventory error!");
		return null;
	}

}
