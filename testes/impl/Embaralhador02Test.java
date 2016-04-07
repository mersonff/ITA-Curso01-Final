package impl;

import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.junit.Test;

import factorys.BancoDePalavras;

public class Embaralhador02Test {

	@Test
	public void testaEmbaralhador01ComStringQualquer() {
		Embaralhador02 embaralhador = new Embaralhador02();
		String palavra = "Programador";
		String embaralhada = embaralhador.embaralhaPalavra(palavra);
				
		assertNotEquals("Programador", embaralhada);
	}
	
	@Test
	public void testaEmbaralhador01ComStringDoArquivo() {
		BancoDePalavras bancoDePalavras = new BancoDePalavras();
		List<String> palavras = bancoDePalavras.lePalavras();
		Embaralhador02 embaralhador = new Embaralhador02();
		
		//PRIMEIRA STRING DO ARQUIVO = PROGRAMADOR
		String palavra = palavras.get(0);
		String embaralhada = embaralhador.embaralhaPalavra(palavra);
				
		assertNotEquals("Programador", embaralhada);
	}

}
