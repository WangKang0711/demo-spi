package com.example.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.vo.AccountBalanceVo;

@FeignClient(value = "service-wallet")
public interface WalletServiceFeign {

	@RequestMapping(value = "/getAccountBalance",method = RequestMethod.GET)
	AccountBalanceVo getAccountBalance(@RequestParam(value = "customerCode") String customerCode);
}
