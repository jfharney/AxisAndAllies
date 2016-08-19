package pieces;

public class Tank extends Piece {

	public Tank(String name) {
		super(name);
		this.cost = 5;
		this.max_moves = 2;
		this.moves_left = 0;
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Tank " + name + " moves");

	}

}
