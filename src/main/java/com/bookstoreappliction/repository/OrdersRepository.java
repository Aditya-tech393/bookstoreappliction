package com.bookstoreappliction.repository;

import com.bookstoreappliction.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders,Long> {
}
