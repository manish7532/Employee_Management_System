package emp;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


public class EmployeeManagement {
	
	public static void main(String[] args) {
		
		List<EmployeeDetails> c = new ArrayList<EmployeeDetails>();
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		int ch=0;
		
		
		while(true){
			System.out.println("\t\t\t\t **Welcome to Employee_Management_System**");
			System.out.println("1.INSERT");
			System.out.println("2.DISPLAY");
			System.out.println("3.SERACH");
			System.out.println("4.DELETE");
			System.out.println("5.UPDATE");
			System.out.println("6.EXIT");
			try {
			System.out.println("Enter Your Choice : ");
			ch=sc.nextInt();
			
			switch (ch) {
			case 1: 
				System.out.println("Enter Employee ID : ");
				int eId = sc.nextInt();
				System.out.println("Enter Employee Name : ");
				String eName = sc1.nextLine();
				System.out.println("Enter monthly salary : ");
				int salary = sc.nextInt();
				System.out.println("Enter Employee mailId : ");
				String mailId = sc1.nextLine();
				
				float yearlySalary= salary*12;
			
				c.add(new EmployeeDetails(eId, eName, mailId,yearlySalary));
				
				System.out.println("------------------------------------------------------------------------------------------------------");
				Iterator<EmployeeDetails> i = c.iterator();
				while(i.hasNext()) {
					EmployeeDetails e = i.next();
					System.out.println(e);
				}
				System.out.println("------------------------------------------------------------------------------------------------------");
				break;
				
				
			case 2:
				System.out.println("------------------------------------------------------------------------------------------------------");
				 i = c.iterator();
				while(i.hasNext()) {
					EmployeeDetails e = i.next();
					System.out.println(e);
				}
				System.out.println("------------------------------------------------------------------------------------------------------");
				break;
				
				
			case 3:
				boolean found = false;
				System.out.println("Enter Employee ID to Search");
				int empId = sc.nextInt();
				System.out.println("------------------------------------------------------------------------------------------------------");
				 i = c.iterator();
				while(i.hasNext()) {
					EmployeeDetails e = i.next();
					if(e.getEmpId() == empId) {
					System.out.println(e);
					found = true;
					}
				}
				
				if(!found) {
					System.out.println("Record Not Found");
				}
				System.out.println("------------------------------------------------------------------------------------------------------");
				break;
				
				
			case 4:
				found = false;
				System.out.println("Enter Employee ID to Delete");
				empId = sc.nextInt();
				System.out.println("------------------------------------------------------------------------------------------------------");
				 i = c.iterator();
				while(i.hasNext()) {
					EmployeeDetails e = i.next();
					if(e.getEmpId() == empId) {
					i.remove();
					found = true;
					}
				}
				
				if(!found) {
					System.out.println("Record Not Found.");
				}
				else{
					System.out.println("Record Deleted Successfully.");
				}
				System.out.println("------------------------------------------------------------------------------------------------------");
				break;
				
				
			case 5:
				found = false;
				System.out.println("Enter Employee ID to Update");
				empId = sc.nextInt();
				
				ListIterator<EmployeeDetails> li = c.listIterator();
				while(li.hasNext()) {
					EmployeeDetails e = li.next();
					if(e.getEmpId() == empId) {
						System.out.println("Enter new Employee Name : ");
						eName = sc.next();
						System.out.println("Enter new Employee salary : ");
					    salary = sc.nextInt();
						System.out.println("Enter new Employee mailId : ");
						mailId = sc.next();
						
						yearlySalary= salary*12;
						
						li.set(new EmployeeDetails(empId, eName,mailId,yearlySalary));
					found = true;
					}
				}
				
				if(!found) {
					System.out.println("Record Not Found.");
				}
				else{
					System.out.println("Record Updated Successfully.");
				}
				System.out.println("\t\t\t\t **Updated Records**");
				System.out.println("------------------------------------------------------------------------------------------------------");
				 i = c.iterator();
				while(i.hasNext()) {
					EmployeeDetails e = i.next();
					System.out.println(e);
				}
				System.out.println("------------------------------------------------------------------------------------------------------");
				break;
				
				
			case 6:
				System.out.println("\nYou have chosen EXIT !!");
				sc.close();
				sc1.close();
				System.out.println("System Exited Successfully.");
				System.exit(0);
				break;
				
				
			default : System.out.println("\nEnter a correct choice from the List :");
			break;
			
			}
		}
			catch (InputMismatchException e) {
				String str = sc.next();
				System.out.println(str);
				System.out.println("Invalid Input ,Enter correct Choice");
				System.out.println(e);
			}
			
			}
		}
	}

