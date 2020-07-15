package arrayProgrammes;

import java.util.Scanner;

public class ArrayCopy {

	public static void main(String[] args) {
		final int SIZE = 5;
		
		int[] list1 = new int[SIZE];
		int[] list2 = new int[SIZE];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter " + SIZE + " numbers ");
		
		//Get value in list1
		for(int i=0; i< SIZE; i++) {
			list1[i] = sc.nextInt();
		}
		
        //Copy Elemnt to list2
		for(int i=0; i< SIZE; i++) {
			list2[i] = list1[i];
		}
		
		//Display elements of list 2
		for(int i=0; i<SIZE; i++) {
		
			System.out.print(list2[i] + " ");
		}
	}

}
