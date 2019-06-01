package com.gmail.queenskeleton.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gmail.queenskeleton.hotel.entity.Floor;

@Repository
public interface FloorRepository extends JpaRepository<Floor, Long> {

}
