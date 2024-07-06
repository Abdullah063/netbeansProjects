/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dersOrnek;

/**
 *
 * @author ABDULLAH
 */
public class NewMain {

     
        public static Node sonuc;
        public static  int sayı = 0;
        public static void main(String[] args) {
                // TODO code application logic here
        }
        
        public static int inorder(Node kok)
        {
                inorder(kok.left);
                System.out.println(kok.value);
                inorder(kok.right);
                
                
           return 0;
        }
        public  static Node insert(Node node ,int value)
        {
                return  node;
        }
        
}
