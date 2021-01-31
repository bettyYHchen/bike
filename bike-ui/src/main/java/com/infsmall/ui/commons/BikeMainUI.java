package com.infsmall.ui.commons;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;



@SpringUI(path=BikeMainUI.NAME)
@Title("Bike")
@Theme("valo")
public class BikeMainUI extends UI{
	
	public static final String NAME = "/ui";

	@Override
	protected void init(VaadinRequest request) {
		
		VerticalLayout root = new VerticalLayout();
		
		Button homeViewButton = new Button("Navigate to home view");
		Button adminViewButton = new Button("Navigate to admin view");
		
		Panel viewContainer = new Panel();
		Navigator navigator = new Navigator(this, viewContainer);
		navigator.addView(HomeView.NAME, new HomeView());
		navigator.addView(AdminView.NAME, new AdminView());
		navigator.addView("", new HomeView());
		root.addComponent(new HorizontalLayout(homeViewButton, adminViewButton));
		root.addComponent(viewContainer);
		
		homeViewButton.addClickListener(e -> navigator.navigateTo(HomeView.NAME));
		adminViewButton.addClickListener(e -> navigator.navigateTo(AdminView.NAME));
		setContent(root);
		
	}
	
	
	
}
