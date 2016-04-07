package impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import interfaces.Embaralhador;

public class Embaralhador02 implements Embaralhador {

	@Override
	public String embaralhaPalavra(String palavra) {
		List<String> letras = Arrays.asList(palavra.split(""));
		Collections.shuffle(letras);
		String palavraEmbaralhada = "";
		for (String letra : letras) {
			palavraEmbaralhada += letra;
		}
		return palavraEmbaralhada;
	}

}
