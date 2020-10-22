/**
 * Author: Susmitha
 * Date: 22/10/2020
 * Desc: Checks if the entered number is a power of two or not 
 **/

import java.util.*;
public class CheckNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");     //User Input
		int number=sc.nextInt();
		boolean result=checkNumber(number);         //Calling Method
		System.out.println(result);                 //Displaying Result
	}
 
//	Check if a number is an increasing number 
	private static boolean checkNumber(int n) {
		int count=0;
		while(n!=0) {
			int digit=n%10;
			n=n/10;
			int temp=n;
			while(temp!=0) {
				int r=temp%10;
				temp=temp/10;
				if(digit<r) {
					count++;
					break;
				}
			}
		}
		if(count==0) {
			return true;
		}
		
		return false;
	}

}
