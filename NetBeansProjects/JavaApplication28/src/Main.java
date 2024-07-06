class Calisan {
    private String ad;
    private int yas;

    public Calisan(String ad, int yas) {
        this.ad = ad;
        this.yas = yas;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public void calis() {
        System.out.println("Çalışan çalışıyor...");
    }
}
class Yonetici extends Calisan{
    private String departman;
    public Yonetici(String ad, int yas,String departman) {
        super(ad, yas);
        this.departman = departman;
    }
    public String getDepartman()
    {
    return departman;
    }
    public void setDEpartman(String departman){
    this.departman=departman;

    }
    public void yonet(){
        System.out.println("yönetici yönetiyor");
    }


}
public class Main{
    public static void main(String[] args) {
        Calisan calisan = new Yonetici("Ahmet",35,"insan kaynakları");
        calisan.setAd("mehmet");
        calisan.setYas(40);
        System.out.println(calisan.getAd());
        System.out.println(calisan.getYas());
        calisan.calis();
        calisan.yonet();

    }
}