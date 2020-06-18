package com.infosys.project2.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.project2.order.entity.Order;
import com.infosys.project2.order.entity.ProductsOrder;

public interface OrderRepository extends JpaRepository<Order, Integer>{
	Order getOne(Integer orderId);

	Order findByOrderId(Integer orderid);

}
