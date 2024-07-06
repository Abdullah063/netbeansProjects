package sıralamaAlgoritmalri;




public class Main {

        
        public static void main(String[] args)
        {
                int dizi[]={3,9,8,15,24,1};
                int a[]= {3,6,9,32,1,45,96,12};
               
                int b []={2,5,6,1,0};
                
                insertionSort(b, b.length);
                for (int i = 0; i < b.length; i++) {
                        System.out.print("-->"+b[i]);
                }
                
             
               
        }
        static int [] selectionSort(int a[],int n)
        {
                for (int i = 0; i < n-1; i++) {
                        
                        int min = a[i];
                        int index=i;
                        for (int j = i+1; j < n; j++) 
                        {
                                if(min>a[j])
                                {
                                        min=a[j];
                                        index =j;
                                }
                        }
                        int temp = a[i];
                        a[i]=min;
                        a[index]=temp;
                        
                }
                
                return a;
        }
        static int [] insertionSort(int a [], int n)
        {
                for (int i = 1; i < n; i++) 
                {
                        int insert = a[i];
                        for (int j = i-1; j >=0; j--)
                        {
                                System.out.println("a[] : "+a[j]);
                                if (insert<a[j]) {
                                        a[j+1]=a[j];
                                        a[j]=insert;
                                }
                        }
                }
                return a;
        }
      
        static int[] Quicksort(int a[],int low,int high)
        {
                if(high-low<=1)
                {
                        return a;
                }
                int pivot=a[high-1];
                int split=low;
                for (int i=low;i<high-1;i++)
                {
                        if(a[i]<pivot)
                        {
                                int temp=a[i];
                                a[i]=a[split];
                                a[split]=temp;
                                split++;
                        }
                }
                int temp2=a[high-1];
                a[high-1]=a[split];
                a[split]=temp2;

                Quicksort(a,low,split);
                Quicksort(a,split+1,high);
                return a;
        }

        static int [] bubbleSort(int arr[])
        {
                for (int i =arr.length-1; i>0; i--)
                {
                        for (int j = 0; j < i; j++)
                        {
                                if (arr[j]>arr[j+1])
                                {
                                        int temp = arr[j];
                                        arr[j]=arr[j+1];
                                        arr[j+1]=temp;
                                }
                           
                        }
                }      
                return arr;
        }
        
}
