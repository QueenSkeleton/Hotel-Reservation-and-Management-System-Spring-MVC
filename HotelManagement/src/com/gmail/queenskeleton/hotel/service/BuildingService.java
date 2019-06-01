package com.gmail.queenskeleton.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gmail.queenskeleton.hotel.entity.Building;
import com.gmail.queenskeleton.hotel.repository.BuildingRepository;

@Service
public class BuildingService {

	@Autowired
	private BuildingRepository buildingRepository;
	
	public void setBuildingRepository(BuildingRepository buildingRepository) {
		this.buildingRepository = buildingRepository;
	}
	
	@Transactional
	public List<Building> getList() {
		return buildingRepository.findAll();
	}
	
	@Transactional
	public Building getByID(long id) {
		return buildingRepository.findById(id).get();
	}
	
	@Transactional
	public boolean save(Building building) {
		return buildingRepository.save(building) != null;
	}
	
	@Transactional
	public boolean deleteByID(long id) {
		buildingRepository.deleteById(id);
		return true;
	}
	
}
