/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagliListe;

/**
 *
 * @author ABDULLAH
 */
public class Node {
        
        int data;
        Node next;

        public Node()
        {
                this.data=-1;
                this.next=null;
        }

        
        public Node(int data) 
        {
                this.data=data;
                this.next=null;
        }

        public Node(int data, Node next) {
                this.data = data;
                this.next = next;
        }
        
        
        
}
