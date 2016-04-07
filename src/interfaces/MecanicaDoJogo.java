package interfaces;

public interface MecanicaDoJogo {
	
	public void adicionaPontos();
	public void removePontos();
	public boolean fimDeJogo();
	public int pontuacaoFinal();
	public String palavraEscolhida();
	public String palavraEmbaralhada(String palavra);
	public boolean acertou(String tentativa, String palavra);
	public boolean podeTentarNovamente();
	public int getQuantidadeDeErros();
	void setQuantidadeDeErros(int quantidadeDeErros);
	int getTentativasPorPalavra();
	void setTentativasPorPalavra(int tentativasPorPalavra);

}
