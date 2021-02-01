package com.infsmall.service.addbikes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infsmall.model.Bike;
import com.infsmall.repository.BikeRepository;

@Service
public class AddBikeServiceImpl implements AddBikeService{
	
	@Autowired
	private BikeRepository bikeRepository;

	public void saveBike(Bike bikeDAO) {
		
		Bike bike = new Bike();
		bike.setName(bikeDAO.getName());
		bike.setEmail(bikeDAO.getEmail());
		bike.setPhone(bikeDAO.getPhone());
		bike.setModel(bikeDAO.getModel());
		bike.setPurchasePrice(bikeDAO.getPurchasePrice());
		bike.setSerialNumber(bikeDAO.getSerialNumber());
		bike.setPurchaseDate(bikeDAO.getPurchaseDate());
		
		bikeRepository.save(bike);
		
	}
	
	
	

}
