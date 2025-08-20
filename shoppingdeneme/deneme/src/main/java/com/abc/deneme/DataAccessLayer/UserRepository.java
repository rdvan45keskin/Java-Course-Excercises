package com.abc.deneme.DataAccessLayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.abc.deneme.Entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	// JpaRepository temel CRUD işlemlerini içerir.
    // Örneğin, save(), findAll(), findById(), deleteById() gibi işlemler otomatik olarak gelir.
}
