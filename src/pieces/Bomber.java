package pieces;
public class Bomber extends Piece {

	public Bomber(String name) {
		super(name);
		this.cost = 15;
		this.max_moves = 4;
		this.moves_left = 0;
		this.attack = 4;
		this.defense = 1;
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Bomber " + name + " moves");
	}

	
	
}
