package day2;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Age=:");

		int age = sc.nextInt(); // age = 17

		// Condition
		// age>=18 :- Vote
		// Do not Vote

		if (age >= 18) {
			System.out.println("Vote");
		} else {
			System.out.println("You can not Vote");
		}

	}

}
