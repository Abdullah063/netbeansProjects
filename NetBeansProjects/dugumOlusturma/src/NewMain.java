
/**
 *
 * @author ABDULLAH
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListNode a = new ListNode();
        ListNode b = new ListNode();
        ListNode c = new ListNode();
        ListNode d = new ListNode();
        
        a.data = 10;
        b.data = 20;
        c.data = 30;
        d.data = 40;
        
        a.next = b ;
        b.next = c;
        c.next = d;
        d.next = null;
        
        ListNode head = a;
        
        //düğümler üzerinde dölaşmayı sağladım
        while (head!=null) {            
            System.out.println(head.data);
            head = head.next;
        }
       
    }
    
}