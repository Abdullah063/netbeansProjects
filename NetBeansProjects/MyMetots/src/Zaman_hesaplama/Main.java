package Zaman_hesaplama;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {

        
        public static void main(String[] args) {
                Date date = new Date();
                System.out.println("Zamana : "+date);
                DateFormat f = new SimpleDateFormat("dd MM yyyy HH:mm");
                DateFormat yeni = new SimpleDateFormat("dd-MM-yyyy HH:mm");
                System.out.println("Saaat : "+yeni.format(date));
                System.out.println(" çıkış :"+f.format(date));
                System.out.println(" Giriş : 14 2 2023 12:00" );
                
                Date tarih = null;
                try {
                        tarih = f.parse("14 2 2023 12:00");
                } catch (ParseException ex) {
                       
                }
                long tarih_farki = date.getTime()-tarih.getTime();
                long dk_farki = tarih_farki/(60000);
                
                System.out.println("millisaniye fatkı : "+tarih_farki );
                System.out.println("Dk farkı :"+dk_farki);
                
                
        }
        
}
