package patikaOrnekler;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a; int b; int c; int cevre;double u;
		double alan;
		Scanner input = new Scanner(System.in);
		System.out.println("��genin 1.kenar� giriniz:" );
		a = input.nextInt();
		System.out.println("��genin 2.kenar� giriniz:" );
		b = input.nextInt();
		System.out.println("��genin 3.kenar� giriniz:" );
		c = input.nextInt();
		cevre = a+b+c;
		System.out.println("��genin �evresi: " +cevre);
		u = (a+b+c)/2;
		alan = Math.sqrt((u*(u-a)*(u-b)*(u-c)));
		System.out.println("��genin alan�: "  +alan);
	}
}
