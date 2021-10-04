package com.gastore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gastore.model.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	Optional<User> findUserByEmail(String email);
}
