import stddraw.StdDraw;
import java.awt.*;
public class GameOfLife {



	public static void main(String args[]) throws InterruptedException{
		System.out.println("318744265");
		gameOfLife(240,10);
	}


	public static void gameOfLife (int n, int cellSize) throws InterruptedException{
		StdDraw.setXscale(0,n);
		StdDraw.setYscale(n,0);
		boolean[][] matrix = new boolean [n/cellSize][n/cellSize];
		clearCells(matrix);
		initRandomMatrix(matrix);
		while(true) {
			StdDraw.setPenColor(StdDraw.BLACK);
			for (int i=0; i<=n; i+=cellSize){
				StdDraw.line(i,0,i,n);
				StdDraw.line(0,i,n,i);
			}
			drawCells(matrix, cellSize, Color.YELLOW);
			matrix = NextGeneration.nextGeneration(matrix);
			Thread.sleep(1000);
			StdDraw.clear();
		}
	}

	public static void initRandomMatrix(boolean[][] cells) {
		for (int i=0; i< cells.length; i++){
			for (int j=0; j< cells[i].length; j++){
				double random = Math.random();
				if(random > 0.8) {
					cells[i][j]=true;
				}
				else {
					cells[i][j] = false;
				}
			}

		}
	}

	public static void clearCells(boolean[][]cells){
		for (int i=0; i< cells.length; i++){
			for (int j=0; j< cells[i].length; j++){
				cells[i][j]=false;
			}
		}
	}

	public static void drawCells(boolean[][] cells, int cellSize, Color color){
		StdDraw.setPenColor(color);
		for (int i=0; i< cells.length; i++){
			for (int j=0; j< cells[i].length; j++) {
				if (cells[i][j]) {
					double p = i * cellSize + cellSize/2;
					double q = j * cellSize + cellSize/2;
					StdDraw.filledSquare(q,p,cellSize/2);
				}

			}
		}
	}



}
