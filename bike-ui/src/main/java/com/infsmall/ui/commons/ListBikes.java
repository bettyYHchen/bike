package com.infsmall.ui.commons;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.infsmall.model.Bike;
import com.infsmall.service.showbikes.ShowBikesService;
import com.vaadin.navigator.View;
import com.vaadin.shared.ui.grid.HeightMode;
import com.vaadin.ui.Composite;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;

@Component
public class ListBikes extends Composite implements View{
	
	public static final String NAME = "listView";
	@Autowired
	private ShowBikesService showBikesService;
	
	@PostConstruct
	protected void init() {

//		HorizontalLayout root = new HorizontalLayout();
		
		List<Bike> bikes = showBikesService.getAllBikes();
		
		
		Grid<Bike> grid = new Grid<>(Bike.class);
		grid.setItems(bikes);
		
		grid.setHeightMode(HeightMode.ROW);
		grid.setHeightByRows(bikes.size());
		grid.setColumns("id", "name", "email","phone","model","purchasePrice","purchaseDate");
		
		
		
//		root.addComponent(grid);
//		
//		root.setSizeFull();
//		grid.setSizeFull();
//		root.setExpandRatio(grid, 1);
		grid.setWidth("100%");
		setCompositionRoot(grid);

	}
	
}
