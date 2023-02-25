package com.driver;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class OrderRepository {
    HashMap<String, Order> orderDb = new HashMap<>();
    HashMap<String, DeliveryPartner> partnerDb = new HashMap<>();
    HashMap<String, List<String>> pairDb = new HashMap<>();
    HashMap<String, String> assignedDb = new HashMap<>(); // <orderId, partnerId>

    public String addOrder(Order order){
        orderDb.put(order.getId(),order);
        return "Added";
    }

}
