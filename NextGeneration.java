
public class NextGeneration {
//318744265
	public static boolean[][] nextGeneration(boolean[][] cells) {

		int M=cells.length;
		int N=cells[0].length;
		boolean[][] next = new boolean[M][N];

		for(int i=0;i<M;i++) {
			for (int j = 0; j < N; j++) {
				int count=numberOfNeighbors(cells,i,j);
				boolean isAlive = checkCell(cells,i,j);
				if (isAlive && (count==2 || count ==3)){
					next[i][j]=true;

				}
				else if(!isAlive && count == 3) {
					next[i][j]=true;
				}
				else {
					next[i][j]=false;
				}
			}
		}
		return next;

	}

	public static int numberOfNeighbors(boolean[][] cells, int i, int j){
		int count=0;
		for(int x=i-1 ; x<=i+1 ; x++) {
			for(int y=j-1 ; y<=j+1 ; y++){
				if(x==i&&y==j) {
					continue;
				}
				if (checkCell(cells,x,y)) {
					count+=1;
				}
			}
		}
		return count;
	}


	public static boolean checkCell(boolean[][] cells, int x, int y){
		if(!isInside(cells,x,y)) {
			return false;
		}
		return cells[x][y];
	}

	public static boolean isInside(boolean[][] cells, int x, int y){
		if (x<0||x>=cells.length||y>=cells[x].length||y<0) {
			return false;
		}
		return true;

	}




}
