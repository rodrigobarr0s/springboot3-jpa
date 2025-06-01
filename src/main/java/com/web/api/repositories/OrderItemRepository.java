package com.web.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.api.entities.OrderItem;
import com.web.api.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
