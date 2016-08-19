package pieces;
public class Infantry extends Piece {

	public Infantry(String name) {
		super(name);
		this.cost = 3;
		this.max_moves = 1;
		this.moves_left = 0;
		this.attack = 1;
		this.defense = 2;
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Infantry " + name + " moves");
	}

	
	
}
