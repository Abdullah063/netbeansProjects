/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.Scanner;

/**
 *
 * @author ABDULLAH
 */
public class NewMain {

        public static void crateArray(int lenght)
        {
                Scanner input = new Scanner(System.in);
                int A[]= new int[lenght];
                for (int i = 0; i < lenght; i++)
                {
                        System.out.println("Lütfen "+i+". elemanını giriniz");
                        A[i] = input.nextInt();
                }
        }
        public static void main(String[] args) {
                
        }
        
        
}
