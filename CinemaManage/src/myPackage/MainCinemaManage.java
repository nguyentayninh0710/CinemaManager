package myPackage;

public class MainCinemaManage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cinema cinema = new Cinema(5,8);
		
		cinema.reserveSeat(1, 1, "Anna");
		cinema.displaySeating();

	}

}
