package fr.ul.miage.m1.restaurant.metier;

import fr.ul.miage.m1.restaurant.metier.enums.EtatTable;

public class Table {

	private int id;
	private EtatTable etat;
	private Personne serveur;
	
	
	
	
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
