package Task4;

import java.util.Scanner;

class AgeNotValid extends Exception{//Class to handle exception AgeNotValid
	
	public AgeNotValid(String s) {//Method to print the message
		super(s);
	}
}

public class Voter {
	//Attributes of Voter class
	long voterId;
	String name;
	int age;
	
	public Voter(long voterId,String name,int age) {//Parameterized Constructor
		this.voterId = voterId;
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vote Registration\n");
		int check = 0;//to check registration is successful or not
	
			
			System.out.print("Enter the VoterId: ");
			long voteid = sc.nextLong();//Get Voter id from User
			
			sc.nextLine();
			System.out.print("Enter the Voter Name: ");
			String name = sc.nextLine();//Get name from User
			
			
			System.out.print("Enter the Voter Age: ");
			int age = 0;
			try {
				age = sc.nextInt();//Get age from User
				if(age<18) {
					//this will throw an exception 'AgeNotValid'
					throw new AgeNotValid("Invalid Age for Voter");
					
				}
			}catch(AgeNotValid e){
				System.out.println(e);
				check = 1;
			}
			if(check ==0) {
				Voter obj = new Voter(voteid,name,age);
				System.out.print("\n\nRegistration Successfull...");
			}else {
				System.out.print("\n\nRegistration Unsuccessfull..");
			}
		
	}
}
