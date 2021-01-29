package com.infsmall.ui.commons;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@SuppressWarnings("serial")
@Route("home")
@PageTitle("Bike")
public class BikeMainUI extends VerticalLayout{

	public BikeMainUI() {
		add(new Button("Click me", e -> Notification.show("Hello, Spring+Vaadin user!")));
	}
	
}
