package App;

import java.util.Scanner;

public class BestAdder {
		
	static void adder() {
		int meaningOfLife;
		double pi;
		String cheese;
		String color;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Give me pi to at least 5 decimals: ");
		pi = sc.nextDouble();
		
		System.out.println("What is the meaning of life? the uinverse & everything? (Number)");
		meaningOfLife = sc.nextInt();
		
		System.out.println("What is your favorite kind of cheese? ");
		cheese = sc.next();
		
		System.out.println("Do you like the color red or green more?");
		color = sc.next();
		
		System.out.println("Ooh, "+color+" "+cheese+" sounds delicious!");
		System.out.println("And fun fact: the circumfrence of life is "+(2*pi*meaningOfLife));
	}
}
