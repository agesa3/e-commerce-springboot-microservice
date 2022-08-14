package com.agesadev.orderservice.repository;

import com.agesadev.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Order, Long> {
}
