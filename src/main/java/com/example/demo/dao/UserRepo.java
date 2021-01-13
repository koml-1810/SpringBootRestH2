package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.User;

public interface UserRepo extends JpaRepository<User, Integer>
{
	/*
	 * List<User>findByTech(String tech);
	 * 
	 * List<User>findByAidGreaterThan(int aid);
	 * 
	 * @Query("from User where tech=?1 order by aname")
	 * List<User>findByTechSorted(String tech);
	 */
}
