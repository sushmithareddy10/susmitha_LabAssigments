/**
 * Author: Susmitha
 * Date: 22/10/2020
 * Desc: Sum of cubes of a number
 **/

import java.util.*;
public class Sumofcubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();           //taking input from the user
		int result= sumOfCubes(n); 
		System.out.println(result);//passing number as parameter

	}

	private static int sumOfCubes(int n) {
		// TODO Auto-generated method stub
		int sum=0;
		while(n!=0) {
			int r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}
		return sum;    //returning sum value
	}

}
