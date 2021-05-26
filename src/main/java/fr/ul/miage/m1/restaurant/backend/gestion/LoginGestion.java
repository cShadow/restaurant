package fr.ul.miage.m1.restaurant.backend.gestion;

import static com.mongodb.client.model.Filters.eq;

import com.mongodb.client.MongoCollection;

import fr.ul.miage.m1.restaurant.backend.Gestion;
import fr.ul.miage.m1.restaurant.database.MongoDB;
import fr.ul.miage.m1.restaurant.metier.Personne;

public class LoginGestion extends Gestion {
	
	private Personne userLogin;

	public LoginGestion(MongoDB mongoDB) {
		super(mongoDB);
		// TODO Auto-generated constructor stub
	}
	
	public boolean IsLogin() {
		System.out.println("IsLogin");
		System.out.println(this.userLogin);
		return this.userLogin != null;
	}
	
	
	public boolean Login(int idUser) {
		System.out.println("Login");
		MongoCollection<Personne> colPersonne = this.getMongoDB().getCollectionPersonne();
		this.userLogin = colPersonne.find(eq("_id", idUser)).first();
		System.out.println(this.userLogin);
		return this.IsLogin();
	}
	
	public void Logout() {
		this.userLogin = null;
	}

	public Personne getUserLogin() {
		return userLogin;
	}
	
	
	

}
