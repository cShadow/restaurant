package fr.ul.miage.m1.restaurant.main;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;

import fr.ul.miage.m1.restaurant.backend.Restaurant;
import fr.ul.miage.m1.restaurant.frontend.MainController;
import fr.ul.miage.m1.restaurant.metier.Personne;
import fr.ul.miage.m1.restaurant.metier.Table;
import fr.ul.miage.m1.restaurant.metier.enums.EtatTable;
import fr.ul.miage.m1.restaurant.metier.enums.Role;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.types.ObjectId;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Updates.*;
import static java.util.Arrays.asList;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

public class Main extends Application {
	
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Restaurant.createBackend();
		
		Parent root = null;
		try {
			URL url = new File("src/main/resources/fxml/ihm.fxml").toURI().toURL();
			FXMLLoader loader = new FXMLLoader(url);
			root = (Parent)loader.load();
			MainController controller = (MainController)loader.getController();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Scene principale
		Scene scene = new Scene(root);
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Projet GL");
		primaryStage.show();
		
	}

	public static void main(String[] args) throws Exception {
		System.out.println("START");
		
		
		launch(args);
		
		
		
		
		
		
		/*CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
		
		
		MongoClient mongoClient = new MongoClient("192.168.0.196", MongoClientOptions.builder().codecRegistry(pojoCodecRegistry).build());
		
		MongoDatabase database = mongoClient.getDatabase("restaurant");
		
		//database = database.withCodecRegistry(pojoCodecRegistry);
		
		//Table t = new Table(1);

	
		
		MongoCollection<Table> collection = database.getCollection("table", Table.class);
		//MongoCollection<Personne> collection2 = database.getCollection("personne", Personne.class);
		
		//collection.insertOne(t);
		
		Table t = collection.find(eq("_id", 1)).first();
		
		System.out.println(t.getId());
		System.out.println(t.getEtat());*/
		
	
		
	}

}
