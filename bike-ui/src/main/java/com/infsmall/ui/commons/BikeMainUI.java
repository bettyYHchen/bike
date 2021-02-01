package com.infsmall.ui.commons;





import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;





@SpringUI(path = "/ui")
@Title("Bike")
@Theme("valo")
public class BikeMainUI extends UI{
	
	@Autowired
    BikeRegForm bikeRegForm;
 
    @Autowired
    ListBikes listBikes;
 
 
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        HorizontalLayout rootLayout = new HorizontalLayout();
        rootLayout.setSizeFull();
        HorizontalLayout mainarea = new HorizontalLayout();
        mainarea.setWidth("80%");
        mainarea.setHeight("100%");
        Navigator navigator = new Navigator(this, mainarea);
        navigator.addView("", bikeRegForm);
        navigator.addView(BikeRegForm.NAME, bikeRegForm);
        navigator.addView(ListBikes.NAME, listBikes);
 
 
        CssLayout sideNav = new CssLayout();
        sideNav.setSizeFull();
        sideNav.addStyleName("sidenav");
        sideNav.setId("sideNav");
        sideNav.setWidthUndefined();
 
        Button link1 = new Button("Add", e -> navigator.navigateTo(BikeRegForm.NAME));
        Button link2 = new Button("List", e -> navigator.navigateTo(ListBikes.NAME));
        sideNav.addComponent(link1);
        sideNav.addComponent(link2);
        rootLayout.addComponent(sideNav);
        rootLayout.addComponent(mainarea);
        setContent(rootLayout);
    }
	
	
	
}
