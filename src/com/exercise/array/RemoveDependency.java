package com.exercise.array;

public class RemoveDependency {
	
	public static int removeDependency(int arr[], int n) {
		
		int temp[] = new int[n];
		int j=0;
		
		if (n==0||n==1) {
			return n;
		}
		
		for(int i =0;i<n-1;i++) {
			
			if( arr[i] != arr[i+1] ) {
				temp[j++]=arr[i];
			}
		}
		
		temp[j++]=arr[n-1];
		
		//Changing to main array
		for (int i=0;i<j;i++) {
			arr[i]=temp[i];
			
		}
		return j;
	}
	
	public static void main(String args[]) {
		
		int arr[] = {10,20,20,30,30,40,50,50};
		int lenght = arr.length;
		
		int length = removeDependency(arr, lenght);
		
		for (int i=0; i< length;i++) {
			System.out.println(arr[i]);
		}
	}

}
