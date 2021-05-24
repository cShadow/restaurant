package fr.ul.miage.m1.restaurant.metier;

import fr.ul.miage.m1.restaurant.metier.enums.EtatTable;

public class Table {

	private int id;
	private EtatTable etat;
	private Personne serveur;
	
	public Table() {
		
	}
	
	public Table(int id) {
		this.id = id;
		this.etat = EtatTable.LIBRE;
	}
	
	public Table(int id, EtatTable etat) {
		super();
		this.id = id;
		this.etat = etat;
	}
	
	public Table(int id, EtatTable etat, Personne serveur) {
		super();
		this.id = id;
		this.etat = etat;
		this.serveur = serveur;
	}

	public EtatTable getEtat() {
		return etat;
	}
	public void setEtat(EtatTable etat) {
		this.etat = etat;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Personne getServeur() {
		return serveur;
	}
	public void setServeur(Personne serveur) {
		this.serveur = serveur;
	}
	
	
	
	
	
	
}
