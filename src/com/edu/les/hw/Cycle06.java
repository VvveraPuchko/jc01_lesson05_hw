package com.edu.les.hw;

import java.util.Scanner;

public class Cycle06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int i = 1;
		int sum = 0;
		
		System.out.println("Введите целое положительное число: ");
		
        while (true) {
            if (!sc.hasNextInt()) { 
                System.out.println("Вы ввели не целое число ");
                sc.nextLine(); 
            } else {
                x = sc.nextInt();
                if (x > 0) { 
                    break;
                } else {
                    System.out.println("Число должно быть больше нуля ");
                }
            }
        }
		
		while(i <= x) {
			sum = sum + i;
			i++;
		}
		
		System.out.println(sum);
		
		sc.close();
		

	}

}
