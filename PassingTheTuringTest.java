package App;

import java.util.Scanner;

public class PassingTheTuringTest {
	static void turing() {
		String name;
		String color;
		String fruit;
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello there! \n What is your name?");
		name = sc.next();
		System.out.println("Hi, "+name+"! What is your favorite color? ");
		color = sc.next();
		System.out.println("Huh, "+color+"? Mine's Electric Lime. "
				+ "\nI really like limes. They're my favorite fruit, too."
				+ "\nWhat's YOUR favorite fruit "+name+"? ");
		fruit = sc.next();
		System.out.println("Really? "+fruit+"? That's wild!"
				+ "\nSpeaking of favorites, what's your favorite number? ");
		num = sc.nextInt();
		System.out.println(num+" is a cool number. Mine's -7!"
				+ "\nDid you know that "+num+" * 7 is: "+(num * -7)+"? That's a cool number too!");
		System.out.println("Well thanks for talking to me, "+name+". Bye, bye now!");
		
	}
}
