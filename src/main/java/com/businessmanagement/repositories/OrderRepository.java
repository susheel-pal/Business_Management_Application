package com.businessmanagement.repositories;

import java.util.List;

import com.businessmanagement.entities.Orders;
import com.businessmanagement.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders, Integer>
{
    List<Orders> findOrdersByUser(User user);
}
