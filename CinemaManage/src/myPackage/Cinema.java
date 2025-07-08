package myPackage;

public class Cinema {
	private Seat[][] seats;
	
	public Cinema(int rows, int cols) {
		seats = new Seat[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				seats[i][j] = new Seat();
			}
		}
	}
}
