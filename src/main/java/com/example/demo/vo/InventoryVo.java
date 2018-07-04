package com.example.demo.vo;

import java.io.Serializable;

public class InventoryVo implements Serializable {
	
	private static final long serialVersionUID = 1003725671058786940L;

	private String sku;
	
	private Integer qty;

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "InventoryVo [sku=" + sku + ", qty=" + qty + "]";
	}
	
	
}
