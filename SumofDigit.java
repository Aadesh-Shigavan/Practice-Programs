class SumofDigits{

	public static void main(String[] args) {
		
		int num = 152,temp = 0,remainder = 0;

		while(num > 0){

			temp = num % 10;

			remainder = remainder + temp;

			num = num / 10;
		}

		System.out.println("Sum Of Digits : " +remainder);
	}
}