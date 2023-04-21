package org.example;

public class ImbracaminteCopii extends Produs {
    private String categorieImbracaminte;

    public ImbracaminteCopii(String numeProdus, double pret, int cantitate, double discount, String categorieImbracaminte) {
        super(numeProdus, pret, cantitate, discount);
        this.categorieImbracaminte=categorieImbracaminte;
    }

    public String getTipImbracaminte() {
        return categorieImbracaminte;
    }

    public void setTipImbracaminte(String tipImbracaminte) {
        this.categorieImbracaminte = categorieImbracaminte;
    }

    @Override
    public String toString() {
        return "ImbracaminteCopii{" + "numeProdus=" + getNumeProdus()+
                ", pret=" + getPret()+ ", cantitate=" +getCantitate()+ ", discount=" + getDiscount() +
                ", categorieImbracaminte='" + categorieImbracaminte + '\'' +
                '}';
    }
}
