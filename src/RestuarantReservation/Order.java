package RestuarantReservation;
import java.util.List;
import java.util.Scanner;

public class Order implements CRUD<Food>{

	private int ID;
	private Table table;
	private List<Food> foodList;
	
	public Order(int ID, Table table, List<Food> foodList) {
		super();
		this.ID = ID;
		this.table = table;
		this.foodList = foodList;
	}
	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	public List<Food> getFoodList() {
		return foodList;
	}

	public void setFoodList(List<Food> foodList) {
		this.foodList = foodList;
	}
	
	public void create(Food f) {
		Scanner input = new Scanner(System.in);
		try {
			do {
			
				System.out.print("Enter table number you want to order:  ");
				String codeTable = input.nextLine();
				
				System.out.print("How many foods you want to order? :");
				int numberOfFood,numberTable;
			    while (!input.hasNextInt()) {
	                  System.out.print("You must enter a valid number! Try again:  ");
	                  input.next();
	            }
				numberOfFood = input.nextInt();
				
				for(int i =0; i<numberOfFood;i++) {
					System.out.print("\tEnter Food code you want to eat:  ");
					numberTable = input.nextInt();
				}

				
				System.out.println("Do you want to take more reservation?[Y/N]");
			    input.nextLine();
			 } while (input.nextLine().equalsIgnoreCase("y"));
		 
		}finally {
	          input.close();
	    }		
		
	}

	public List<Food> read() {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Food f) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Food f) {
		// TODO Auto-generated method stub
		
	}

	public String toString() {
		System.out.println("\t\t----------------------List of order----------------------");
		System.out.println("Order #"+ID+" | Table #" );
		System.out.println("[Code\t\t\tName\t\t\tPrice]");
		return  " "+ID+"\t\t\t";
	}
	
}
