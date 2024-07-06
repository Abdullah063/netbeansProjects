/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eklemeIslemleri;

import listeleriBaglama.node;

/**
 *
 * @author ABDULLAH
 */
public class LİsteYapisi {
    Node head =null;
    Node tail = null;
    
    void firstAdd(int x){
        Node eleman = new Node();
        eleman.data=x;
        if (head==null) {
            eleman.next=null;
            head=eleman;
            tail=eleman;
        }
        else
        {
            eleman.next= head;
            head=eleman;
        }
    }
    void lastAdd(int x){
        Node eleman = new Node();
        eleman.data=x;
        if (head==null) {
            eleman.next=null;
            head=eleman;
            tail=eleman;
        }
        else
        {
           eleman.next= null;
           tail.next = eleman;
           tail = eleman;
        }
    }
    void write(){
        
        if (head==null) {
            
        }
        else
        {
            Node temp = head;
            System.out.print("\nlistenin başı -->");
            while (temp!=null)
            {                
                System.out.print(temp.data+"->");
                temp= temp.next;
            }
            System.out.print("listenin sonu -->");
        }
    }
}
