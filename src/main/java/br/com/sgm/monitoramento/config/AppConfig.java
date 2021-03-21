package br.com.sgm.monitoramento.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
public class AppConfig {

	@Bean
	public MongoClient mongoClient() {
		return MongoClients.create(
				"mongodb+srv://monitoramento:monitoramento@cluster-tcc.26f15.mongodb.net/imagens?retryWrites=true&w=majority");
	}
}
