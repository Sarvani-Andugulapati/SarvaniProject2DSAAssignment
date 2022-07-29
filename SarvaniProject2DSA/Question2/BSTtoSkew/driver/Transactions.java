package com.Question2.BSTtoSkew.driver;

import com.Question2.BST.service.BSTtransactions;
import com.Question2.BST.service.BSTtransactions.Node;

import java.util.Scanner;
public class Transactions {
	static int n;
	public static void main(String args[]) {
		int data;
		Node node = null;
		BSTtransactions bsttrans = new BSTtransactions();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter total no of transactions\n");
		n = sc.nextInt();
		System.out.println("Please enter the transactions\n");
		for(int i=0;i<n;i++) {
			data = sc.nextInt();
			node = bsttrans.insert(data);
		}
		BSTtransactions.rightskewedBST(node);
		System.out.println("Transactions in skewed tree are:");
		BSTtransactions.traverseSkewedBst(BSTtransactions.headnode);
		sc.close();
	}
}
