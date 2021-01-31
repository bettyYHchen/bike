package com.infsmall.ui.commons;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.infsmall.model.Bike;
import com.infsmall.service.showbikes.ShowBikesService;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.data.provider.ListDataProvider;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.grid.HeightMode;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Grid.SelectionMode;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.UI;





@SpringUI(path = "/ui")
@Title("Bike")
@Theme("valo")
public class BikeMainUI extends UI{
	
	@Autowired
	private ShowBikesService showBikesService;
	
	@Override
	protected void init(VaadinRequest request) {

		HorizontalLayout root = new HorizontalLayout();
		
		List<Bike> bikes = showBikesService.getAllBikes();
		
		
		Grid<Bike> grid = new Grid<>(Bike.class);
		grid.setItems(bikes);
		
		grid.setHeight("200px");
		grid.setColumns("id", "name", "email");
		
		
		
		root.addComponent(grid);
		
		root.setSizeFull();
		grid.setSizeFull();
		root.setExpandRatio(grid, 1);
		setContent(root);

	}
	
	
	
}
