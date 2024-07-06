
package bagliListe;


public class NewMain {

        public static void main(String[] args) {
               Node a = new Node(3);
               Node b = new Node(5);
               Node c = new Node(7);
               Node d = new Node(9);
               Node e = new Node(11);
               Node f = new Node(30);
               
               a.next=b;
               b.next=c;
               c.next=d;
               d.next=e;
               e.next=f;
               
                print(a);
                
                addMiddle(a, 99, 3);
                addMiddle(a, 99, 1);
                print(a);
                while (a!=null) {                        
                        System.out.print(a.data+"--> ");
                        a=a.next;
                }
                
              
        }
        //düğümün ilk elamanına ekleme
        static Node addFirst( Node head,int data)
        {
                Node newHead = new Node(data,head);
                return newHead;
        }
        //düğümün son elemanına ekleme
        static Node addLast(Node head,int data)
        {
                Node temp = head;
                Node tail = new Node(data);
                
                while (head.next!=null) {                        
                        head=head.next;
                }
                head.next=tail;
                
                return temp;
        }
        //düğümün arasına ekleme
        static Node addMiddle(Node head,int data,int index)
        {
                Node temp = head; 
                int sayac = 0;
                while (head!=null) 
                {
                        sayac++;
                        if (sayac==index) {
                                Node add = new Node(data, head.next.next); 
                                head.next = add; 
                        }
                        head= head.next;
                                
                }
          
                return head; 
        }
        public static void print(Node head)
        {
                while (head!=null) {  
                        System.out.print(head.data+"-->");
                        head=head.next;
                }
                System.out.println("null");
        }
        
        
}
