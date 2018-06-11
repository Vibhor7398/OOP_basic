package Assign5;

import java.util.Scanner;

public class complex {
	int real, imag;

	void displayNumber() {
		if (imag < 0) {
			System.out.println(real + "" + imag + "i");
		} else {
			System.out.println(real + "+" + imag + "i");
		}
	}

	public static void main(String[] args) {
		complex c = new complex();
		Scanner sc = new Scanner(System.in);
		c.real = sc.nextInt();
		c.imag = sc.nextInt();
		c.displayNumber();
	}

}
