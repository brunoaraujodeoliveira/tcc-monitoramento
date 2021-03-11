package br.com.sgm.monitoramento.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import br.com.sgm.monitoramento.entity.Imagem;
import br.com.sgm.monitoramento.repository.ImagemRepository;

@Service
public class ImagemService {

	private final ImagemRepository repository;
		
	@Autowired
	public ImagemService(ImagemRepository repository) {
		this.repository = repository;
	}
	
	public Imagem create(MultipartFile file) {
		try {
			repository.deleteAll();
			return repository.save(Imagem.novaImagem(file));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public List<Imagem> listAll() {
		return repository.findAll();
	}
}
