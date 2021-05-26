package fr.ul.miage.m1.restaurant.metier;

public class Plat {
	//Attribut
	private int id;
	private String nom;
	private double prix;
	
	//Constructeur
	
	public Plat(int id, String nom, double prix) {
		super();
		this.id = id;
		this.nom = nom;
		this.prix = prix;
	}
	
	public Plat() {
		super();
	}
	
	//Getter Setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	
	
}
