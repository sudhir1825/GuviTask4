package Task4;
import java.util.Scanner;

class AgeNotWithinRange extends Exception{//Class to handle exception AgeNotWithinRange
	
	public AgeNotWithinRange(String s) {//Method to print the message
		super(s);
	}
}

class NameNotValidException extends Exception{//Class to handle exception NameNotValidException

	public NameNotValidException(String s) {//Method to print the message
		super(s);
	}
}
public class Student {
	//Attributes of Student class
	long rollNo;
	String name;
	int age;
	String course;
	
	
	public Student(long rollNo,String name,int age,String course) {//Parameterized Constructor
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.course = course;
	}
	
	public static void main(String[] args) {
		System.out.println("Student Management System");
		Scanner sc = new Scanner(System.in);
		
		while(true) {//Loop to run until all the details are entered properly (Without Exceptions)
			System.out.print("\n\nEnter student Roll Number: ");
			long rollno = sc.nextLong();//Get Roll number of the Student
			
			sc.nextLine();
			System.out.print("Enter student Name: ");
			String name ;//Get name of the Student
			
			try {
				name = sc.nextLine();
				
				for(int i =0 ;i<name.length();i++) {
					//if condition to check  whether the name has any special characters and excludes SPACE 
					//ASCII NUMBERS ARE USED
					if((name.charAt(i) < 65 && name.charAt(i) != 32 )|| 
							(name.charAt(i) > 90 && name.charAt(i)<97)
							|| name.charAt(i) > 122  ) {
						//this will throw an exception 'NameNotValidException'
						throw new NameNotValidException("Enter the Name without Special character");
					}
				}
			}catch(NameNotValidException e){
				System.out.println(e);//Name has Special Characters
				continue;
			}
			
			System.out.print("Enter student Age: ");
			int age = 0;
			try {
				age = sc.nextInt();//Get age of the Student
				if(age < 15 || age > 21 ) {
					//this will throw an exception 'AgeNotWithinRange'
					throw new AgeNotWithinRange("Enter the corrcet age(Between 15 to 21)");
				}
			}
			catch(AgeNotWithinRange e){
				System.out.println(e);//Age is Not within Range
				continue;
			}
			
			sc.nextLine();
			System.out.print("Enter student Course: ");
			String course = sc.nextLine();//Get course of the Student
			
			Student obj = new Student(rollno,name,age,course);//Invoke the constructor
			System.out.print("Student data stored successfully");
			break;//Once process over end's the program
		}
		

	}

}


