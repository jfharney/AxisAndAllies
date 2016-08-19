package pieces;

public class Submarine extends Piece {

	public Submarine(String name) {
		super(name);
		this.cost = 8;
		this.max_moves = 2;
		this.moves_left = 0;
		this.attack = 2;
		this.defense = 2;
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Submarine " + name + " moves");
	}

	
}
