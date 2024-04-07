package com.shimigui.WebServices.entities.enums;

public enum OrderStatus {
	WAITING_PAYMENT(1), PAID(2), SHIPPED(3), DELIVERED(4), CANCELED(5);

	private Integer code;

	private OrderStatus(Integer code) {
		this.code = code;
	}

	public Integer code() {
		return code;
	}

	public static OrderStatus from(Integer code) {
		OrderStatus[] status = OrderStatus.values();
		for(OrderStatus s: status) {
			if(s.code() == code) {
				return s;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code: " + code);
	}
}
