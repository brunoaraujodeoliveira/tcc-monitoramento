package br.com.sgm.monitoramento.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

//@Configuration
public class DatabaseConfig {

//	@Bean
	public MongoClient mongoClient() {
		MongoClientURI uri = new MongoClientURI(
				"mongodb+srv://monitoramento:monitoramento@cluster-tcc.26f15.mongodb.net/imagens?retryWrites=true&w=majority");
		return new MongoClient(uri);
	}
}
