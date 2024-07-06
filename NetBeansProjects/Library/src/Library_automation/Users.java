
package Library_automation;


public class Users {
        private int id_bilgi;
        private String Ad_Soyad;
        private String Email;
        private String Kulanici_Adi;
        private String Sifre;

        public Users() {
        }

        public Users(int id_bilgi, String Ad_Soyad, String Email, String Kulanici_Adi, String Sifre) {
                this.id_bilgi = id_bilgi;
                this.Ad_Soyad = Ad_Soyad;
                this.Email = Email;
                this.Kulanici_Adi = Kulanici_Adi;
                this.Sifre = Sifre;
        }

        public int getId_bilgi() {
                return id_bilgi;
        }

        public void setId_bilgi(int id_bilgi) {
                this.id_bilgi = id_bilgi;
        }

        public String getAd_Soyad() {
                return Ad_Soyad;
        }

        public void setAd_Soyad(String Ad_Soyad) {
                this.Ad_Soyad = Ad_Soyad;
        }

        public String getEmail() {
                return Email;
        }

        public void setEmail(String Email) {
                this.Email = Email;
        }

        public String getKulanici_Adi() {
                return Kulanici_Adi;
        }

        public void setKulanici_Adi(String Kulanici_Adi) {
                this.Kulanici_Adi = Kulanici_Adi;
        }

        public String getSifre() {
                return Sifre;
        }

        public void setSifre(String Sifre) {
                this.Sifre = Sifre;
        }
        
        
}
