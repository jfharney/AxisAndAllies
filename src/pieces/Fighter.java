package pieces;
public class Fighter extends Piece {

	public Fighter(String name) {
		super(name);
		this.cost = 12;
		this.max_moves = 4;
		this.moves_left = 0;
		this.attack = 3;
		this.defense = 4;
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Infantry " + name + " moves");
	}

	
	
}
