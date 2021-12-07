class AmstrongNo{

	public static void main(String[] args) {
		
		int num = 153,cube = 0;

		int remainder = 0,temp = 0;

		while(num > 0){

			temp = num % 10;		// last digit kadnya sati eg. 153 -> 3

			remainder = 0 + temp;	// 0 = 0 + 3 ---> 3

			cube += remainder * remainder * remainder;	//cube madhe add hot rahanr eg. 27 = 3 * 3 * 3

			num = num / 10;			// last digit eliminate karnya sati eg. 15
		}

		num = cube;

		if(num == cube)
			System.out.println("Number is a Armstrong Number : " +num);
		else
			System.out.println("Number is not a Armstrong Number : " +num);
	}
}