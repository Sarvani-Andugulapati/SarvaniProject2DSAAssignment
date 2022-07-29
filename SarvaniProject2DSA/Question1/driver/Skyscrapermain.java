package com.construction.driver;
import java.util.Scanner;

import com.construction.Services.*;

public class Skyscrapermain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Assembly asm = new Assembly();
		SortedFloorList sfl = new SortedFloorList();
		 int[] floorsize;
		 int[] fseq;
		 int[] farr;
			
		FloorstoAssemble fa = new FloorstoAssemble();
		
		floorsize = fa.ListofFloors();
		farr = new int[floorsize.length];
		for(int i=0;i<floorsize.length;i++) {
			farr[i]=floorsize[i];
		}
		fseq = sfl.Sort(farr, 0, farr.length-1);
		
		for(int i=0;i<floorsize.length;i++) {
			System.out.print(floorsize[i]+" ");
		}
		for(int i=0;i<fseq.length;i++) {
			System.out.print(fseq[i]+" ");
		}
		asm.Assembleinorder(floorsize, fseq);
		sc.close();
	}
}
