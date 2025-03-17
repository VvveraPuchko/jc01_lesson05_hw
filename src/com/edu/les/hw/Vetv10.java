package com.edu.les.hw;

public class Vetv10 {

	public static void main(String[] args) {
		double r1 = 65.3;
		double r2 = 151.1;
		
		double s1 = Math.PI * r1 * r1;
		double s2 = Math.PI * r2 * r2;
		
		if(s2 < s1) {
			System.out.println("площадь 2 круга меньше ");
		} else {
			System.out.println("площадь 1 круга меньше");
		}

	}

}
