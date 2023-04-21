package org.example;


public class HranaCopii extends Produs{
    private boolean bio;
    private String tipHrana;

    public HranaCopii(String numeProdus, double pret, int cantitate, double discount, boolean bio, String tipHrana) {
        super(numeProdus, pret, cantitate, discount);
        this.bio = bio;
        this.tipHrana = tipHrana;
    }

    public boolean getBio() {
        return bio;
    }

    public void setBio(boolean bio) {
        this.bio = bio;
    }

    public String getTipHrana() {
        return tipHrana;
    }

    public void setTipHrana(String tipHrana) {
        this.tipHrana = tipHrana;
    }

    @Override
    public String toString() {
        return "HranaCopii{" + "numeProdus=" + getNumeProdus() +
                ", pret=" + getPret() + ", cantitate=" + getCantitate() + ", discount=" + getDiscount() +
                ", bio=" + bio +
                ", tipHrana='" + tipHrana + '\'' +
                "} ";
    }
}


