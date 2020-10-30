
/**
 * @author SUSHMITHA
 * Date: 22/10/2020
 * Desc: Displaying Prime Numbers upto n
 **/
import java.util.*;

/*
 * creating class PrimeNumber
 */
public class PrimeNumber {
	public static void main(String[] args) {
		/*
		 * creating scanner object
		 */
		Scanner sc = new Scanner(System.in);
		/*
		 * Scanning the input from user using scanner object and initializing it to a
		 * integer variable
		 */
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		/*
		 * calling the method primeNumbers
		 * 
		 * @param number
		 */
		primeNumbers(number);
		/*
		 * closing the scanner
		 */
		sc.close();

	}

	/*
	 * creating the method primeNumbers for displaying prime numbers
	 */
	private static void primeNumbers(int number) {
		/*
		 * looping through for loop upto number
		 */
		for (int i = 1; i <= number; i++) {
			int count = 0;
			/*
			 * looping through j variable upto number
			 */
			for (int j = 1; j <= number; j++) {
				/*
				 * if i modulus j is zero increase the count
				 */
				if (i % j == 0) {
					count++;
				}
			}
			/*
			 * check if count is equal to 2 then print the number
			 */
			if (count == 2) {
				System.out.println(i);
			}
		}

	}

}