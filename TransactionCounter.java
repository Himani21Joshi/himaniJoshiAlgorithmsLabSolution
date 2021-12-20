package com.greatlearning.transaction;

import java.util.Scanner;

public class TransactionCounter {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the size of transaction array");
		
		int  noOfTransactions = sc.nextInt();
		
		int arr[] = new int[noOfTransactions];
		
		System.out.println("Enter the values of array");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		
		int noOfTargets = sc.nextInt();
		
		while(noOfTargets-- != 0) {
			
			System.out.println("Enter the value of target");
			long targetValue = sc.nextInt();
			
			boolean isTargetAchieved = false;
			
			long sum = 0;
			for(int i = 0; i < arr.length; i++) {
				sum = sum + arr[i];
				
				if(sum >= targetValue) {
					System.out.print("Target achieved after " +(i+1));
					System.out.println(" transactions");
					isTargetAchieved = true;
					break;
				}
			}
			if(isTargetAchieved == false) {
				System.out.println("Given target is not achieved");
			}
		}
	}
}
