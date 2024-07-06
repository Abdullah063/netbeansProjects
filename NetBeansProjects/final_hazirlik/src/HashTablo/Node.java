
package HashTablo;


public class Node {
        
        Node next;
        int data;
        
        public Node() {
                this.data= -1;
                this.next=null;
        }

        
        public Node(int data) {
                this.data= data;
                this.next=null;
        }
        

        public Node(Node next, int data) 
        {
                this.next = next;
                this.data = data;
        }

      

       
        
        
}
