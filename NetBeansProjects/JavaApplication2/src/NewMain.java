

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ABDULLAH
 */
public class NewMain {

    
    public static void main(String[] args) 
    {
//       ListNode a = new ListNode(10);
//       a.next = new ListNode(20);
//       a.next.next= new ListNode(30);
       
            
//       ListNode a = new ListNode(10);
//       ListNode b = new ListNode(20);
//       ListNode c = new ListNode(30);
//       ListNode d = new ListNode(40);
//
//       a.next=c;
//       c.next=b;
//       b.next=d;
//       ListNode head=a;
//        while (head!=null) {            
//            System.out.println(head.data);
//            head=head.next;
//        }
        ListNode a = new ListNode(5);
        ListNode b = new ListNode(6);
        ListNode c = new ListNode(-7);
        ListNode d = new ListNode(8);
        
        
        a.next=b;
        b.next=c;
        c.next=d;
          firstelemants(a);
            System.out.println("----------------------");
//            remove(a, 2);
//        addMiddle(a, 2, 63);
//        lastAdd(a, 42);  
//        remove(a, 2);
        ListNode head=a;
        
//            System.out.println(get(a, 3).data) ;
        while (head!=null) {            
            System.out.println(head.data);
            head=head.next;
        }    
            
    }
    static ListNode addFirst(ListNode head ,int value)
    {
        ListNode c = new ListNode(value,head);
        return c;
    }
    static ListNode addMiddle(ListNode head ,int index , int value)
    {
        ListNode temp=head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        ListNode add = new ListNode(value ,temp.next);
        temp.next=add;
        return head;
    }
    static ListNode get(ListNode head, int index)
    {
        ListNode temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
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
    static ListNode lastAdd(ListNode head ,int data)
    {
            if (head!=null) {
                ListNode temp = head;
                while (temp.next!=null) 
                {  
                      temp=temp.next;
                }
             
                      ListNode last = new ListNode(data,temp.next);
                      temp.next=last;
               
               }
               else
               {
                       System.out.println("düğüm yok");
               }
               return head;
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
    static ListNode trans(ListNode head,int index ,String diraction)
    {
            
            return head;
    }
   
       
}

    

