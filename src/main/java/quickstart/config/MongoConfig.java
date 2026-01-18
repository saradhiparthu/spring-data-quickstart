package config;

import java.util.Collection;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
public class MongoConfig extends AbstractMongoClientConfiguration {
 
	private String mongoUrl="mongodb://pulivarthi:pulivarthi@pulivarthi-nosql-mongodb.cluster-cpucri6gno6h.us-east-2.docdb.amazonaws.com:27017/?ssl=true&ssl_ca_certs=us-east-2-bundle.pem&replicaSet=rs0&readPreference=secondaryPreferred&retryWrites=false";
	
    @Override
    protected String getDatabaseName() {
        return "work";
    }
 
    @Override
    public MongoClient mongoClient() {
        ConnectionString connectionString = new ConnectionString(mongoUrl);
        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
            .applyConnectionString(connectionString)
            .build();
        
        return MongoClients.create(mongoClientSettings);
    }
 
    @Override
    public Collection getMappingBasePackages() {
        return Collections.singleton("com.springboot.tutorial");
    }
}