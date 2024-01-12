package day2;

import java.util.Scanner;

public class NumberLine {

	public static void main(String[] args) {

		// -ve 0 +ve

		Scanner sc = new Scanner(System.in);

		System.out.println("Num=:");

		int num = sc.nextInt(); // num =-90

		if (num > 0) {
			System.out.println("Positive");
		} else if (num < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("Zero");
		}

	}

}
