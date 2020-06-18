package com.infosys.project2.order.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.project2.order.dto.OrderDTO;
import com.infosys.project2.order.dto.ProductDTO;
import com.infosys.project2.order.dto.ProductsOrderDTO;
import com.infosys.project2.order.entity.Order;
import com.infosys.project2.order.entity.ProductsOrder;
import com.infosys.project2.order.repository.OrderRepository;
import com.infosys.project2.order.repository.ProductsOrderRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository orderRepository;

	@Autowired
	ProductsOrderRepository productOrdersRepository;
	

	
	

	public List<OrderDTO> getorders() {
		List<OrderDTO> l=new ArrayList<OrderDTO>();
		List<Order> oe=orderRepository.findAll();
		for(Order o: oe) {
		OrderDTO O=OrderDTO.valueof(o);
		l.add(O);
		}
		return l;
	}


	public OrderDTO getordersbyid(Integer id) {
		Order oe=orderRepository.getOne(id);
		OrderDTO O=OrderDTO.valueof(oe);
		return O;
	}


	public List<ProductsOrderDTO> getproductorders() {
		List<ProductsOrderDTO> l=new ArrayList<ProductsOrderDTO>();
		List<ProductsOrder> oe=productOrdersRepository.findAll();
		for(ProductsOrder o: oe) {
		ProductsOrderDTO O=ProductsOrderDTO.valueof(o);
		l.add(O);
		}
		return l;
	}


	public ProductsOrderDTO getprodordersbyid(Integer orderid) {
		ProductsOrder oe=productOrdersRepository.getOne(orderid);
		ProductsOrderDTO O=ProductsOrderDTO.valueof(oe);
		return O;
	}


	public void removeorder(Integer orderid) {
		Order oe=orderRepository.findByOrderId(orderid);
		orderRepository.delete(oe);
		
	}


	public void addToOrder(ProductDTO prodDTO,Integer quantity) {
		System.out.println("in service");
		ProductsOrderDTO productOrderDTO= new ProductsOrderDTO();
		productOrderDTO.setOrderId(productOrderDTO.getOrderId());
		productOrderDTO.setPrice(prodDTO.getPrice());
		productOrderDTO.setQuantity(quantity);
		productOrderDTO.setProdId(prodDTO.getProdid());
		productOrderDTO.setSellerId(prodDTO.getSellerId());
		productOrderDTO.setStatus("Order Placed");
		System.out.println(productOrderDTO);
		System.out.println("after Dto");
		
		ProductsOrder productOrder=productOrderDTO.createEntity(productOrderDTO);
		System.out.println("after entity");
		System.out.println(productOrder);
		productOrdersRepository.save(productOrder);
		}
	}