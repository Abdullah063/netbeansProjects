/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iliski;


public class Masa {
        
        
        int genislik;
        int yukseklik;
        int uzunluk;
        String renk;

        private  static int sayac =0;
        public Masa() {
                sayac++;
        }
        public static int getyaz()
        {
                return sayac;
        }

        
        public Masa(int uzunluk , String renk) {
                this.genislik = 0;
                this.yukseklik = 0;
                this.uzunluk = uzunluk;
                this.renk = renk;
        }

        public Masa(int genislik, int yukseklik, int uzunluk, String renk) {
                this.genislik = genislik;
                this.yukseklik = yukseklik;
                this.uzunluk = uzunluk;
                this.renk = renk;
        }
       
}
