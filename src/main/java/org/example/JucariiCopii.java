package org.example;

public class JucariiCopii extends MagazinOnline{

        private String categorieVarsta;
        private String tipDeJucarie;

        public JucariiCopii(String numeProdus, double pret, int cantitate, double discount, String categorieVarsta, String tipDeJucarie){
            super(numeProdus, pret, cantitate, discount);
            this.categorieVarsta = categorieVarsta;
            this.tipDeJucarie = tipDeJucarie;
        }

        public void setCategorieVarsta(String categorieVarsta){
            this.categorieVarsta = categorieVarsta;
        }

        public String getCategorieVarsta(){
            return categorieVarsta;
        }

        public void setTipDeJucarie(String tipDeJucarie){
            this.tipDeJucarie = tipDeJucarie;
        }

        public String getTipDeJucarie()
        {
            return tipDeJucarie;
        }

    @Override
    public String toString() {
        return "JucariiCopii{" + "numeProdus=" + getNumeProdus()+
                ", pret=" + getPret()+ ", cantitate=" +getCantitate()+ ", discount=" + getDiscount() +
        ", categorieVarsta='" + categorieVarsta + '\'' +
                ", tipDeJucarie='" + tipDeJucarie + '\'' +
                '}';
    }
}


