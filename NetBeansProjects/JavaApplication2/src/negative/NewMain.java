/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negative;

/**
 *
 * @author ABDULLAH
 */
public class NewMain {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
        ListNode a = new ListNode(5);
        ListNode b = new ListNode(6);
        ListNode c = new ListNode(-7);
        ListNode d = new ListNode(8);
        ListNode e = new ListNode(9);
                
        
                remove(a, 1);
        }
         static ListNode firstelemants(ListNode head )
    {
            int index=0;
            ListNode temp = head;
            while (temp.next!=null) 
            {
                      temp=temp.next;
                    
                    if (temp.data<0) {
                            remove(head, index);
                            head=addFirst(head, temp.data);
                          
                    }
                  
                    index++;
                      System.out.println(index);
            }
            
            
            return head;
     
          
    }
          static ListNode remove(ListNode head , int index)
    {
        ListNode c = head ;
        for (int i = 1; i < index; i++) {
            c=c.next;
        }
        c.next=c.next.next;
        return head;
    }
          static ListNode addFirst(ListNode head ,int value)
    {
        ListNode c = new ListNode(value,head);
        return c;
    }
}
