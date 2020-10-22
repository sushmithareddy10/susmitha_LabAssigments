/**
 * Author: Susmitha
 * Date: 22/10/2020
 * Desc: Calculate sum divided by 3 or 5
 **/
import java.util.*;
public class CalculateSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();           //User Input
		int result= calculateSum(number);  //Calling Method
		System.out.println(result);          //Displaying result
		
	}
	
	//CalculateSum which are divisible by 3 or 5
	private static int calculateSum(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			if(i%3==0 || i%5==0) {
				sum=sum+i;          //Adding sum divisible by 3 or 5
			}
		}
		return sum;
	}

}
