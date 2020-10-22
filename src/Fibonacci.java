/**
 * Author: Susmitha
 * Date: 22/10/2020
 * Desc: Fabonacci series using Recursive and Non-Recursive
 **/

import java.util.*;
class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number= sc.nextInt();  //User Input
		int a=0,b=1;
		fabonacciNonRecursive(number,a,b); //Non-Recursive method
		System.out.println("\n\n");
		for(int i=0;i<number;i++) {
			System.out.print(fabonacciRecursive(i)+" "); //Recursive method
		}
		
	}
 
	//Method for Recursive
	private static int fabonacciRecursive(int i) {
		if(i==0) {
			return 0;
		}
		if(i==1 || i==2 ) {
			return 1;
		}
		return fabonacciRecursive(i-2)+fabonacciRecursive(i-1);
	}

	 //Method for Non-Recursive
	private static void fabonacciNonRecursive(int n,int a, int b) {
		System.out.print(a+" "+b+" ");
		while(n!=0) {
			int sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
			n--;
			
		}

		
	}

}
