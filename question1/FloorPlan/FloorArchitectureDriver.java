package com.gl.question1.FloorPlan;

import java.util.Scanner;

public class FloorArchitectureDriver {

	public static void main(String[] args) {
		
Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the total number of floors in the building : ");
		int numFloors = in.nextInt();
		
		int[] FloorSizeArr = new int[numFloors];
		for (int i = 1; i <= numFloors; i++) {
			System.out.println("Enter the floor size given on day : " + i);
			FloorSizeArr[i - 1] = in.nextInt();
		}
		
		Queue[] solution = FloorBuildOrder.build(FloorSizeArr);
		System.out.println("The order of construction is as follows: ");
		for (int i = 0; i < numFloors; i++) {
			int temp = i + 1;
			System.out.println("\nDay: " + temp);
			
			while (!solution[i].isEmpty()) {
				System.out.print(solution[i].remove() + " ");
			}
		}
		
		in.close();

	}

}
