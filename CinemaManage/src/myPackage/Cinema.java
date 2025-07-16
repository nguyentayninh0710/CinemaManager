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
	
	public void reserveSeat(int row, int col, String customerName) {
		if (seats[row][col].isReserved()) {
			System.out.println("Seat reserved.");
		} else {
			seats[row][col].reserve(customerName);
		}
	}
	
	public void cancelReservation(int row, int col) {
		if (seats[row][col].isReserved()) {
			seats[row][col].cancelReservation();
		} else {
			System.out.println("Seat is not reserved");
		}
	}
	
	public void addItemToSeat(int row, int col, String item) {
		seats[row][col].addItem(item);
	}
	
	public void displaySeating() {
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				System.out.print(seats[i][j].toString());
			}
			System.out.println();
		}
	}
	
	
	
	
}
