/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28;


 class NewMain {

        static {
                System.out.println("merhaba");
        }
        {
                System.out.println("dünya ");
        }
        public String deger;
        public String cevir()
        {
                this.deger="siyah";
                deger = "beyaz";
                return deger;
        }
        public static void main(String[] args) {
               NewMain yeni = new NewMain();
                System.out.println(yeni);
                System.out.println(yeni.deger);
        }
        
}
