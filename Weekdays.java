package Task4;

import java.util.Scanner;

public class Weekdays {
											//Indicates this method may throw an Exception
	public static void main(String[] args)throws ArrayIndexOutOfBoundsException {
		Scanner sc = new Scanner(System.in);
		//String Array to Store days
		String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
		System.out.print("Enter the number from 0-6 : ");
		int index = sc.nextInt();//Get index from User
		
		try {
			System.out.println("\n"+index+"th day is: "+days[index]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array out of Bound");//Message to be printed if number is entered 
			//greater than 6.
		}
		
	}

}
