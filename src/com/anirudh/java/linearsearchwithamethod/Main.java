package com.anirudh.java.linearsearchwithamethod;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,7,8,9,1,4};
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = in.nextInt();
		boolean answer = find(arr, x);
		if(answer == true) {
			System.out.println("The number is there");
		}
		else {
			System.out.println("The number is not there");
		}

	}
	
	static boolean find (int[] arr, int x) {
		int length = arr.length;
		
		for (int i = 0; i < length; i++) {
			if (arr[i] == x) {
				//The number is there
				return true;
			}
		}
		//the number is not there
		return false;
	}

}
