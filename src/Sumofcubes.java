
/**
 * @author SUSHMITHA
 * Date: 22/10/2020
 * Desc: Sum of cubes of a number
 **/

import java.util.*;

public class Sumofcubes {

	public static void main(String[] args) {
		/*
		 * creating scanner object
		 */
		Scanner sc = new Scanner(System.in);
		/*
		 * scanning the input from user using scanner object
		 */
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		/*
		 * calling the method sumOfCubes
		 * 
		 * @param result
		 */
		int result = sumOfCubes(n);
		/*
		 * displaying the result
		 */
		System.out.println(result);
		/*
		 * close the scanner
		 */
		sc.close();

	}

	/*
	 * creating a method sumOfCubes to find the sum of cubes of number
	 */
	private static int sumOfCubes(int n) {
		/*
		 * creating a varibale sum and assining value zero
		 */
		int sum = 0;
		/*
		 * looping through while loop
		 */
		while (n != 0) {
			/*
			 * finding reminder
			 */
			int r = n % 10;
			/*
			 * finding cube of reminder and adding it to sum
			 */
			sum = sum + r * r * r;
			n = n / 10;
		}
		/*
		 * returning the value
		 */
		return sum;
	}

}
