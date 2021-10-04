package com.gastore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gastore.model.Role;



@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

}
