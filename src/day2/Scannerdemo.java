package day2;

import java.util.Scanner;

public class Scannerdemo {

	public static void main(String[] args) {

		// if you want to get the output on the console so you need to use Scanner for
		// that

		Scanner sc = new Scanner(System.in);

		System.out.println("A=:");
		int a = sc.nextInt();

		System.out.println("B=:");
		int b = sc.nextInt();

		int sum = a + b;

		System.out.println("The sum=:" + sum);

	}

}
