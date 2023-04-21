package org.example;

public class Produs {

    private String numeProdus;
    private double pret;
    private int cantitate;
    private double discount;

    public Produs(String numeProdus, double pret, int cantitate, double discount) {
        this.numeProdus = numeProdus;
        this.pret = pret;
        this.cantitate = cantitate;
        this.discount = discount;
    }

    public String getNumeProdus() {
        return numeProdus;
    }

    public void setNumeProdus(String numeProdus) {
        this.numeProdus = numeProdus;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "MagazinOnline{" +
                "numeProdus='" + numeProdus + '\'' +
                ", pret=" + pret +
                ", cantitate=" + cantitate +
                ", discount=" + discount +
                '}';
    }
}