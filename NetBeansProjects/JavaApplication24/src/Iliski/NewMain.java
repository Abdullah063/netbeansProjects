/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iliski;

/**
 *
 * @author ABDULLAH
 */
public class NewMain {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
                
                Ogrenci ogr = new Ogrenci();
                ogr.isim = "Abdullah";
                ogr.ogrenciNo=542;
                
                Ders ders  = new Ders();
                ders.dersAdi = "Matematik";
                ders.dersId = 1001;
                
                Bolum yazilim = new Bolum();
                yazilim.bolumAdi = "yazılım muhendisligi";
                
                ders.dBolum = yazilim;
                
                
                Masa masa = new Masa();
                System.out.println(Masa.getyaz());
        }
        
}
