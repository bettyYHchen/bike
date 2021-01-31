package com.infsmall.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.infsmall.model.Bike;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Long> {
	
	@Query("select b from Bike b order by b.purchaseDate")
	List<Bike> getAllBikes();

}