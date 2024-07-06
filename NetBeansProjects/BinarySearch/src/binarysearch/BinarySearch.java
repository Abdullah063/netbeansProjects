/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

/**
 *
 * @author ABDULLAH
 */
public class BinarySearch {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
                // TODO code application logic here
                int A[]= {1,5,6,8,9,12,23,25};
                
                System.err.println();
        }
        public int binarySearch(int a[] , int n ,int aranan)
        {
                int left = 0;
                int right=n-1;
              
                while (left<=right)
                {                        
                        int ort = (right+left)/2;
                        if (a[ort]==aranan)
                        {
                                return ort;
                        }
                        else if (aranan<a[ort])
                        {
                                ort=left-1;
                        }else
                        {
                                ort=(right+ort)/2;
                        }
                }       
                return -1;
            
                
        }
        
}
