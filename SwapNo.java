class SwapNoWithout{

	public static void main(String[] args) {

		int a = 10,b = 20;
		System.out.println("before swaping :  " + a + " " + b);


			a = a + b;	// 30 = 10 + 20

		    b = a - b;	// 10 = 30 - 20

		    a = a - b; // 20 = 30 - 10

			System.out.println("after swaping :  " + a + " " + b);
		
	}


}