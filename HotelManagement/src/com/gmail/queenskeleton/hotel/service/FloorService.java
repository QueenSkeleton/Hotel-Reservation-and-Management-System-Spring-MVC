package com.gmail.queenskeleton.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gmail.queenskeleton.hotel.entity.Floor;
import com.gmail.queenskeleton.hotel.repository.FloorRepository;

@Service
public class FloorService {
	
	@Autowired
	private FloorRepository floorRepository;
	
	public void setFloorRepository(FloorRepository floorRepository) {
		this.floorRepository = floorRepository;
	}
	
	@Transactional
	public List<Floor> getList() {
		return floorRepository.findAll();
	}
	
	@Transactional
	public Floor getByID(long id) {
		return floorRepository.findById(id).get();
	}
	
	@Transactional
	public boolean save(Floor floor) {
		return floorRepository.save(floor) != null;
	}
	
	@Transactional
	public boolean deleteByID(long id) {
		floorRepository.deleteById(id);
		return true;
	}

}
