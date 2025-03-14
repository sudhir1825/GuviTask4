package Task4;

import java.util.Scanner;
import java.util.Stack;//To use the java Collections

public class Stackprocess {
	Stack<Integer> stack = new Stack<>();//Stack created
	
	public void push(int val) {//Method to push
		stack.push(val);
		System.out.println("\n\nSuccessfully pushed into the stack");
	}
	
	public void pop() {//Method to Pop
		stack.pop();
		System.out.println("\n\nSuccessfully poped out of the stack");
	}
	
	public void empty() {//Method to check if stack is Empty
		if(stack.isEmpty()) {
			System.out.println("Stack is Empty");
		}
		else {
			System.out.println("Stack is not Empty ,it has values:"+stack);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stackprocess obj = new Stackprocess();//Object created to the class Stackprocess
		
		System.out.println("Stack Operations");
		Scanner sc = new Scanner(System.in);
		
		while(true) {//Loop to run until user wants it to terminate/Exit
			System.out.print("\n\n1. Push\n2. Pop\n3. Check isEmpty\n4. Exit"
					+ "\nEnter the number[1/2/3/4]: ");
			int choice = sc.nextInt();//to get choice from user to make a process
			sc.nextLine();
			if(choice == 1) {
				System.out.print("\nEnter the number to push:");
				int val = sc.nextInt();//Get Number to push
				obj.push(val);//Call a method to push 
			}
			else if(choice == 2) {
				obj.pop();//Call a method to pop
			}
			else if(choice == 3) {
				obj.empty();//Call a method to check stack is empty 
			}
			else {
				break;
			}
		}
		System.out.println("\n\nThank you..");
		
		
	}

}
