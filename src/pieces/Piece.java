package pieces;

public abstract class Piece {

	protected String name;
	protected int cost;
	protected int max_moves;
	protected int moves_left;
	protected int defense;
	protected int attack;
	
	public Piece(String name) {
		this.cost = 0;
		this.max_moves = 0;
		this.moves_left = 0;
		this.attack = 0;
		this.defense = 0;
		this.name = name;
	}
	
	public abstract void move();
	
}
