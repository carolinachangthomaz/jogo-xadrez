package tabuleiro;

public class Peca {

	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	public Peca(Posicao posicao, Tabuleiro tabuleiro) {
		this.posicao = posicao;
		this.tabuleiro = tabuleiro;
	}
	
	public Posicao getPosicao() {
		return posicao;
	}
	
	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}
	
	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	
	
}
