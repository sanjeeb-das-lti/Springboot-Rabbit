package com.javaengine.springbootrabbit.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order {
    private String orderId; //AutoGenerated
    private String name;
    private int quantity;
    private double price;
}
