package day2;

import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Num=:");

		int num = sc.nextInt();

		System.out.println("Num1=:");

		int num1 = sc.nextInt();

//		int sum = num + num1;
//
//		System.out.println("The sum =:" + sum);
//
//		int sub = num - num1;
//		System.out.println("The sub=:" + sub);

		int div = num / num1;

		System.out.println("Divison =:" + div);

		int mod = num % num1;
		System.out.println("Mod=:" + mod);

	}

}
