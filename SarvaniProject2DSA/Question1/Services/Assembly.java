package com.construction.Services;
import java.util.Stack;
public class Assembly {
	int len;
	int n;
	Stack<Integer> stack = new Stack<>();
	Stack<Integer> stack2 = new Stack<>();
	public int Searchmaxnoindex(int arri[], int k) {
		int temp=0;
		for(int i=0; i<arri.length;i++) {
			if(arri[i]==k) {
			 temp = i;
			}
		}
		return temp;
	}
	public void Assembleinorder(int arr1[], int arr2[]) {
		len = arr2.length;
		int i=0;int j=0;
		while(i<=(len-1)) {
			n = Searchmaxnoindex(arr1,arr2[i]);
				while(j<=n) {
					if(arr1[j]!=arr2[i]){
						if(arr2[i+1]==arr1[j]) {
						stack.push(arr1[j]);
						System.out.println("Day:"+j+"\n\n");
						j++;
			            }
					}
					else {   
					if (arr1[j]==arr2[i]) {
						stack.push(arr1[j]);
						break;
					}
			            }
				} System.out.println("Day:"+n+"\n");
			    while(!stack.empty()) {
				int m=stack.pop();
				System.out.println(m+" ");
				i++;
				j++;
			    }
			}
		}
	}
