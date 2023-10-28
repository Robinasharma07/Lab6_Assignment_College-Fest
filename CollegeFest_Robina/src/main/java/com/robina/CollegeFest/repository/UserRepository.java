package com.vishal.CollegeFest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vishal.CollegeFest.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User findByEmail(String username);

}
