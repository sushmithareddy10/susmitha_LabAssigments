/**
 * Author: Susmitha
 * Date: 22/10/2020
 * Desc: Traffic Lights with message
 **/
import java.util.*;
public class TrafficLigth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		//Menu of Lights
		System.out.println("1.Red\n2.Yellow\n3.Green");
		
		int number=sc.nextInt();
		String message= findMessage(number);
		System.out.println("The Message is: "+message);
		
	}

	private static String findMessage(int n) {
		// TODO Auto-generated method stub
		if(n==1) {
			return "Stop";
		}
		else if(n==2) {
			return "Ready";
		}
		else if(n==3) {
			return "Green";
		}
		return null;
	}

}
