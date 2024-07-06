
package HashTablo;

import com.sun.swing.internal.plaf.metal.resources.metal;


public class Tablo {
        Node array[];
        int size;

        public Tablo(int size) {
                this.size = size;
                this.array= new Node[size];
                for (int i = 0; i < size; i++) {
                        array[i] = new Node();
                }
        }
        int crateIndex(int key)
        {
                return key%this.size;
        }
        void add(int data )
        {
                int key = crateIndex(data);
                Node temp = array[key];               
                while (temp.next!=null) 
                {                        
                        temp=temp.next;
                        ;
                }
                temp.next=new Node(data);
                
                System.out.println(key+" id li bağılı listesine "+temp.next.data+" eklendi");
                
        }
        void print()
        {
                
                for (int i = 0; i <this.size ; i++)
                {
                        Node head =this.array[i];
                        System.out.print(i+". indise bağlı liste : ");
                        while (head!=null)
                        {                                
                                System.out.print(head.data+" --> ");
                                head=head.next;
                        }
                        System.out.println(" null ");
                }
        }
        
        
}
