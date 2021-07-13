public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {

		int col = (square%8);
		int row;
		if(square<8)
			row= 0;
		else if(square>=8 && square<16)
			row= 1;
		else if(square>=16 && square<24)
			row= 2;
		else if(square>=24 && square<32)
			row= 3;
		else if(square>=32 && square<40)
			row= 4;
		else if(square>=40 && square<48)
			row= 5;
		else if(square>=48 && square<56)
			row= 6;
		else
			row= 7;
		if((row+col)%2==0)
			return false;
		System.out.println(square);
		return true;
	}
}
