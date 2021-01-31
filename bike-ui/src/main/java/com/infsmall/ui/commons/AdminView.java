package com.infsmall.ui.commons;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;


public class AdminView extends VerticalLayout implements View {

	public static final String NAME = "adminView";
	@Override
	public void enter(ViewChangeEvent event) {
		Label label = new Label("This is the admin view");
		addComponent(label);
	}
	
}
