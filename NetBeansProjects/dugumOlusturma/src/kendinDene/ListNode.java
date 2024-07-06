/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendinDene;

/**
 *
 * @author ABDULLAH
 */
public class ListNode {
        Node head = null;
        Node tail = null;
        
        void add(int x)
        {
                Node value = new Node();
                value.data=x;
                value.next=null;
                
                if (head==null)
                {
                        head=value;
                        tail=value;
                        tail.next=null;
                        System.out.print("liste oluşturuldu...");
                }
                else
                {
                       tail.next=value;
                       tail=value;
                        System.out.println("listeye eklendi...");
                }
        }
        void print()
        {
                if (head==null) 
                {
                        System.out.print("liste boş...");
                }
                else
                {
                        Node temp = head;
                        while (temp!=null)
                        {                                       
                                System.out.print(temp.data+"->");
                                temp=temp.next;
                        }
                }
        }
}
