package currency;

import java.util.Arrays;
import java.util.Scanner;

public class DriverApp {

	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
       System.out.println("Please Enter number of currency notes in our country");
       int size = sc.nextInt();
       
       int currency[] = new int [size];
        
       System.out.println("Please enter the " +size+ " currency denomination");
        
       for (int i = 0; i < currency.length; i++) {
    	   currency[i]=sc.nextInt();
    	 }
        System.out.println("Before Sorting" +Arrays.toString(currency));
        
        MergeSort ms = new MergeSort();
        ms.sort(currency, 0, size-1);
        
        System.out.println("After Sorting" +Arrays.toString(currency));

        System.out.println("Please Enter total amount");
        int amount = sc.nextInt();
        
        notesCount nc = new notesCount();
        nc.counting(currency,amount);
       
	}

}
