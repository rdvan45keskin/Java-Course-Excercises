package com.shopping.demo.DataAccessLayer;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.shopping.demo.Entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	// JpaRepository temel CRUD işlemlerini içerir.
    // Örneğin, save(), findAll(), findById(), deleteById() gibi işlemler otomatik olarak gelir.
}
