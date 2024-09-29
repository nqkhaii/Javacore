package hoidanit;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("firt number: ");
		int name = scanner.nextInt();
		System.out.println("second number:: ");
		int age = scanner.nextInt();
		System.out.println("Max = " + Math.max(name, age));
		scanner.close();
	}

}
