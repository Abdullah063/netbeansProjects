/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hashing;

import java.util.Hashtable;

/**
 *
 * @author ABDULLAH
 */
public class Main {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
                Hashtable<String, Integer> ht = new Hashtable<>();

		ht.put("mehmet", 10);
		ht.put("hasan", 30);
		ht.put("ahmet", 20);

		System.out.println("Size of map is: " + ht.size());
		System.out.println(ht);

		if (ht.containsKey("hasan")) {
                        int a = ht.get("hasan");
                        System.out.println("hasan index :"+a);
                }
        }
        
}
