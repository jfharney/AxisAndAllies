package board;

import players.Player;

public abstract class Territory {

	String name;
	Player owner;
	Territory [] adjacentPlaces;
	
	public Territory(String name,Player owner, Territory [] adjacentPlaces) {
		
		this.name = name;
		this.owner = owner;
		this.adjacentPlaces = adjacentPlaces;
		
	}
	
	public void setOwner(Player newOwner) {
		this.owner = newOwner;
	}
	
	public Player getOwner() {
		return this.owner;
	}
	
}
