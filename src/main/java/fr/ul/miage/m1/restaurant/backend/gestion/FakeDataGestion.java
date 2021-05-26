package fr.ul.miage.m1.restaurant.backend.gestion;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.Block;
import com.mongodb.client.MongoCollection;

import fr.ul.miage.m1.restaurant.backend.Gestion;
import fr.ul.miage.m1.restaurant.database.MongoDB;
import fr.ul.miage.m1.restaurant.metier.Personne;
import fr.ul.miage.m1.restaurant.metier.Plat;
import fr.ul.miage.m1.restaurant.metier.Table;
import fr.ul.miage.m1.restaurant.metier.enums.Role;

import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Updates.*;

public class FakeDataGestion extends Gestion {

	public FakeDataGestion(MongoDB mongoDB) {
		super(mongoDB);
	}

	public void fakeData() {
		this.fakeTables();
		this.fakePersonnes();
		this.fakePlats();
	}

	@SuppressWarnings("deprecation")
	private void fakeTables() {
		MongoCollection<Table> colTable = this.getMongoDB().getCollectionTable();

		List<Table> tables = new ArrayList<>();
		
		if (colTable.find(eq("_id", 1)).first() == null)
			tables.add(new Table(1));
		if (colTable.find(eq("_id", 2)).first() == null)
			tables.add(new Table(2));
		if (colTable.find(eq("_id", 3)).first() == null)
			tables.add(new Table(3));
		if (colTable.find(eq("_id", 4)).first() == null)
			tables.add(new Table(4));
		if (colTable.find(eq("_id", 5)).first() == null)
			tables.add(new Table(5));
		if (colTable.find(eq("_id", 6)).first() == null)
			tables.add(new Table(6));
		if (colTable.find(eq("_id", 7)).first() == null)
			tables.add(new Table(7));
		if (colTable.find(eq("_id", 8)).first() == null)
			tables.add(new Table(8));
		if (colTable.find(eq("_id", 9)).first() == null)
			tables.add(new Table(9));
		if (colTable.find(eq("_id", 10)).first() == null)
			tables.add(new Table(10));
		
		if (tables.size() != 0)
			colTable.insertMany(tables);
	}
	
	private void fakePersonnes() {
		MongoCollection<Personne> colPersonne = this.getMongoDB().getCollectionPersonne();

		List<Personne> personnes = new ArrayList<>();
		
		if (colPersonne.find(eq("_id", 1)).first() == null)
			personnes.add(new Personne(1,"Didier","Bellepèche",Role.DIRECTEUR));
		
		if (colPersonne.find(eq("_id", 2)).first() == null)
			personnes.add(new Personne(2,"Giseline","Fraise",Role.MAITRE_HOTEL));
		
		if (colPersonne.find(eq("_id", 3)).first() == null)
			personnes.add(new Personne(3,"Richard","Coeurdelion",Role.ASSISTANT));
		 
		if (colPersonne.find(eq("_id", 4)).first() == null)
			personnes.add(new Personne(4,"Titeuf","Tartuf",Role.SERVEUR));
		
		if (colPersonne.find(eq("_id", 5)).first() == null)
			personnes.add(new Personne(5,"Nadia","Pignouf",Role.SERVEUR));
		
		if (colPersonne.find(eq("_id", 6)).first() == null)
			personnes.add(new Personne(6,"Robert","Delacôte",Role.CUISINIER));
		
		if (colPersonne.find(eq("_id", 7)).first() == null)
			personnes.add(new Personne(7,"Benjamin","Feuille",Role.CUISINIER));
		
		if (personnes.size() != 0)
			colPersonne.insertMany(personnes);
		
	}
	
	
	private void fakePlats() {
		MongoCollection<Plat> colPlat = this.getMongoDB().getCollectionPlat();

		List<Plat> plat = new ArrayList<>();
		
		if (colPlat.find(eq("_id", 1)).first() == null)
			plat.add(new Plat(1,"Côte de porc et patates sautées",12));
		
		if (colPlat.find(eq("_id", 2)).first() == null)
			plat.add(new Plat(2,"Barquette de frites",5));
		
		if (colPlat.find(eq("_id", 3)).first() == null)
			plat.add(new Plat(3,"Steack Haché + Frite",9));
		
		if (colPlat.find(eq("_id", 4)).first() == null)
			plat.add(new Plat(4,"Poulet écrevisse et son duo de riz",14));
		
		if (colPlat.find(eq("_id", 5)).first() == null)
			plat.add(new Plat(5,"Côte de boeuf + accompagnement au choix",18));
		
		if (colPlat.find(eq("_id", 6)).first() == null)
			plat.add(new Plat(6,"Choucroute",12));
		
		if (colPlat.find(eq("_id", 7)).first() == null)
			plat.add(new Plat(7,"Fondue savoyarde à volonté",20));
		
		if (colPlat.find(eq("_id", 8)).first() == null)
			plat.add(new Plat(8,"Plateau de charcuterie",13));
		
		if (colPlat.find(eq("_id", 9)).first() == null)
			plat.add(new Plat(9,"Fondant au chocolat",5));
		
		if (colPlat.find(eq("_id", 10)).first() == null)
			plat.add(new Plat(10,"Crème brûlée",4));
		
		if (plat.size() != 0)
			colPlat.insertMany(plat);
	}
	

}
