/*package com.construction.Test;

import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		int front;
		int rear;
		int arr[];
//	public int[] ListofFloors() {
		System.out.println("Enter the number of floors in Skyscraper:");
		size = sc.nextInt();
		front = -1;
		rear = -1;
		arr = new int[size];
		for(int i=0;i<size;i++) {
		System.out.println("Enter the floor size given on day:"+" "+(i+1));
			rear++;
			arr[rear]=sc.nextInt();
			if(front==-1) {
				front = 0;
			}
		}
		for(int i=0;i<size;i++) {
		System.out.print(arr[i]+" ");
		}
		}
	int n1,n2;
	public int[] Sortlist(int[] arr, int left,int mid, int right) {
		n1 = mid - left +1;
		n2 = right - mid;
		int leftArr[] = new int[n1];
		int rightArr[] = new int[n2];
		for(int i=0; i<n1; i++) 
			leftArr[i] = arr[left+i];
		for (int j=0;j<n2;j++)
			rightArr[j] = arr[right+j];
		
		int i=0; int j=0; int k=left;
		
		while(i<n1 && j<n2) {
			if(leftArr[i]>=rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			}else {
				arr[k]=rightArr[j];
				j++;
			}
			k++;
		}
		while(i<n2) {
			arr[k]=leftArr[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=rightArr[j];
			j++;
			k++;
		}return arr;
	}
	public void Sort(int[] temp, int lt, int rt) {
		if(lt<rt) {
			int m = (lt+rt)/2;
			
			Sort(temp,lt,m);
			Sort(temp,m+1,rt);
			
			Sortlist(temp,lt,m,rt);
		}
	}
		}*/

