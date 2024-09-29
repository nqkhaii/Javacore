package hoidanit;

import java.util.Scanner;

public class lab3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào cạnh của khối lập phương: ");
		int canh = scanner.nextInt();
		double v = Math.pow(canh, 3);
		System.out.println("Thể tích của khối lập phương là: " + v);

	}
}
