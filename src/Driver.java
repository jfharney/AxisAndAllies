import pieces.*;

public class Driver {

	public static void main(String [] args) {
		
		System.out.println("Hello");
		
		Piece [] pieces = new Piece [3];
		
		Infantry i1 = new Infantry("i1");
		Tank t1 = new Tank("t1");
		Infantry i2 = new Infantry("i2");
		
		pieces[0] = i1;
		pieces[1] = t1;
		pieces[2] = i2;
		
		for(Piece piece : pieces) {
			piece.move();
		}
		
	}
	
}
