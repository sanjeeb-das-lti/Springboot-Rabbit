package com.javaengine.springbootrabbit.consumer;

import com.javaengine.springbootrabbit.config.MessagingConfig;
import com.javaengine.springbootrabbit.dto.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class User {

    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void getOrderStatusFromQueue(OrderStatus orderStatus) {
        System.out.println("Message received from Queue" + orderStatus);
    }
}
