import java.io.*;
import java.util.*;


class Factorial{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int fact = 1;

		for (int i = 1; i <= num ; i++ ) {
			
			fact *= i;								//eg. 1*1, 1*2, 2*3 ..so on

		}

		System.out.println(fact);
	}
}