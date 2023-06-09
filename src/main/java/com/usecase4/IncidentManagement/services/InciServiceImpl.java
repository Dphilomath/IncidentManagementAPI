package com.usecase4.IncidentManagement.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usecase4.IncidentManagement.dao.IncidentDao;
import com.usecase4.IncidentManagement.entity.Incident;

@Service
public class InciServiceImpl implements InciService {
	
//	List<Incident> list;
	
	@Autowired
	private IncidentDao inciDao;
	
	public InciServiceImpl()
	{

	}
	
	@Override
	public List<Incident> getIncidents() {
		
		return inciDao.findAll();
	}

	
	@Override
	public Optional<Incident> getincident(long incidentId) {
		
		return inciDao.findById(incidentId);
	}

	@Override
	public Incident createIncident(Incident inci) {

		return inciDao.save(inci);

	}

	@Override
	public Incident updateIncident(Incident inci) {
		
		inciDao.save(inci);
		
		return inci;
	}

	@Override
	public void deleteIncident(long incidentId) {
		
		inciDao.deleteById(incidentId);
		
	}

}
