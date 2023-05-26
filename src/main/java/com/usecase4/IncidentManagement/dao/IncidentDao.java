package com.usecase4.IncidentManagement.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usecase4.IncidentManagement.entity.Incident;

public interface IncidentDao extends JpaRepository<Incident, Long> {
	
	List<Incident> findByUserId(long userId);
}
