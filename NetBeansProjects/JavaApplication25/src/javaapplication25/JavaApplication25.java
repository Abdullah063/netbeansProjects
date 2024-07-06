/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

/**
 *
 * @author ABDULLAH
 */
public class JavaApplication25 {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
                int a[]={0,7,7,16,16,16,16,16,26,26,26,26,32,32,32,32,32,47,47,47,47,47,47,62,62,62,62,62,74,74,74,88,88,100};
                
                double temp = 0;
                double ortalam,sapma;
                for (int i = 0; i < a.length; i++) {
                       temp +=(a[i]-47);
                }
                System.out.println(" standart ortalama :"+temp);
                
        }
        
}
