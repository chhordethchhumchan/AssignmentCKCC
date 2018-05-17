package RestuarantReservation;
import java.util.*;

	public class MainClass{
		
		public static void menu() {
				System.out.println("================================================================");
				System.out.println("================================================================");
				System.out.println("	========  (1)==New--Table		========");
				System.out.println("	========  (2)==List--of--Tables		========");
				System.out.println("	========  (3)==New--Food		========");
				System.out.println("	========  (4)==List--of--Foods		========");
				System.out.println("	========  (5)==Take--Reservation	========");
				System.out.println("	========  (6)==List--of--Reservations	========");
				System.out.println("	========  (7)==Take--Order		========");
				System.out.println("	========  (8)==List--of--Orders		========");
				System.out.println("	========  (9)==Exit--the--Program	========");
				System.out.println("================================================================");
				
				
		}
		
		private static List<Table> listTable = new ArrayList<Table>();
		private static List<Food> listFood = new ArrayList<Food>();
		
		//		================= Create New Table=======================
		
		public static void createNewTable() {
			Scanner input = new Scanner(System.in);
			System.out.println("\t\t----------------------Create New Table----------------------");
			String ID;
			do {
				System.out.print("Enter your table No:  ");
				ID = input.nextLine();
				System.out.print("Enter number of seats:  ");
				while (!input.hasNextInt()) {
		            System.out.print("You must enter a valid number! Try again: ");
		            input.next();
			    }
				int numSeats = input.nextInt();
				
				System.out.print("Do you want to add more Table?[Y/N]:   ");
				input.nextLine().trim();
				Table table = new Table(numSeats,ID,true);
				listTable.add(table);
				
			 } while (input.nextLine().equalsIgnoreCase("y"));
		}
		
		
		//			================Show List Of Tables=================== 
		
		public static void listOfTables() {
			System.out.println("\t\t----------------------List Of Table----------------------");
			System.out.println("[No\t\tNumberOfSeats\t\tStatus]");
			for(Table showTable:listTable) {
					System.out.println(showTable.toString());	
			}
		}
		
		
		//		================= Create New Food=======================
		
		public static void createNewFood(){
			System.out.println("\t\t----------------------Create New Food Menu----------------------");
			Scanner input = new Scanner(System.in);
			
				do {
					System.out.print("Enter your food code:  ");
					String ID = input.nextLine();
					System.out.print("Enter your food name:  ");
					String name = input.nextLine();
					System.out.print("Enter your food price:  ");
				    while (!input.hasNextDouble()) {
			              System.out.print("You must enter a valid number! Try again: ");
			              input.next();
			        }
					double price = input.nextDouble();
					System.out.print("Do you want to add more food ?[Y/N]:   ");
				    input.nextLine();
				    Food food = new Food(ID, name, price);
				    listFood.add(food);
				} while (input.nextLine().equalsIgnoreCase("y"));
				
					
		}
		
		//    ====================	List of Foods  =====================
		
		public static void listOfFoods() {
			System.out.println("\t\t---------------------- List of Food ----------------------");
			System.out.println("[Code\t\t\tName\t\t\tPrice]");
			for(Food showFood:listFood) {
					System.out.println(showFood.toString());	
			}
		}
		
		
		public static void main(String[] args) {
			Table ta= new Table();
			Food f = new Food();
			Scanner input = new Scanner(System.in);
			
			try {
				do {
					menu();
					System.out.print("\t\t---------------------- Please--Input--Your--Choice : ");
				
					while (!input.hasNextInt()) {
			             System.out.print("You must enter a valid number! Try again: ");
			             input.next();
			       } 
					int choice;
					choice = input.nextInt();
			
					switch(choice) {
				
					case 1:	
						createNewTable();
						break;
					case 2:
						listOfTables();
						break;
					case 3:
						createNewFood();
						break;
					case 4:
						listOfFoods();
						break;
					case 5:
						break;
					case 6:
						break;
					case 7:
						break;
					case 8:
						break;
					case 9:
						System.exit(0);
						break;
					default:
						System.out.println("Invalid Number");                    
			                break;
					}
					
				
					System.out.print("Do you want to continue to menu form?[Y/N]");
					input.nextLine().trim();
				 } while (input.nextLine().equalsIgnoreCase("y"));
			
			}finally {
		          input.close();
		    }	
				

	}
}
