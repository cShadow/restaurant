package fr.ul.miage.m1.restaurant.database;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;

import fr.ul.miage.m1.restaurant.backend.Restaurant;
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

public class MongoDB {
	
	private static String IP_SERVEUR_MONGODB = "192.168.0.196";
	private static String NOM_BASE_DE_DONNEES = "restaurant";
	
	
	private MongoCollection<Table> collectionTable;
	private MongoCollection<Personne> collectionPersonne;
	
	public MongoDB() {
		CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(), fromProviders(PojoCodecProvider.builder().automatic(true).build()));
		
		

		MongoClient mongoClient = new MongoClient(IP_SERVEUR_MONGODB, MongoClientOptions.builder().codecRegistry(pojoCodecRegistry).build());
		
		MongoDatabase database = mongoClient.getDatabase(NOM_BASE_DE_DONNEES);

		// Collections :
		this.collectionTable = database.getCollection("table", Table.class);
		this.collectionPersonne = database.getCollection("personne", Personne.class);
	}
	
	

	public MongoCollection<Table> getCollectionTable() {
		return collectionTable;
	}

	public MongoCollection<Personne> getCollectionPersonne() {
		return collectionPersonne;
	}

}
