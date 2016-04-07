package factorys;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BancoDePalavras {


	public List<String> lePalavras() {
		List<String> arrayPalavras = new ArrayList<>();
		File palavras = new File("palavras.txt");
		
		try {
			FileReader fileReader = new FileReader(palavras);
			Scanner scan = new Scanner(fileReader);
						
			while((scan.hasNextLine())){
				arrayPalavras.add(scan.nextLine());
			}
			 fileReader.close();
		     scan.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return arrayPalavras;
	}
	
	public String palavraEscolhida() {
		List<String> palavras = lePalavras();
		return palavraAleatoria(palavras);	 
	}

	private String palavraAleatoria(List<String> palavras) {
		Random rand = new Random();
		return palavras.get(rand.nextInt(palavras.size()));

	}
}
