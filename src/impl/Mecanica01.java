package impl;

import factorys.BancoDePalavras;
import factorys.FabricaEmbalharadores;
import interfaces.Embaralhador;
import interfaces.MecanicaDoJogo;

public class Mecanica01 implements MecanicaDoJogo {
	
	//MECANICA 01: 10 PONTOS/ 5 TENTATIVAS/ PERDE 1 PONTO POR ERRO / GANHA 10 PONTOS ACERTANDO

	private int pontos = 10;
	private int quantidadeDeErros = 0;
	private int tentativasPorPalavra = 5;

	FabricaEmbalharadores fabricaEmbalharadores = new FabricaEmbalharadores();
	BancoDePalavras bancoDePalavras = new BancoDePalavras();

	@Override
	public void adicionaPontos() {
		this.pontos += 10;
	}

	@Override
	public void removePontos() {
		this.pontos -= 1;
	}

	@Override
	public boolean fimDeJogo() {
		if (this.pontos <= 0 || this.quantidadeDeErros >= 5) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int pontuacaoFinal() {
		return pontos;
	}
	
	@Override
	public int getQuantidadeDeErros() {
		return quantidadeDeErros;
	}
	
	@Override
	public void setQuantidadeDeErros(int quantidadeDeErros) {
		this.quantidadeDeErros = quantidadeDeErros;
	}

	@Override
	public String palavraEscolhida() {
		return this.bancoDePalavras.palavraEscolhida();	 
	}

	@Override
	public String palavraEmbaralhada(String palavra) {
		Embaralhador embaralhador = fabricaEmbalharadores.defineEmbaralhador();
		String string = embaralhador.embaralhaPalavra(palavra);
		return string;
	}

	@Override
	public boolean acertou(String tentativa, String palavra) {
		if(tentativa.toUpperCase().equals(palavra.toUpperCase())){
			return true;
		}else {
			this.tentativasPorPalavra -= 1;
			this.quantidadeDeErros += 1;
			return false;
		}
	}

	@Override
	public boolean podeTentarNovamente() {
		if (this.tentativasPorPalavra < 1) {
			return false;
		} else {
			this.tentativasPorPalavra -= 1;
			return true;
		}
	}
	
	@Override
	public int getTentativasPorPalavra() {
		return tentativasPorPalavra;
	}
	
	@Override
	public void setTentativasPorPalavra(int tentativasPorPalavra) {
		this.tentativasPorPalavra = tentativasPorPalavra;
	}
	
	

}
