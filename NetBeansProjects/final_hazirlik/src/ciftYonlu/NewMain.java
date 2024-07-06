/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciftYonlu;

import java.util.Scanner;

/**
 *
 * @author ABDULLAH
 */
public class NewMain {

        
        public static void main(String[] args) {
                Node a = new Node(23);
                Node b = new Node(24);
                Node c = new Node(26);
                Node d = new Node(27);
                
                
                a.next=b;
                b.prev=a;
                b.next=c;
                c.prev=b;
                c.next=d;
                d.prev=c;
                
                System.out.println(c.prev.prev.data);
                
                print(a);
        }
        
        static  Node print(Node node)
        {
                Scanner scan = new Scanner(System.in);
                int a = 0;
                while (a!=-1)
                {
                        
                        System.out.println("işlem giriniz :");
                        a = scan.nextInt();
                        if (a==1) {
                                node=node.next;
                                
                                System.out.println("seçili :"+node.data);
                        }
                        else if (a==2) {
                                node=node.prev;
                                System.out.println("seçili :"+node.data);
                        }
                        
                }
                return node;
        }
        
        
}
