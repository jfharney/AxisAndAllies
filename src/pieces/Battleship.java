package pieces;

public class Battleship extends Piece {

	public Battleship(String name) {
		super(name);
		this.cost = 24;
		this.max_moves = 2;
		this.moves_left = 0;
		this.attack = 4;
		this.defense = 4;
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Battleship " + name + " moves");
	}

	
}
