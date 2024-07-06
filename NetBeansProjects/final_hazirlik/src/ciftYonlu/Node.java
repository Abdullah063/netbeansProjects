/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciftYonlu;

/**
 *
 * @author ABDULLAH
 */
public class Node {
        Node next ;
        Node prev;
        int data;

        public Node(int data) {
                this.data=data;
                this.next=null;
                this.prev=null;
        }

        public Node(Node next, Node prev, int data) {
                this.next = next;
                this.prev = prev;
                this.data = data;
        }
        
        
        
}
