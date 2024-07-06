/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package denemeyunus;

/**
 *
 * @author ABDULLAH
 */
public class ListNode {
        List head;
        List tail;

        void add(int x) {
                List value = new List();
                
                value.data=x;
                value.next=null;
                
                if (head==null) 
                {
                        head=value;
                        tail=value;
                        tail.next=null;
                        System.out.println("liste oluştu ve eleman eklendi");
                
                }
                else
                {
                        tail.next=value;
                        tail=value;
                        System.out.println("eleman eklendi ");
                }
                
                
        }
        void print()
        {
                List temp;
                temp=head;
                while (temp!=null)
                {                        
                        System.out.println(temp.data);
                        temp=temp.next;
                }
        }
        
        
        
}
