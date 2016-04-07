package impl;

import interfaces.Embaralhador;

public class Embaralhador01 implements Embaralhador {

	@Override
	public String embaralhaPalavra(String palavra) {
		char[] caracteres = palavra.toCharArray();
		for (int i = 0; i < caracteres.length; i++) {
			int random = (int) (Math.random() * caracteres.length);
			char temp = caracteres[i];
			caracteres[i] = caracteres[random];
			caracteres[random] = temp;
		}
		return new String(caracteres);
	}

}
