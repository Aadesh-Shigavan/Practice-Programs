// HarshadNo : the no is divisible by sum of its digits eg. 18 = 1+8 = 9 and 18/9 == 0

import java.io.*;
import java.util.*;

class HarshadNo{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int sum = 0,temp = 0,num1 = 0;

		num1 = num;							//original number store karaila 

		while(num != 0){					// jo parynat num 0 hot nhi

			temp = num % 10;				// number cha last digit sati eg. 378--> 8

			sum += temp;

			num = num / 10;					// num cha last digit sodun number anaila eg. 378 --> 37
		}

		if(num1 % sum == 0)
			System.out.println(num1 + " is a Harshad Number");
		else
			System.out.println(num1 + " is not a Harshad Number");

	}
}