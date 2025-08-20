package com.shopping.demo.DataAccessLayer;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.shopping.demo.Entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
	// JpaRepository temel CRUD işlemlerini içerir.
    // Örneğin, save(), findAll(), findById(), deleteById() gibi işlemler otomatik olarak gelir.
}
