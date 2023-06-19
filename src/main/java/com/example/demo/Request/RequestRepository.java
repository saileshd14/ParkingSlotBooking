package com.example.demo.Request;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface RequestRepository extends JpaRepository<Request,Integer>{

	List<Request> findByUserID(int userID);

}
