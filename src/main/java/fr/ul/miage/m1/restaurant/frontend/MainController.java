package fr.ul.miage.m1.restaurant.frontend;

import java.util.ArrayList;
import java.util.List;

import fr.ul.miage.m1.restaurant.backend.Restaurant;
import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;

public class MainController {
	
	@FXML
	private Tab loginTab;
	@FXML
	private Tab tablesTab;
	@FXML
	private Tab commandesTab;
	@FXML
	private Tab statsTab;
	@FXML
	private Tab makeCommandeTab;
	
	@FXML
	private TabPane tabPane;
	
	@FXML
	private TextField champUserTextField;
	
	
	public void onViewLogin() {
		if (Restaurant.getLoginGestion().IsLogin()) {
			System.out.println("CO");
			//Restaurant.getLoginGestion().getUserLogin().getRole()
		} else {
			new java.util.Timer().schedule( 
			        new java.util.TimerTask() {
			            @Override
			            public void run() {
			    			tablesTab.setDisable(true);
			    			commandesTab.setDisable(true);
			    			statsTab.setDisable(true);
			    			makeCommandeTab.setDisable(true);
			            }
			        }, 
			        500
			);

		}
		
	}
	
	public void onLogin() {
		Restaurant.getLoginGestion().Login(Integer.parseInt(this.champUserTextField.getText()));
		System.out.println(Restaurant.getLoginGestion().IsLogin());
		this.onViewLogin();
	}
	
	public void onViewTables() {
		
	}
	
	public void onViewCommandes() {
		
	}
	
	public void onViewStats() {
		
	}
	public void onViewMakeCommande() {
		
	}

}
