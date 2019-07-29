package App;

import java.util.Scanner;

public class HealthyHearts {
	static void hearts() {
		
		int age;
		int minHR;
		int maxHR;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age: ");
		age = sc.nextInt();
		int bpm = 220-age;
		minHR = (int) Math.floor(bpm * .50);
		maxHR = (int) Math.floor(bpm* .85);
				
		System.out.println("Your max hart rate should be "+bpm+" beats per minute");
		System.out.println("Your target HR Zone is "+minHR+" - "+maxHR+" beats per minute");
	}
}
