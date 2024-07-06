class Cevap {
    private String icerik;

    public Cevap(String icerik) {
        this.icerik = icerik;
    }

    public String getIcerik() {
        return icerik;
    }

    public void setIcerik(String icerik) {
        this.icerik = icerik;
    }
}

class Soru {
    private String icerik;
    private Cevap cevap;

    public Soru(String icerik) {
        this.icerik = icerik;
    }

    public String getIcerik() {
        return icerik;
    }

    public void setIcerik(String icerik) {
        this.icerik = icerik;
    }

    public Cevap getCevap() {
        return cevap;
    }

    public void setCevap(Cevap cevap) {
        this.cevap = cevap;
    }
}

public class Test {
    public static void main(String[] args) {
        Soru soru = new Soru("Yaratıcısı kimdir?");
        Cevap cevap = new Cevap("Gosling");
        soru.setCevap(cevap);
        System.out.println(soru.getIcerik());
        System.out.println(soru.getCevap().getIcerik());
    }
}
