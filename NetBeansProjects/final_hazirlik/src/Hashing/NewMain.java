package Hashing;

import java.util.Hashtable;


public class NewMain {

      
        public static void main(String[] args) {
                
               Hashtable<Integer, String> ht1 = new Hashtable<Integer, String>();
	       Hashtable<Integer, String> ht2= new Hashtable<Integer, String>();
               
               ht1.put(1, "bir");
               ht1.put(2, "iki");
               
               ht2.put(3, "uc");
               ht2.put(4, "dort");
               ht2.put(4, "dort");
               
               System.out.println("Mappings of ht1 : " + ht1);
               System.out.println("Mappings of ht1 : " + ht2);
        }
        
}
