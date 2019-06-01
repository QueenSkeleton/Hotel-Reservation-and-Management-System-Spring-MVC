package com.gmail.queenskeleton.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gmail.queenskeleton.hotel.entity.Building;

@Repository
public interface BuildingRepository extends JpaRepository<Building, Long> {

}
