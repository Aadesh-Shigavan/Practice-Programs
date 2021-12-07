import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);

		//int count = 0;									// count ghetla missingno sati
		int N =  sc.nextInt();

        int arr[] = new int[N];							// N cha array create kela
		for(int i = 0; i< arr.length-1; i++){
			arr[i] = sc.nextInt();

		}


		Arrays.sort(arr);								// Array sort kela

		/*for (int i = 0; i<arr.length ;i++ ) {
			System.out.println(arr[i]);
		} */

		int count = arr[0];
		System.out.println(count);
		for(int i = arr[0]; i < arr.length-1; i++){			//count and arr[] la compare kela missing element find karnya sati
			if(arr[count] == i)
				count++;
       		else
				System.out.println(count);

		}



	}
}