package com.springjpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springjpa.model.ApplciationExceptionLog;

public interface ApplicationExceptionLogRepository extends JpaRepository<ApplciationExceptionLog, Long>{
	List<ApplciationExceptionLog> applicationexceptionid(String applicationexceptionid);
}