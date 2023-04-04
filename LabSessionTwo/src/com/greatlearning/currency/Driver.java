package com.greatlearning.currency;

import java.util.Scanner;

public class Driver {

	public static void main(String[]args) {
	//IntegerSorting sorting=new BubbleSort() ;
	 IntegerSorting sorting=new MergeSort() ;
	 NotesCount counting = new NotesCount();
	 
	 System.out.println("Enter the size of currency denominations");
	 Scanner sc=new Scanner(System.in);
	 int size=sc.nextInt();
	 int[] notes=new int[size];
	 System.out.println("Enter the currency denominations values");
	 
	 for(int i=0;i<size;i++){
		 notes[i]=sc.nextInt();
	 }
	 
	 System.out.println("Enter the size of amount you want to pay");
	 int amount=sc.nextInt();
	 
	 sorting.sort(notes);
	 counting.calculateNotesCount(notes, amount);
	
	 sc.close();
	}

}
