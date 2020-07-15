package arrayProgrammes;

import java.util.Scanner;

public class MaxMinElement {
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
		
		int max = list[0];
		int min = list[0];
		
		for(int i=1; i<list.length; i++) {
			if(list[i]> max) {
				max = list[i];
			}
			if(list[i]< min) {
				min = list[i];
			}
		}
		System.out.println("Largest Element : " + max + " Smallest Element :" + min);
	}

}
