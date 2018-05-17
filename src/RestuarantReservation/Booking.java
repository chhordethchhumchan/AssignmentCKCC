
package RestuarantReservation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import RestuarantReservation.Table;

public class Booking {
	private int ID;
	private List<Table> reservedTable = new ArrayList<Table>();
	private String customerName;
	private String customerNo;
	
	public Booking() {
		
	}
	
	public Booking(int ID, List<Table> reservedTable, String customerName, String customerNo) {
		this.ID = ID;
		this.reservedTable = reservedTable;
		this.customerName = customerName;
		this.customerNo = customerNo;
	}
	
	public List<Table> getReservedTable() {
		return reservedTable;
	}
	
	public void setReservedTable(List<Table> reservedTable) {
		this.reservedTable = reservedTable;
	}
	
	public void reservedBooking() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Booking Id :");
		ID = input.nextInt();
		System.out.println("Enter Customer Name :");
		customerName = input.next();
		System.out.println("Enter Customer No :");
		customerNo = input.next();
		System.out.println("How many table you want to book? :");
		int n = input.nextInt();
		Table[] bookTable = new Table[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter table number you want to reserve :");
			bookTable[i] = new Table();
			bookTable[i].setReserveTable(input.nextInt());
			reservedTable.add(bookTable[i]);
//			System.out.println(reservedTable.get(i).getReserveTable());
		}
	}
	
	public String toString() {
		return "Booking [ ID= " + ID + ", reservedTable = " + reservedTable + ", customerName = " + customerName
				+ ", customerNo = " + customerNo + "]";
	}	
}