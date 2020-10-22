/**
 * Author: Susmitha
 * Date: 22/10/2020
 * Desc: Displaying Prime Numbers upto n
 **/
import java.util.*;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		for(int i=1;i<=number;i++)
		{
			int count=0;
			for(int j=1;j<=number;j++) 
			{
				if(i%j==0) 
				{
					count++;
				}
			}
			if(count==2) 
			{
				System.out.println(i);
			}
		}
		

	}

}