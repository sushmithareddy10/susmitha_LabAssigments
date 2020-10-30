
/**
 * @author SUSHMITHA
 * Date: 22/10/2020
 * Desc: Checks if the entered number increasing number
 **/

import java.util.*;

/*
 * creating class CheckNumber
 */
public class CheckNumber {

	public static void main(String[] args) {
		/*
		 * creating object for scanner class
		 */
		Scanner sc = new Scanner(System.in);
		/*
		 * scanning input from user by scanner object and intitializing it to integer
		 * variable
		 */
		System.out.println("Enter the number");
		int number = sc.nextInt();
		/*
		 * calling the checkNumber method and initializing the result to boolean
		 * variable
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
	 * creating the checkNumnber method to check if the number is increasing number
	 */
	private static boolean checkNumber(int n) {
		/*
		 * creating variable integer and assining it to zero
		 */
		int count = 0;
		/*
		 * looping through while loop
		 */
		while (n != 0) {
			/*
			 * getting reminder by modulus
			 */
			int digit = n % 10;
			n = n / 10;
			int temp = n;
			while (temp != 0) {
				int r = temp % 10;
				temp = temp / 10;
				/*
				 * checking if reminder is greater than previous number
				 */
				if (digit < r) {
					count++;
					break;
				}
			}
		}
		/*
		 * if count is zero the there is no number greater than before reminder
		 */
		if (count == 0) {
			/*
			 * returning the result
			 */
			return true;
		}
		/*
		 * returning the valu if count is greater than zero
		 */
		return false;
	}

}
