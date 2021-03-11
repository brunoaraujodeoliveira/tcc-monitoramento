package br.com.sgm.monitoramento.entity;

import java.io.IOException;
import java.io.Serializable;

import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "photos")
public class Imagem implements Serializable {

	private static final long serialVersionUID = -3293186844523037571L;

	@Id
	private String id;
	
	private Binary file;
	
	public static Imagem novaImagem(MultipartFile file) throws IOException {
		Imagem imagem = new Imagem();
		imagem.setFile(new Binary(BsonBinarySubType.BINARY, file.getBytes()));
		return imagem;
	}

}
