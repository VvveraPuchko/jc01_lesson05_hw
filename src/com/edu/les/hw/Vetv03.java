package com.edu.les.hw;

import java.util.Scanner;

public class Vetv03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		
		System.out.print("Type Integer ");
		
		while(!sc.hasNextInt()){
		System.out.print("It is not an integer: ");
		sc.next();
		}
		a = sc.nextInt();
		System.out.println("Your integer: " + a);
		
	
		
		if(a < 3) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		sc.close();
		
		

	}

}
