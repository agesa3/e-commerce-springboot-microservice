package com.agesadev.orderservice.controllers;

import com.agesadev.orderservice.dto.OrderRequest;
import com.agesadev.orderservice.services.OrderService;
import com.agesadev.orderservice.services.OrderServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/order")
public class OrderController {

    private final OrderServiceImpl orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String newOrder(@RequestBody OrderRequest orderRequest) {
        orderService.newOrder(orderRequest);
        return "Order Placed Successfully";
    }


}
