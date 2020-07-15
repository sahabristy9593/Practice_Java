package arrayProgrammes;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		final int SIZE = 10;
		
		// create an array to hold the numbers
		int[] array = new int[SIZE];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter " + SIZE + " numbers ");
		
		for(int i=0; i<SIZE; i++) {
			array[i] = sc.nextInt(); 
			
		}
		    
int sum=0;
//Calculate the sum
for(int i= 0; i<SIZE; i++) {
	sum +=array[i];
	
}

System.out.println("Sum of Numbers : " + sum);
	}

}
