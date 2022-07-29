package com.construction.Services;
import java.util.Scanner;
public class FloorstoAssemble {
	Scanner sc = new Scanner(System.in);
    int size;
	int[] floors;
public int[] ListofFloors() {
	System.out.println("Enter the number of floors in Skyscraper:");
	size = sc.nextInt();
	floors = new int[size];
	for(int i=0;i<size;i++) {
	System.out.println("Enter the floor size given on day:"+" "+(i+1));
		floors[i]=sc.nextInt();
	}
	return floors;
}
}
