package com.javaengine.springbootrabbit.producer;


import com.javaengine.springbootrabbit.config.MessagingConfig;
import com.javaengine.springbootrabbit.dto.Order;
import com.javaengine.springbootrabbit.dto.OrderStatus;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/placeOrder")
public class OrderPublisher {

    @Autowired
    private RabbitTemplate template;

    @PostMapping("/{restaurant}")
    public ResponseEntity<String> bookOrder(@RequestBody Order order, @PathVariable String restaurant) {
        order.setOrderId((UUID.randomUUID().toString()));
        //Order Service
        //Payment Service
        OrderStatus orderStatus = new OrderStatus(order, "PLACED", "Order placed successfully in " + restaurant);
        template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.ROUTING_KEY, orderStatus);
        return ResponseEntity.ok("Your order is placed");
    }
}
