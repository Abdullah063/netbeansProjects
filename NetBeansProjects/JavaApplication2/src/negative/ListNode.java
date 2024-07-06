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
public class ListNode {
    int data;
    ListNode next;

    public ListNode() {
        this.data=-1;
        this.next=null;
    }

    public  ListNode(int data )
    {
        this.data=data;
        this.next=null;
    }
    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }

}
