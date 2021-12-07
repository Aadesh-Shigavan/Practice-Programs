import java.io.*;
import java.util.*;

class AbundantNo{

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		int num = sc.nextInt();

		int sum = 0;

		for(int i = 1; i < num; i++){				//ha loop num-1 parynt firvaicha

			if(num % i == 0){									//ithe num la pratek (1 pasun remainder 0 yetoy ka bhghaicha)
				sum += i;
				System.out.println(sum);
			}
		}



		if(sum > num)													//jar sum hi num peksha greater asel tar tho abundant no ahe
			System.out.println(num + " is a Abundant Number");
		else
			System.out.println(num + " is not a Abundant Number");

	}
}