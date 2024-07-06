/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeleriBaglama;

/**
 *
 * @author ABDULLAH
 */
public class listYapisi {
    node head ;
    node tail;
    
    void add(int x ){
        node eleman = new  node();// eklenecek olan düğüm 
        eleman.data=x;
        eleman.next=null;
        
        if (head==null) {
            head= eleman;
            tail = eleman;
            eleman.next= null;
            System.out.print("liste oluşturuldu-----");
        }
        else{
            tail.next=eleman;
            tail=eleman;
            System.out.println("listeye eklendi -");
        }
    }
    void write(){
        
        if (head==null)
        {
            System.out.println("lisite boş");
        }
        else
        {
            node temp = head;
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
