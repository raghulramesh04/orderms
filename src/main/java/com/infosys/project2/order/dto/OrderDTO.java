package com.infosys.project2.order.dto;

import java.util.Date;

import com.infosys.project2.order.entity.Order;

public class OrderDTO {
	private int orderId;
	private int buyerId;
	private float amount;
	private Date date;
	private String address;
	private String status;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public static OrderDTO valueof(Order orders) {
		OrderDTO order=new OrderDTO();
		order.setAddress(orders.getAddress());
		order.setAmount(orders.getAmount());
		order.setBuyerId(orders.getBuyerId());
		order.setDate(orders.getDate());
		order.setOrderId(orders.getOrderId());
		order.setStatus(orders.getStatus());
		return order;
		
}
	}


