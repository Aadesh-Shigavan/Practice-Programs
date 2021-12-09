class MergeSort{

    void mergeSort(int arr[],int left ,int right){

        if(left < right){                           

            int middle = (left + right)/2;              //array cha middle ele find karnya sati

            mergeSort(arr, left, middle);               //left - midddle   []
            mergeSort(arr, middle + 1, right);             //middle + 1 - right []

            merge(arr, left,middle, right);                 //merge karaicha
        }

    }

    void merge(int arr[], int l , int m, int r ){

        int n1 = m - l + 1;                         //n1 1st sub-arry kute parynt karnya chi value store karaila
        int n2 = r - m;                             // 2nd sub-array chi value store karaila

        int L[] = new int[n1];                      // new arr L[]
        int R[] = new int[n2];                      //new arr R[]

        for (int i = 0; i < L.length; i++) {
            L[i] = arr[l + i];                      // original array mdhun 1st half ele L[] mdhe store karaila
        }

        for (int i = 0; i < R.length; i++) {
            R[i] = arr[m + 1 +  i];                 // original array mdhun 2nd half ele R[] mdhe store karaila
        }

        int i,j,k;                                     // counter track thevlaila      
        i = 0;                                         //1st sub-array cha
        j = 0;                                         // 2nd sub-array cha
        k = l;                                         // original array  cha

        while(i < n1 && j < n2){                        //jo parynt 2 ni  array mdhe ele ahet
        if(L[i] <= R[j]){                               //jar 1st arr ele <= 2nd arr ele asel tar
            arr[k] = L[i];                              // original arr mdhe store kr
            i++;                                        // counter vadala karan 1st ele small hota ata nxt ele 
            k++;                                        // ani original arr counter pn karan ele bhetla
        }
        else{
            arr[k] = R[j];
            j++;
            k++;
        }
    }
            //jevha 1st kiva 2nd sub-array mdhe ele sampltil thev rahila array mdhe ahet tasa original mdhe takaila
        while(i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }

        while(j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }

     
    }





static void printArr(int arr[]){
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
}

public static void main(String[] args) {
    
    int arr[] = {3,6,1,10,2,5};

    MergeSort m = new MergeSort();
    m.mergeSort(arr, 0,arr.length -1);              // ithe array,(0 - manje starting ele)(array.length -1 manje last ele) pass kela function la
    printArr(arr);
}
}