
/**
 * @author SUSHMITHA
 * Date: 22/10/2020
 * Desc: Calculate sum divided by 3 or 5
 **/
import java.util.*;

/*
 * creating CalculateSum class
 */
public class CalculateSum {

	public static void main(String[] args) {
		/*
		 * creating object for scanner class
		 */
		Scanner sc = new Scanner(System.in);
		/*
		 * Scanning input from user by asking Enter the number and initializing it to
		 * integer variable
		 */
		System.out.println("Enter the number");
		int number = sc.nextInt();
		/*
		 * Calling the calculateSum method and storing the result in integer variable
		 * 
		 * @param number
		 */
		int result = calculateSum(number);
		/*
		 * Displaying the result
		 */
		System.out.println(result);
		/*
		 * closing the scanner
		 */
		sc.close();

	}

	/*
	 * Creating method calculateSum for adding number which is divisible either by 3
	 * or 5
	 */
	private static int calculateSum(int n) {
		/*
		 * initializing the variable sum to zero
		 */
		int sum = 0;
		/*
		 * looping through for loop to sum up number
		 */
		for (int i = 0; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}
		}
		/*
		 * returning the result
		 */
		return sum;
	}

}
