package com.Question2.BST.service;
public class BSTtransactions {
	public static Node node;
	public static Node headnode = null;
	public static Node prevnode = null;

	public class Node{
		int key;
		Node left;
		Node right;
		public Node(int data) {
			key = data;
			left = right = null;
		}
	}
	Node root;
	public BSTtransactions(){
		root = null;
	}
	BSTtransactions(int value){
		root = new Node(value);
	}
	public Node insert(int key) {
		root = insertRec(root,key);
		return root;
	}
	public Node insertRec(Node root,int data1) {
		if(root==null) {
			root = new Node(data1);
		}
		if(data1 < root.key) 
			root.left = insertRec(root.left,data1);
		if(data1 > root.key)
			root.right = insertRec(root.right,data1);
		return root;
	}
	public static void rightskewedBST(Node root){
		if(root == null){
			return;
		}
		if(headnode == null) {
			headnode = root;
			root.left = null;
			prevnode = root;
		}
		else {
			prevnode.right=root;
			root.left=null;
			prevnode = root;
		}
			rightskewedBST(root.right);		
	}
		public static void traverseSkewedBst(Node root) {
				if(root!=null) {
					System.out.print(root.key+" ");
					traverseSkewedBst(root.right);
				}else {
					System.out.println("end of tree");
				}
		}
	}
