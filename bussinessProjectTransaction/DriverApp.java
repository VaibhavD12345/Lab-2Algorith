package bussinessProjectTransaction;

import java.util.Arrays;
import java.util.Scanner;

public class DriverApp {
                 //command line Argument
	public static void main(String[] args) {
		
		int nod;
		Scanner sc = new Scanner(System.in);
		System.out.println("Pleace enter Number of days shop wil be open");
		nod=sc.nextInt();
		int trans[]=new int [nod];
		
		for (int i = 0; i < trans.length; i++)
		{
			System.out.println("Please enter income of traget"+(i+1));
			trans[i]=sc.nextInt();
			
		}
		
		System.out.println(Arrays.toString(trans));
		
		System.out.println("Please enter number of targets");
		
		int target = sc.nextInt();
		int sum;
		int flag;
		
		for (int i = 1; i < trans.length; i++) {
			sum=0;
			flag =0;
			System.out.println("Please enter target"+i);
			
			target =sc.nextInt();
			for (int j = 0; j < trans.length; j++) {
				sum=sum+trans[j];
				if(sum>= target) {
					flag=1;
					System.out.println("target is achived on day"+(j+1));
					break;
				}
				
			}
			if(flag==0) {
				System.out.println("Target is not achived");
			}
		}
		

	}

}
