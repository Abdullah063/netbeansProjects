/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eklemeIslemleri;

/**
 *
 * @author ABDULLAH
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LİsteYapisi lİsteYapisi =new LİsteYapisi();
        lİsteYapisi.firstAdd(10);
        lİsteYapisi.firstAdd(50);
        lİsteYapisi.firstAdd(52);
        lİsteYapisi.firstAdd(855);
        lİsteYapisi.lastAdd(1000);
        
        System.out.println("-----------");
        lİsteYapisi.write();
    }
    
}
