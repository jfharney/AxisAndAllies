package pieces;

public class Transport extends Piece {

	private Piece cargo1;
	private Piece cargo2;
	
	public Transport(String name) {
		super(name);
		this.cost = 8;
		this.max_moves = 2;
		this.moves_left = 0;
		this.attack = 0;
		this.defense = 1;
		this.cargo1 = null;
		this.cargo2 = null;
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Transport " + name + " moves");
	}
	
	public void loadTransport(Piece cargo) {
		if(this.cargo1 != null) {
			this.cargo1 = cargo;
		} else if(this.cargo2 != null) {
			this.cargo2 = cargo;
		} else {
			System.out.println("Transport full");
		}
	}

	public void unloadTransport(Piece cargo) {
		if(this.cargo1 == cargo) {
			this.cargo1 = null;
		} else if(this.cargo2 == cargo) {
			this.cargo2 = null;
		}
	}
	
	
}
