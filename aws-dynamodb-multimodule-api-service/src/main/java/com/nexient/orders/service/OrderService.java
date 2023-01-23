package com.nexient.orders.service;

import com.nexient.orders.data.entity.Order;
import com.nexient.orders.data.repository.OrderRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Optional;



@Service
@AllArgsConstructor
@NoArgsConstructor
public class OrderService {

    //private static final Logger logger = LogManager.getLogger(OrderService.class);

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrder() {
       // logger.info("Info level log message");
        //logger.warn("Warn level log message");
        return orderRepository.findAll();
    }

    public String saveOrder(Order order, String restaurantName) {
		//logger.info("Order placed in {}", restaurantName);   
        orderRepository.save(order);

        return "SUCCESS!";
    }

    public Optional<Order> getOrder(String id) {
        return orderRepository.findById(id);
    }

    public void deleteOrder(String id) {
        orderRepository.deleteById(id);
    }
}
