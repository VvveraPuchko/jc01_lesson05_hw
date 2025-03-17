package com.edu.les.hw;

public class Vetv07 {

	public static void main(String[] args) {
		double x = 5.0;
		double a = 9.3;
		double b = 7.8;
		double c = -654.7;
		
		double res = a * x * x + b * x + c;
		
		if(res < 0) {
			res = -res;
		}
		
		System.out.println(res);
		


	}

}
