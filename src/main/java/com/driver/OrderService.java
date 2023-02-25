package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    OrderRepository or;

    public void addOrder(Order order){
        or.addOrder(order);
    }

}
