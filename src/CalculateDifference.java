/**
 * Author: Susmitha
 * Date: 22/10/2020
 * Desc: Calculate the difference between sum of squares and square of sum
 **/

import java.util.*;
public class CalculateDifference {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=sc.nextInt();                      //User Input
		int result=calculateDifference(number);       //Calling Method
		System.out.println(Math.abs(result));         //Displaying result
	}
    
	// Calculate the difference between sum of squares and square of sum
	private static int calculateDifference(int number) {
		int sumOfsquare=0, squareOfSum=0,sum=0;
		for(int i=0;i<=number;i++) {
			sumOfsquare=sumOfsquare+(i*i);
			squareOfSum=squareOfSum+i;
		}
		sum=sumOfsquare-(squareOfSum*squareOfSum);
		return sum;
	}

}
