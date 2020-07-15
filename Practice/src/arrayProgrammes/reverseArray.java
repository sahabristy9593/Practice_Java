package arrayProgrammes;

import java.util.Scanner;

public class reverseArray {

	public static void main(String[] args) {
		int size;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array");
		size = sc.nextInt();
		
		int[] list = new int[size];
		System.out.print("Enter" + list.length + " integers ");
		
		for(int i=0; i<list.length; i++) {
			list[i] = sc.nextInt();
		}
		
		int temp;
		
		for(int i =0; i<list.length/2; i++) {
			
			temp = list[i];
			list[i]= list[list.length - i- 1];
			list[list.length - i- 1] = temp;
			
			
		}
		System.out.print("Reverse Array : " );
		//display the reverse array
		for(int i=0; i<list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}

}
