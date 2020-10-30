
/**
 * @author SUSHMITHA
 * Date: 22/10/2020
 * Desc: Traffic Lights with message
 **/
import java.util.*;

/*
 * creating class traffic light
 */
public class TrafficLigth {

	public static void main(String[] args) {
		/*
		 * creating scanner object
		 */
		Scanner sc = new Scanner(System.in);
		/*
		 * displaying menu red, yellow , green
		 */
		System.out.println("1.Red\n2.Yellow\n3.Green");
		/*
		 * creating variable integer number for scanning input from user
		 */
		int number = sc.nextInt();
		/*
		 * calling method findMessage
		 * 
		 * @param number
		 */
		String message = findMessage(number);
		/*
		 * displaying the result
		 */
		System.out.println("The Message is: " + message);
		/*
		 * closing the scanner
		 */
		sc.close();

	}

	/*
	 * 
	 */
	private static String findMessage(int n) {
		/*
		 * if n==1 return stop
		 */
		if (n == 1) {
			return "Stop";
		}
		/*
		 * if n==2 return ready
		 */
		else if (n == 2) {
			return "Ready";
		}
		/*
		 * if n==3 return green
		 */
		else if (n == 3) {
			return "Green";
		}
		/*
		 * if any condition fails return null
		 */
		return null;
	}

}
