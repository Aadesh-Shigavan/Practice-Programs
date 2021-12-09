// Insertion sort in Java

import java.util.Arrays;

class InsertionSort {

  void insertionSort(int array[]) {
    int size = array.length;

    for (int step = 1; step < size; step++) {               //step= 1 thevla karan eg.[4,2] 2nd element manje key thevlaila
      int key = array[step];                                //key element la step chi value deli
      int j = step - 1;                                     // karan eg.[4,2,5,7] 1st ele pahije compare sati

      // Compare key with each element on the left of it until an element smaller than
      // it is found.
      // For descending order, change key<array[j] to key>array[j].
      while (j >= 0 && key < array[j]) {                    
        array[j + 1] = array[j];                            //eg.[4,3,5,2] jar 1st value greater asel tar 3 cha jagi 4 thevla
        --j;                                                // while loop end karnya sati
      }

      // Place key at after the element just smaller than it.
      array[j + 1] = key;                                   // eg.[3,4,5,2] key chi value 1st ele madhe takli
        }
  }

  // Driver code
  public static void main(String args[]) {
    int[] data = { 9, 5, 1, 4, 3 };
    InsertionSort is = new InsertionSort();
    is.insertionSort(data);
    //System.out.println("Sorted Array in Ascending Order: ");
    //System.out.println(Arrays.toString(data));
    for (int i = 0; i < data.length; i++) {
        System.out.println(data[i]);
    }
  }
}