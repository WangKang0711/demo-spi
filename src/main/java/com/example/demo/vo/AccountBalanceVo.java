package com.example.demo.vo;

import java.io.Serializable;
import java.math.BigDecimal;

public class AccountBalanceVo implements Serializable {
	
	private static final long serialVersionUID = -6276103280680857071L;
	
	private String customerCode;
	
	private BigDecimal availableBalance;
	
	

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public BigDecimal getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(BigDecimal availableBalance) {
		this.availableBalance = availableBalance;
	}

	@Override
	public String toString() {
		return "AccountBalanceVo [customerCode=" + customerCode + ", availableBalance=" + availableBalance + "]";
	}

	
	
	
}
