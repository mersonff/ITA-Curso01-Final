package impl;

import factorys.BancoDePalavras;
import factorys.FabricaEmbalharadores;
import interfaces.Embaralhador;
import interfaces.MecanicaDoJogo;

public class Mecanica02 implements MecanicaDoJogo {
	
	//MECANICA 02: 10 PONTOS/ 3 TENTATIVAS/ PERDE 3 PONTOS POR ERRO / GANHA 30 PONTOS ACERTANDO

	private int pontos = 10;
	private int quantidadeDeErros = 0;
	private int tentativasPorPalavra = 3;

	FabricaEmbalharadores fabricaEmbalharadores = new FabricaEmbalharadores();
	BancoDePalavras bancoDePalavras = new BancoDePalavras();

	@Override
	public void adicionaPontos() {
		this.pontos += 30;
	}

	@Override
	public void removePontos() {
		this.pontos -= 3;
	}

	@Override
	public boolean fimDeJogo() {
		if (this.pontos <= 0 || this.quantidadeDeErros >= 3) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int pontuacaoFinal() {
		return pontos;
	}

	public int getQuantidadeDeErros() {
		return quantidadeDeErros;
	}

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
		if (tentativa.toUpperCase().equals(palavra.toUpperCase())) {
			return true;
		} else {
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

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public int getTentativasPorPalavra() {
		return tentativasPorPalavra;
	}

	public void setTentativasPorPalavra(int tentativasPorPalavra) {
		this.tentativasPorPalavra = tentativasPorPalavra;
	}

}
