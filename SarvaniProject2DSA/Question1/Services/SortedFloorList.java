package com.construction.Services;

public class SortedFloorList {
	int n1,n2;
	public int[] Sortlist(int[] arr,int left, int mid, int right) {
		n1 = mid - left +1;
		n2 = right - mid;
		int leftArr[] = new int[n1];
		int rightArr[] = new int[n2];
		for(int i=0; i<n1; ++i) 
			leftArr[i] = arr[left+i];
		for (int j=0;j<n2;++j)
			rightArr[j] = arr[mid+1+j];
		
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
		while(i<n1) {
			arr[k]=leftArr[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=rightArr[j];
			j++;
			k++;
		}
		return arr;
	}
	public int[] Sort(int[] temp, int lt, int rt) {
		if(lt<rt) {
			int m = (lt+(rt-1))/2;
			
			Sort(temp,lt,m);
			Sort(temp,m+1,rt);
			
			Sortlist(temp,lt,m,rt);
		}
		return temp;
	}
}

