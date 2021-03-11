package br.com.sgm.monitoramento.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.sgm.monitoramento.entity.Imagem;

@Repository
public interface ImagemRepository extends MongoRepository<Imagem, String> {

}
