package br.com.sgm.monitoramento.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import br.com.sgm.monitoramento.service.ImagemService;

@RestController
@RequestMapping("/imagem")
public class ImagemController {

	private final ImagemService service;
	
	public ImagemController(ImagemService service) {
		this.service = service;
	}
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<?> create(@RequestParam MultipartFile file) {
		var imagemSalva = service.create(file);
		return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION).body(imagemSalva);
	}
	
	@GetMapping(value = "/list")
	@ResponseBody
	public ResponseEntity<?> listAll() {
		var imageList = service.listAll();
		return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION).body(imageList);
	}
}
