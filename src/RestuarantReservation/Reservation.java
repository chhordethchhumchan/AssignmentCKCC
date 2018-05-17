package RestuarantReservation;

import java.util.List;
import java.util.Scanner;

public class Reservation implements CRUD<Booking>{
	
	private List<Booking> reservationList;
	
	public List<Booking> getReservationList() {
		return reservationList;
	}

	public void setReservationList(List<Booking> reservationList) {
		this.reservationList = reservationList;
	}

	public Reservation(List<Booking> reservationList) {
		this.reservationList = reservationList;
	}

	public void create(Booking book) {
		
		Scanner input = new Scanner(System.in);
		try {
			do {
				System.out.print("Enter customer name:");
				String name,contaceNo;
				name = input.nextLine();
				System.out.print("Enter customer contaceNo:");
				contaceNo = input.nextLine();
				System.out.print("How many table you want to book? :");
				int numberOfBook,numberTable;
			    while (!input.hasNextInt()) {
	                  System.out.print("You must enter a valid number! Try again: ");
	                  input.next();
	            }
				numberOfBook = input.nextInt();
				
				for(int i =0; i<numberOfBook;i++) {
					System.out.print("Enter table number you want to reserve:");
					numberTable = input.nextInt();
				}
				
				System.out.println("Do you want to take more reservation?[Y/N]");
			    input.nextLine();
			 } while (input.nextLine().equalsIgnoreCase("y"));
		 
		}finally {
	          input.close();
	    }		
	}

	public List<Booking> read() {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Booking b) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Booking b) {
		// TODO Auto-generated method stub
		
	}

	public String toString() {
		return " Reservation [ reservationList = " + reservationList + " ] ";
	}
	
	

}
