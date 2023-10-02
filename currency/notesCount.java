package currency;

import java.util.Arrays;

public class notesCount {

	public void counting(int[] currency, int amount) {
		// TODO Auto-generated method stub
		int notes[]=new int[currency.length];
		int sumOfNotes =0;
		 
		for (int i = 0; i < currency.length; i++) {
			notes [i]=amount/currency[i];
			sumOfNotes = sumOfNotes=notes[i];
			 amount = amount%currency[i];
			 
		}
		//System.out.println(Arrays.toString(notes));
		for (int i = 0; i < currency.length; i++) {
			System.out.println(currency[i] + "X" + notes[i]);
		}
		System.out.println("Total Number of Amount " + sumOfNotes);
	}

}
