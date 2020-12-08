package grigorev.service;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class DbManager {

    public void insert(String json) {
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017/?readPreference=primary&appname=MongoDB%20Compass&ssl=false");
        MongoDatabase labDB = mongoClient.getDatabase("study");
        MongoCollection<Document> labCollection = labDB.getCollection("lab");
        Document docToInsert = Document.parse(json);
        labCollection.insertOne(docToInsert);

        mongoClient.close();
    }

}
