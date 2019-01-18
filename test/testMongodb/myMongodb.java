package testMongodb;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.junit.Test;

/**
 * @Author: puyifan
 * @Despriction:
 * @Date:Created in 下午7:23 19-1-14
 * @Version: 1.0
 */
public class myMongodb {
    private MongoClient mongoClient = new MongoClient("192.168.10.214", 27017);
    private MongoDatabase mongoDatabase = mongoClient.getDatabase("puyifan");
    @Test
    public void test1() {
        try {

            System.out.println("connecting to database");
            System.out.println("the databasename is " + mongoDatabase.getName());
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ":" + e.getMessage());
        }
    }
    @Test
    public void test2() {
        try {
            System.out.println("connecting to database");
            for (String name : mongoDatabase.listCollectionNames()) {
                System.out.println(name);
            }
            MongoCollection collection = mongoDatabase.getCollection("runoob");
            Block<Document> printBlock = new Block<Document>() {
                public void apply(final Document document) {
                    System.out.println(document.toJson());
                }
            };
            collection.find().forEach(printBlock);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ":" + e.getMessage());
        }
    }
}