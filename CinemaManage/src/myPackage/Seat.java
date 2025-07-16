package myPackage;

import java.util.ArrayList;

public class Seat {
	private boolean reserved;
	private String customerName;
	private ArrayList<String> items;
	public Seat() {
		this.reserved = false;
		this.customerName = "";
		this.items = new ArrayList<>();
	}
	
	public void reserve(String name) {
		this.reserved = true;
		this.customerName = name;
	}
	
	public void cancelReservation() {
		this.reserved = false; 
		this.customerName = "";
		this.items.clear(); 
	}
	
	public boolean isReserved() {   // check if the seat is taken or not
		return this.reserved;
	}
	
	public void addItem(String item) {
		this.items.add(item);
	}
	
	public String toString() {
		if (this.reserved = false) {
			return "X" + customerName;
		} else {
			return "0";
		}
	}
}
