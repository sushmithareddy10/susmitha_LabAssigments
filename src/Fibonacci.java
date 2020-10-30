
/**
 * @author SUSHMITHA
 * Date: 22/10/2020
 * Desc: Fabonacci series using Recursive and Non-Recursive
 **/

import java.util.*;

/*
 * creatin Fibonacci class
 */
class Fibonacci {
	public static void main(String[] args) {
		/*
		 * creating scanner object
		 */
		Scanner sc=new Scanner(System.in);
	    /*
	     * creating integer variable to scan input from user using scanner object
	     */
		int number= sc.nextInt(); 
		/*
		 * initializing variables and assigning it to zero
		 */
		int a=0,b=1;
		/*
		 * calling fabonacciNonRecursive method
		 * @param number,a,b
		 */
		fabonacciNonRecursive(number,a,b); 
		System.out.println("\n\n");
		/*
		 * looping through for loop and calling fabonacciRecursive method 
		 */
		for(int i=0;i<number;i++) {
			System.out.print(fabonacciRecursive(i)+" "); 
		}
		/*
		 * closing the scanner
		 */
		sc.close();
		
	}

	/*
	 * creating method fabonacciRecursive to display fibonacci series
	 */
	private static int fabonacciRecursive(int i) {
		/*
		 * checking if the parameter is equal to zero and returning value
		 */
		if (i == 0) {
			return 0;
		}
		/*
		 * checking if parameter is equal to 1 or 2 and returning value
		 */
		if (i == 1 || i == 2) {
			return 1;
		}
		/*
		 * if above condition fails then returning value by calling method
		 */
		return fabonacciRecursive(i - 2) + fabonacciRecursive(i - 1);
	}

	/*
	 * creating method fabonacciNonRecursive
	 */
	private static void fabonacciNonRecursive(int n, int a, int b) {
		/*
		 * displaying the values of a and b
		 */
		System.out.print(a + " " + b + " ");
		/*
		 * looping through while loop
		 */
		while (n != 0) {
			/*
			 * adding the values of a and b
			 */
			int sum = a + b;
			/*
			 * displaying the sum
			 */
			System.out.print(sum + " ");
			/*
			 * giving b value to a, sum value to b
			 */
			a = b;
			b = sum;
			/*
			 * decrementing n value
			 */
			n--;

		}

	}

}
