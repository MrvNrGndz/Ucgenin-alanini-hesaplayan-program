package patikaOrnekler;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a; int b; int c; int cevre;double u;
		double alan;
		Scanner input = new Scanner(System.in);
		System.out.println("Üçgenin 1.kenarý giriniz:" );
		a = input.nextInt();
		System.out.println("Üçgenin 2.kenarý giriniz:" );
		b = input.nextInt();
		System.out.println("Üçgenin 3.kenarý giriniz:" );
		c = input.nextInt();
		cevre = a+b+c;
		System.out.println("Üçgenin çevresi: " +cevre);
		u = (a+b+c)/2;
		alan = Math.sqrt((u*(u-a)*(u-b)*(u-c)));
		System.out.println("Üçgenin alaný: "  +alan);
	}
}
