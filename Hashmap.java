package Task4;

import java.util.Scanner;
import java.util.HashMap;//To use the java Collections
import java.util.Map;//To use the java Collections

public class Hashmap {
	Map<String,Integer> map = new HashMap<>();//Map is created
	Scanner sc = new Scanner(System.in);
	
	public void addStudent() {//Method to add a Student
		
		System.out.print("\n\nEnter the Name of the Student: ");
		String name = sc.nextLine();//Get name from User
		System.out.print("Enter the Mark of the Student: ");
		int mark = sc.nextInt();//Get Mark from User
		sc.nextLine();
		
		map.put(name, mark);//to add in map
		
		System.out.println("\n\nStudent successfully added");
	}
	
	public void display() {//Method to display Students
		System.out.print("\n"+map+"\n");
	}
	
	public void remove() {//Method to remove a Student
		System.out.print("\n\nEnter the Name of the Student to remove: ");
		String name = sc.nextLine();//Get name from User
		map.remove(name);//To remove a Student with key of the map
		
		System.out.println("\nStudent successfully removed");
	}
	
	public static void main(String[] args) {
		
		Hashmap obj = new Hashmap();//Object created to the class Hashmap
		System.out.println("Student Registration");
		Scanner sc = new Scanner(System.in);
		
		
		
		
		while(true) {//Loop to run until user wants it to terminate/Exit
			System.out.print("\n\n1. Add a Student\n2. Display all students\n3. Remove a Student\n4. Exit"
					+ "\nEnter the number[1/2/3/4]: ");
			int choice = sc.nextInt();//to get choice from user to make a process
			sc.nextLine();
			if(choice == 1) {
				obj.addStudent();//Call's a method to add a Student
			}
			else if(choice == 2) {
				obj.display();//Call's a method to display all Students
			}
			else if(choice == 3) {
				obj.remove();//Call's a method to remove a Student
			}
			else {
				break;
			}
		}
		System.out.println("\n\nThank you..");
	}
}
