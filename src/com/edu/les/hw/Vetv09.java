package com.edu.les.hw;

import java.util.Scanner;

public class Vetv09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int z = 0;
		
		System.out.print("Введите длину стороны x: ");
		
		while(!sc.hasNextInt()){
			System.out.print("Вы ввели не целое число ");
			sc.next();
		}
		x = sc.nextInt();
		
		System.out.print("Введите длину стороны y: ");
		while(!sc.hasNextInt()){
			System.out.print("Вы ввели не целое число ");
			sc.next();
		}
		y = sc.nextInt();
		
		System.out.print("Введите длину стороны z: ");
		while(!sc.hasNextInt()){
			System.out.print("Вы ввели не целое число ");
			sc.next();
		}
		z = sc.nextInt();
		
		if((x == y) && (x == z)) {
			System.out.print("треугольник равносторонний ");
		} else {
			System.out.print("треугольник не равносторонний ");
		}
		
		sc.close();
		

	}

}
