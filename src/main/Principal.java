package main;

import java.util.Scanner;

import factorys.FabricaMecanicaDoJogo;
import interfaces.MecanicaDoJogo;

public class Principal {

	public static void main(String[] args) {

		FabricaMecanicaDoJogo fabrica = new FabricaMecanicaDoJogo();
		MecanicaDoJogo mecanica = fabrica.defineMecanica();
		String palavra = mecanica.palavraEscolhida();
		String palavraEmbaralhada = mecanica.palavraEmbaralhada(palavra);
		int tentativas = mecanica.getTentativasPorPalavra();
		int index = 1;
		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("TENTATIVA " + index + " DE " + tentativas + " PONTUAÇÃO: " + mecanica.pontuacaoFinal());
			System.out.println("PALAVRA:  " + palavraEmbaralhada);
			System.out.println("TENTE ACERTAR A PALAVRA:  ");
			String tentativa = scan.next();
			if (mecanica.acertou(tentativa, palavra)) {
				System.out.println("PARABÉNS VOCÊ ACERTOU!");
				mecanica.adicionaPontos();
				break;
			} else {
				mecanica.removePontos();
				index++;
			}

		} while (!mecanica.fimDeJogo());
		if (mecanica.pontuacaoFinal() <= 0) {
			System.out.println("SUA PONTUAÇÃO: " + mecanica.pontuacaoFinal());
			System.out.println("----------------GAME OVER----------------");
		} else {
			System.out.println("SUA PONTUAÇÃO: " + mecanica.pontuacaoFinal());
			System.out.println("VOCÊ É O CARA!");
		}
		scan.close();

	}
}
