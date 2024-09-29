package hoidanit;

import java.util.Scanner;

public class lab1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập vào tên của học sinh: ");
		String name = scanner.nextLine();
		System.out.println("Nhập vào điểm của học sinh: ");
		int number = scanner.nextInt();
		System.out.println(name + " có điểm = " + number);
		scanner.close();
	}
}
