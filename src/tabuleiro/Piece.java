package tabuleiro;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Position position, Board tabuleiro) {
		this.position = position;
		this.board = tabuleiro;
	}
	
	public Position getPosition() {
		return position;
	}
	
	public void setPosition(Position position) {
		this.position = position;
	}
	
	protected Board getBoard() {
		return board;
	}
	
	
}
