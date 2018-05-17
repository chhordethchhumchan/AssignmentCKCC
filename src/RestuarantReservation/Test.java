package RestuarantReservation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    private static List<Table> ta= new ArrayList<Table>();
	public static void newTable() {
		Scanner input = new Scanner(System.in);
		System.out.println("\t\t----------------------Create New Table----------------------");
		
		do {
			System.out.print("Enter your table No:  ");
			String ID = input.nextLine();
			System.out.print("Enter number of seats:  ");
			
			
			while (!input.hasNextInt()) {
	            System.out.print("You must enter a valid number! Try again: ");
	            input.next();
		    }
			int numSeats = input.nextInt();
			
			System.out.print("Do you want to add more Table?[Y/N]:   ");
			input.nextLine().trim();
			Table t = new Table(numSeats,ID,true);
			ta.add(t);
		 } while (input.nextLine().equalsIgnoreCase("y"));
	}
	
  
	public static void listOfTable() {
		System.out.println("\t\t----------------------List Of Table----------------------");
		System.out.println("[No\t\tNumberOfSeats\t\tStatus]");
		for(Table showTable:ta) {
				System.out.println(showTable.toString());	
		}
	}
	public static void main(String[] args) {
		
		
		
	
		

	}
	
	
		
		
	

}
