package com.edu.les.hw;

public class Vetv08 {

	public static void main(String[] args) {
		double x = 125.16;
		double t = 5125.16;
		
		double r = x * x;
		double u = t * t;
		
		if(!(r == u)) {
			if(r < u) {
				System.out.println("квадрат х меньше");
			} else {
				System.out.println("квадрат t меньше");
			}
		} else {
			System.out.println("квадраты равны");
		}

	}

}
