package fr.ul.miage.m1.restaurant.backend;

import fr.ul.miage.m1.restaurant.database.MongoDB;

public class Gestion {
	
	private MongoDB mongoDB;

	public Gestion(MongoDB mongoDB) {
		super();
		this.mongoDB = mongoDB;
	}

	public MongoDB getMongoDB() {
		return mongoDB;
	}
	
	

}
