package fr.ul.miage.m1.restaurant.main;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;

import fr.ul.miage.m1.restaurant.metier.Personne;
import fr.ul.miage.m1.restaurant.metier.Table;
import fr.ul.miage.m1.restaurant.metier.enums.EtatTable;
import fr.ul.miage.m1.restaurant.metier.enums.Role;

import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.types.ObjectId;

import java.util.List;

import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Updates.*;
import static java.util.Arrays.asList;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

public class Main {

	public static void main(String[] args) {
		System.out.println("START");
		
		CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
		
		
		MongoClient mongoClient = new MongoClient("192.168.0.196", MongoClientOptions.builder().codecRegistry(pojoCodecRegistry).build());
		
		MongoDatabase database = mongoClient.getDatabase("restaurant");
		
		//database = database.withCodecRegistry(pojoCodecRegistry);
		
		Table t = new Table();
		
		t.setId(554);
		
		t.setServeur(new Personne(12545544, "fsdf", "fdsfsdf", Role.SERVEUR));
		
		
		
		MongoCollection<Table> collection = database.getCollection("table", Table.class);
		MongoCollection<Personne> collection2 = database.getCollection("personne", Personne.class);
		
		collection.insertOne(t);
		
		System.out.println(t.getId());
		System.out.println(t.getEtat());
		
		
		
		
		
	}

}
