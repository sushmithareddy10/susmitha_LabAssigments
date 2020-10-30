
/**
 * @author SUSHMITHA
 * Date: 22/10/2020
 * Desc: Calculate the difference between sum of squares and square of sum
 **/

import java.util.*;

/*
 * Creating a CalculateDifference class
 */
public class CalculateDifference {

	public static void main(String[] args) {
		/*
		 * creating scanner class object
		 */
		Scanner sc = new Scanner(System.in);
		/*
		 * Scanning the input from the user by asking Enter the number
		 */
		System.out.println("Enter the number: ");
		int number = sc.nextInt();

		/*
		 * calling the calculate difference method and storing in Integer variable
		 * 
		 * @param number
		 */
		int result = calculateDifference(number);

		/*
		 * Displaying the result
		 */
		System.out.println(Math.abs(result));
		/*
		 * closing the scanner
		 */
		sc.close();
	}

	/*
	 * creating the calculate difference method to find the between sum of squares
	 * and squares of sum
	 */
	private static int calculateDifference(int number) {
		/*
		 * Initializing the variables to zero
		 */
		int sumOfsquare = 0, squareOfSum = 0, sum = 0;
		/*
		 * looping through for loop to find sum
		 */
		for (int i = 0; i <= number; i++) {
			sumOfsquare = sumOfsquare + (i * i);
			squareOfSum = squareOfSum + i;
		}
		sum = sumOfsquare - (squareOfSum * squareOfSum);
		/*
		 * returning the result
		 */
		return sum;
	}

}
