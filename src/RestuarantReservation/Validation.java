package RestuarantReservation;

import java.util.Scanner;

public class Validation {
	Scanner in = new Scanner(System.in);
	
	public void validateInt() {
		while (!in.hasNextInt()) {
            System.out.print("You must enter a valid number! Try again: ");
            in.next();
	    }
		
	}
	
	public void validateDouble() {
		while (!in.hasNextDouble()) {
            System.out.print("You must enter a valid number! Try again: ");
            in.next();
	    }
		
	}

}
