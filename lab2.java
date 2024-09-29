package hoidanit;

import java.util.Scanner;

public class lab2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập vào cạnh dài của hcn:");
		int a = scanner.nextInt();
		System.out.println("Nhập vào cạnh rộng của hcm:");
		int b = scanner.nextInt();
		System.out.println("chu vi của hcn là: " + (a + b) * 2);
		System.out.println("chu vi của hcn là: " + (a * b));
		System.out.println("chu vi của hcn là: " + Math.min(a, b));
		scanner.close();
	}
}
