
/**
 * @author SUSHMITHA
 * Date: 22/10/2020
 * Desc: Checks if the entered number is a power of two or not 
 **/

import java.util.*;

/*
 * creating class PowerOfTwo
 */
public class PoweOfTwo {

	public static void main(String[] args) {
		/*
		 * creating scanner object
		 */
		Scanner sc = new Scanner(System.in);
		/*
		 * scanning input from user and intitializing it to integer variable
		 */
		int number = sc.nextInt();
		/*
		 * calling the method checkNumber and storing the result in boolean variable
		 */
		boolean result = checkNumber(number);
		/*
		 * displaying the result
		 */
		System.out.println(result);
		/*
		 * closing the scanner
		 */
		sc.close();

	}

	/*
	 * creating the method checkNumber if number is power of 2 or not
	 */
	private static boolean checkNumber(int number) {
		/*
		 * initializing integer variable to 1
		 */
		int mul = 1;
		/*
		 * looping through for loop
		 */
		for (int i = 0; i < number; i++) {
			/*
			 * multiplying the mul variable with 2
			 */
			mul = mul * 2;
			/*
			 * checking if multiple is equal to scanned number
			 */
			if (mul == number) {
				/*
				 * if condition is true it returns true value
				 */
				return true;
			}

		}
		/*
		 * if condition fails it returns false
		 */
		return false;
	}

}
