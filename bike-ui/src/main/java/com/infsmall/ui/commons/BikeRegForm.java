package com.infsmall.ui.commons;

import java.sql.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.infsmall.model.Bike;
import com.infsmall.service.addbikes.AddBikeService;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Composite;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;

@Component
public class BikeRegForm extends Composite implements View {
	
	public static final String NAME = "regView";
 
    @Autowired
    private AddBikeService addBikeService;
 
    @PostConstruct
    public void init() {
        FormLayout formLayout = new FormLayout();
        Label title = new Label("Reg a bike");
        TextField name = new TextField("Name: ");
        TextField email = new TextField("Email: ");
        TextField phone = new TextField("Phone: ");
        TextField model = new TextField("Model: ");
        TextField serialNumber = new TextField("Serial #: ");
        TextField purchasePrice = new TextField("Price: ");
        TextField purchaseDate = new TextField("Date(yyyy-MM-dd): ");
        
        Button button = new Button("Add", clickEvent -> { addBikeService.saveBike(new Bike(name.getValue(),email.getValue(),phone.getValue(),model.getValue(),serialNumber.getValue(),Integer.parseInt(purchasePrice.getValue()), Date.valueOf(purchaseDate.getValue())));});
            
        formLayout.addComponent(title);
        formLayout.addComponent(name);
        formLayout.addComponent(email);
        formLayout.addComponent(phone);
        formLayout.addComponent(model);
        formLayout.addComponent(serialNumber);
        formLayout.addComponent(purchasePrice);
        formLayout.addComponent(purchaseDate);
        formLayout.addComponent(button);
        setCompositionRoot(formLayout);
    }
	
	
	

}
