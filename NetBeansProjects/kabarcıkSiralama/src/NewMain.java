/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ABDULLAH
 */
public class NewMain {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
               int arr[]={1,7,9,5,6,3,8};
                kabarcık(arr);
               
                for (int i : arr) {
                        System.out.println(i);
                }
               
        }
        static int[] kabarcık(int dizi[])   
        {
                for (int i = dizi.length-1; i >0; i--)
                {
                        for (int j = 0; j < i; j++)
                        {
                                
                                //swap işlemi 
                                if (dizi[j]>dizi[j+1]) {
                                     int temp = dizi[j];
                                     dizi[j]=dizi[j+1];
                                     dizi[j+1]=temp;
                                }
 
                        }
                }
                return dizi;
        }
        static int[]  quikSort(int arr[] , int low , int high)
        {
                if (low-high<=1) {
                        
                }
                return arr;
                
                int pivat=arr[high-1];
                
                int s = low ;
                for (int i = 0; i < high-1; i++) {
                        if (arr[i]<pivat) {
                                
                        }
                }
                
                
                
        }
        
        
        
        
        
        
        
        
        int partition(int arr[], int low, int high)
        {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;
 
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    }
 
 
    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    void sort(int arr[], int low, int high)
    {
            
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);
 
            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
        
}
