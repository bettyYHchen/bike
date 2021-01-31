package com.infsmall.ui.commons;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

public class HomeView extends VerticalLayout implements View{

	public static final String NAME = "homeView";
	@Override
	public void enter(ViewChangeEvent event) {
		Panel panel = new Panel("Login");
		panel.setSizeUndefined();
		
		FormLayout loginLayout = new FormLayout();
		loginLayout.addComponent(new TextField("Username"));
		loginLayout.addComponent(new PasswordField("Password"));
		
		Button loginButton = new Button("Login");
		Button signUpButton = new Button("Sign Up");
		loginButton.setStyleName(ValoTheme.BUTTON_FRIENDLY);
		signUpButton.setStyleName(ValoTheme.BUTTON_PRIMARY);
		
		loginLayout.addComponent(new HorizontalLayout(loginButton, signUpButton));
		loginLayout.setSizeUndefined();
		loginLayout.setMargin(true);
		
		panel.setContent(loginLayout);
		
		addComponent(panel);
		setComponentAlignment(panel, Alignment.MIDDLE_CENTER);
		setMargin(true);
		setHeight("100%");
	}
		
}
