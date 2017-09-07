package com.test.mongo;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.CommandResult;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBEncoder;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoException;
import com.mongodb.ReadPreference;
import com.mongodb.WriteConcern;

public class TestConMongo {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		String connectionString = "";
		//connectionString = "mongodb://user01:1q2w3e4r@localhost:27017/BMG_HIT";
		//connectionString = "mongodb://localhost:27017/BMG_HIT";
		connectionString = "mongodb://localhost:0/BMG_HIT";

		
		MongoClientURI uri = new MongoClientURI(connectionString);
		uri.getCredentials();
		uri.getUsername();
		uri.getHosts();
		uri.getPassword();
		
		MongoClient conn = null;
		//conn = new MongoClient("127.0.0.1", 27017);
		conn = new MongoClient(uri);
		
		DB db = conn.getDB("BMG_HIT");
		
		//System.out.println(" Existe la coleccion" + db.collectionExists("C_MHIT_TEST"));
		
		DBCollection collection = db.getCollection("C_MHIT_TEST");
		
		DBObject dbObject = new BasicDBObject();
		dbObject.put("nombre", "Test");
		dbObject.put("apellidoPaterno", "Test");
		dbObject.put("apellidoMaterno", "Test");
		dbObject.put("edad", 27);
		//dbObject.put("fechaNacimiento", "");
		
		
		collection.insert(dbObject);
		

	}

}
