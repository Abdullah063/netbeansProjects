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
public class MaasHesaplayici {
    private double sabit;

    public MaasHesaplayici(double sabit) {
        this.sabit = sabit;
    }

    public class MaasHesaplayici {
    private double sabit;

    public MaasHesaplayici(double sabit) {
        this.sabit = sabit;
    }

    public double maasiHesapla(double maas) {
        double yeniMaas = maas + sabit + (sabit * 0.30);
        return yeniMaas;
    }

    public double sabitiDegistir(double yeniSabit) {
        this.sabit = yeniSabit;
    }
}
}
