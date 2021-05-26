package fr.ul.miage.m1.restaurant.backend;


import fr.ul.miage.m1.restaurant.backend.gestion.FakeDataGestion;
import fr.ul.miage.m1.restaurant.backend.gestion.LoginGestion;
import fr.ul.miage.m1.restaurant.database.MongoDB;

public class Restaurant {
	
	
	private static Restaurant backend;

	private static MongoDB mongoDB;

	public Restaurant() throws Exception {
		mongoDB = new MongoDB();
		FakeDataGestion fd = new FakeDataGestion(mongoDB);
		fd.fakeData();
	}

	public static void createBackend() throws Exception {
		if (backend == null) {
			System.out.println("Lancement du backend du restaurant.");
			backend = new Restaurant();
		}
	}
	
	public static LoginGestion getLoginGestion() {
		return new LoginGestion(mongoDB);
	}
	

}
