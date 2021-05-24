package fr.ul.miage.m1.restaurant.backend.gestion;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.Block;
import com.mongodb.client.MongoCollection;

import fr.ul.miage.m1.restaurant.backend.Gestion;
import fr.ul.miage.m1.restaurant.database.MongoDB;
import fr.ul.miage.m1.restaurant.metier.Table;

import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Updates.*;

public class FakeDataGestion extends Gestion {

	public FakeDataGestion(MongoDB mongoDB) {
		super(mongoDB);
	}

	public void fakeData() {
		this.fakeTables();
		this.fakePersonnes();
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


		System.out.println(tables.size());
		
		if (tables.size() != 0)
			colTable.insertMany(tables);
	}
	
	private void fakePersonnes() {
		
	}
	

}
