package br.com.sgm.monitoramento.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

@Configuration
public class AppConfig {

	@Bean
	public MongoClient mongoClient() {
        MongoClientOptions.Builder builder = new MongoClientOptions.Builder();
        builder.maxConnectionIdleTime(60000);
        MongoClientOptions opts = builder.build();

        char[] password2 = "monitoramento".toCharArray();

        MongoCredential credential2 = MongoCredential.createCredential("monitoramento", "imagens", password2);

        MongoClient mongoClient = new MongoClient(new ServerAddress("cluster-tcc.26f15.mongodb.net/",27017), credential2, opts);

	    return mongoClient;
	}
}
