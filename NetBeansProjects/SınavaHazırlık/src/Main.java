
public class Main {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
               ListNode obj= new  ListNode();
               ListNode obj1= new  ListNode();
               ListNode obj2= new  ListNode();
               ListNode obj3= new  ListNode();
               
               obj.data=23;
               obj1.data=10;
               obj2.data=30;
               obj3.data=40;
               
               obj.next=obj1;
               obj1.next=obj2;
               obj2.next=obj3;
               obj3.next=null;
               
               System.out.println("----------------------------");
               arayaEkle(obj, 2,96);
               arayaEkle(obj, 2,6);
               print(obj);
        }
        static ListNode lastAdd(ListNode head ,int data)
        {
                return head;
        }
        
        static void print(ListNode head)
        {
                if (head==null)
                {
            
                }
                else
                {
                        ListNode temp = head;
                        System.out.print("\nlistenin başı -->");
                        while (temp!=null)
                        {                
                                System.out.print(temp.data+"->");
                                temp= temp.next;
                        }
                        System.out.print("listenin sonu -->");
                }
        }
        static ListNode arayaEkle(ListNode head , int index ,int data)
        {
                ListNode temp = head;
                
                for (int i = 0; i < index; i++) 
                {
                         temp=temp.next;
                }
                ListNode newNode = new ListNode(data,temp.next);
                temp.next=newNode;
                return head;
        }
      
}
