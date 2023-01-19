package program_practice;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static int sumUsingLoop(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		if (num > 0) {
			int result = sumUsingLoop(num);
			System.out.println(result);
		} else {
			System.out.println("Given is not a natural number");
		}

	}

}
