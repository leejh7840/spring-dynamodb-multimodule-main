package com.nexient.orders.web.controller;

import com.nexient.orders.data.entity.Order;
import com.nexient.orders.service.OrderService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class OrderController {

    @Autowired
    private final OrderService orderService;

    @GetMapping("/all-orders")
    public List<Order> getAllOrder() { return orderService.getAllOrder(); }

    @PostMapping("/make-order/{restaurantName}")
    public String saveOrder(@RequestBody Order order, @PathVariable String restaurantName) {
        return orderService.saveOrder(order, restaurantName);
    }

    @GetMapping("/get-order/{id}")
    public Optional<Order> getOrder(@PathVariable String id) {
        return orderService.getOrder(id);
    }

    @DeleteMapping("/delete-order/{id}")
    public void deleteOrder(@PathVariable String id) {
        orderService.deleteOrder(id);
    }
}
