package com.example.demo.dao.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	public Optional<User> findUserByMail(String mail);
}
