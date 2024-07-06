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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        listYapisi listNode = new listYapisi();
        listNode.add(52);
        listNode.add(875);
        listNode.add(82);
        listNode.add(5);
        listNode.add(81);
        System.out.println("");
        listNode.write();
    }
    
}
