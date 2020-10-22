/**
 * Author: Susmitha
 * Date: 22/10/2020
 * Desc: Checks if the entered number is a power of two or not 
 **/

import java.util.*;
public class PoweOfTwo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();             //User Input
		boolean result=checkNumber(number);
		System.out.println(result);          //Displaying Output

	}
    
//	Checks if the entered number is a power of two or not 
	private static boolean checkNumber(int number) {
		int mul=1;
		for(int i=0;i<number;i++) {
			mul=mul*2;
			if(mul==number) {
				return true;
			}
			
		}
		return false;
	}

}
