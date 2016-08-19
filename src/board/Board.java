package board;

public class Board {

	public static 
	
	Territory entry;
	Territory defaultPlace;
	
	public Board() {
		this.entry = null;
		this.defaultPlace = null;
	}
	
	public Board(String boardPlaceName) {
		this.entry = findBoardPlace(boardPlaceName);
		if (this.entry == null) {
			this.entry = this.defaultPlace;
		}
	}
	
	public static Territory findTerritory(String boardPlaceName) {
		
		return null;
	}
	
}
