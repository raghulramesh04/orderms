package com.infosys.project2.order.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.project2.order.entity.ProductsOrder;

public interface ProductsOrderRepository  extends JpaRepository<ProductsOrder, Integer>{

//	Optional<ProductsOrdered> findAllById(Integer orderid);
//	ProductsOrder getOne(Integer orderId);

//	ProductsOrder findByOrderId(Integer orderid);

}