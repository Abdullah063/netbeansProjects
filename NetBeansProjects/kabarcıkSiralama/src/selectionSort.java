/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ABDULLAH
 */
public class selectionSort {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
                int arr[]={32,63,235,34,85,12};
                
                for (int i : arr) {
                        System.out.print(i+",");
                }
               selectSort(arr);
               for (int i : arr) {
                        System.out.print(i+",");
                }
        }
        static int [] selectSort(int arr[])
        {
                int index ,min;
                for (int i = 0; i < arr.length; i++) {
                        min=arr[i];
                        index=i;
                        for (int j = i+1; j < arr.length; j++) {
                                if (min>arr[j]) {
                                        min=arr[j];
                                        index=j;
                                }
                        }
                        arr[index]=arr[i];
                        arr[i]=min;
                }
                return arr;
        }
        
        static int [] insertionSort(int a[],int n)
        {
              
                for (int i = 1; i < n; i++) {
                        
                        if (a[i]>a[i-1])
                        {
                                int index=i-1;
                                int temp=a[i];
                                
                                for (int j = i; (j < 0)&(a[i-1])>temp; j--) {
                                      a[j]=a[j-1];
                                      index=j-1;
                                }
                                a[index]=temp;
                        }
                        
                        
                }
                
                return a;
        }
        
        static int [] mergeSort(int a[],int low , int high)
        {
                
                if (high-low>0) {
                        
                }
         
                int split = (high+low)/2;
                
                mergeSort(a,low,split);
                mergeSort(a,split,high);
                
                
                 return a;
        }
        
}
