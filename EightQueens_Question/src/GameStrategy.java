public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;

	private int getColumn(int cellId) {	
		return (cellId%8);
	}
	
	private int getRow(int cellId) {
		if(cellId<8)
			return 0;
		else if(cellId>=8 && cellId<16)
			return 1;
		else if(cellId>=16 && cellId<24)
			return 2;
		else if(cellId>=24 && cellId<32)
			return 3;
		else if(cellId>=32 && cellId<40)
			return 4;
		else if(cellId>=40 && cellId<48)
			return 5;
		else if(cellId>=48 && cellId<56)
			return 6;
		else
			return 7;
	}

	public boolean isValidPosition(int cellId) {
		boolean isValid = true;

		if(numQueens == 8) throw new GameOverException();	// just return out of the method

		// the game is still on, so let us continue...
		
		int col = getColumn(cellId);
		int i,j;
		int row = getRow(cellId);
		
		for(i=0;i<col;i++)
			if(placedQueens[row][i]==true)
				isValid = false;
		for(i=row,j=col;i>=0 && j>=0;i--,j--)
			if(placedQueens[i][j]==true)
				isValid = false;
		for(i=row,j=col;j>=0 && i<64;i++,j--)
			if(placedQueens[i][j]==true)
				isValid=false;
		if(isValid==true)
		{
			placedQueens[row][col]=true;
			numQueens++;
		}
		return isValid;
	}
}














