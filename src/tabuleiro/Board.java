package tabuleiro;

public class Board {

	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int linhas, int colunas) {
		this.rows = linhas;
		this.columns = colunas;
		this.pieces = new Piece[linhas][colunas];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	
	
}
