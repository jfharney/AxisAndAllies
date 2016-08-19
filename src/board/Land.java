package board;

import players.Player;

public class Land extends Territory {

	public Land(String name,Player owner, Territory [] adjacentPlaces) {
		super(name,owner,adjacentPlaces);
	}
	
}
