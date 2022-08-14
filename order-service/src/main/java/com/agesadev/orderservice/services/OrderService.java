package com.agesadev.orderservice.services;

import com.agesadev.orderservice.dto.OrderRequest;

public interface OrderService {

    void newOrder(OrderRequest orderRequest);
}
