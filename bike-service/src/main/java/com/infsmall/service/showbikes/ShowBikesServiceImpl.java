package com.infsmall.service.showbikes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infsmall.model.Bike;
import com.infsmall.repository.BikeRepository;

@Service
public class ShowBikesServiceImpl implements ShowBikesService{
	
	@Autowired
	private BikeRepository bikeRepository;

	public List<Bike> getAllBikes() {
		return bikeRepository.getAllBikes();
	}
	


}
