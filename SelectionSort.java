class SelectionSort{
    
    void Selection(int arr[]){

        int temp = 0,min = 0;

        for (int i = 0; i < arr.length-1; i++) {
            min = i;
            for (int j = i+1; j < arr.length; j++) {
                    if(arr[j] < arr[min]){
                        min = j;
                    }
                
                }

                        temp = arr[min];
                        arr[min] = arr[i];
                        arr[i] = temp;
                            
        }

    }

        

        public static void main(String[] args) {
            int arr[] = {5,2,6,8,9,10,1};

            SelectionSort s = new SelectionSort();
            s.Selection(arr);

            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
                
            }
        }
}