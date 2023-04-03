package org.example;
import java.util.*;

public class Metode {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int nrRandom = random.nextInt(4);;
    public String cadou(int nrRandom){
        List<String> listaCadouri = new ArrayList<>();
        listaCadouri.add("Delfin-jucarie pentru baie");
        listaCadouri.add("Carte senzoriala bebelusi");
        listaCadouri.add("Jucarie minge colorata");
        listaCadouri.add("Set cuburi educative");


         String cadouRandom = null;
        for(int i=0;i< listaCadouri.size();i++)
        {
            if(nrRandom==i)
            {
                System.out.print("Felicitari! Pentru ca ati comandat produse cu valoarea mai mare de 200 de lei, primiti cadou: ");
                cadouRandom = listaCadouri.get(i);
            }
        }
        return cadouRandom;
}

    public String mesajLivrare(double totalDePlata)
    {
        if(totalDePlata>150){
            return "Comanda este peste 150 lei, iar livrarea este gratuita";
        } else{
            return "La comenzi sub 150 de lei, costul de livrare este 10 lei";
        }
    }

    List<Double> listaPreturiTotale = new ArrayList<>();
    Map<String,Integer> produseComandate = new HashMap<>();

    public void operatii(){
        System.out.print("\n");
        System.out.println("Ati comandat urmatoarele produse: ");
        afisezProduseComandate(produseComandate);
        System.out.print("\n");
        System.out.println("Suma de plata pentru comanda efectuata este: "+totalDePlataProduse(listaPreturiTotale));
        if(verificSumaPentruCadou(totalDePlataProduse(listaPreturiTotale))){
            System.out.println(cadou(nrRandom));
        }

        System.out.println(mesajLivrare(totalDePlataProduse(listaPreturiTotale)));
        if(totalDePlataProduse(listaPreturiTotale) <150) {
            System.out.println("Totalul de plata cu livrare este de: " + totalPlataCuLivrare(totalDePlataProduse(listaPreturiTotale)));
        }
    }



    public double totalDePlataProduse(List<Double>lista){
        double sumaDePlata=0.00;
        for(Double pret: lista)
        {
            sumaDePlata=sumaDePlata + pret;
        }
         return  sumaDePlata;
    }



    public boolean verificSumaPentruCadou(double sumaDePlata){
        if(sumaDePlata<200){
      return false;
        } else
            return true;
   }

   public double totalPlataCuLivrare(double sumaDePlata){
        double total = 10 + sumaDePlata;
        return total;
   }

   public void afisezProduseComandate(Map<String,Integer> mapProduse){
       System.out.println(mapProduse);

   }
    public void dateHrana(List<HranaCopii> listaHrana) {
        System.out.println("Produsele disponibile din categoria \"Hrana pentru copii\" sunt: ");
        for (HranaCopii element : listaHrana) {
            System.out.println(element);
        }
        System.out.print("Introduceti produsul dorit: ");
        String produs = scanner.nextLine();
        System.out.print("Introduceti cantitatea: ");
        int cantitateComandata = Integer.parseInt(scanner.nextLine());

        for (HranaCopii element : listaHrana) {
            if (produs.equalsIgnoreCase(element.getNumeProdus())) {
                double pretFinal = cantitateComandata * element.getPret();
                System.out.println("Pretul total este: " + pretFinal);
                double pretCuDiscount = pretFinal - (element.getDiscount() / 100 * pretFinal);
                System.out.println("Pretul cu discount este: " + pretCuDiscount);
                produseComandate.put(element.getNumeProdus(), cantitateComandata);
                listaPreturiTotale.add(pretCuDiscount);
            }
        }
    }

    public void dateJucarii(List<JucariiCopii> listaJucariiBebelusi, List<JucariiCopii> listaJucariiCopii){
        System.out.print("Introduceti \" 1\"  pentru varsta 0-12 luni sau \"2\" pentru varsta 1-3 ani: ");
        int y = Integer.parseInt(scanner.nextLine());
        if(y==1) {
            for(JucariiCopii elem: listaJucariiBebelusi) {
                System.out.println(elem);
            }
            System.out.print("Introduceti numele jucariei: ");
            String nume = scanner.nextLine();
            System.out.print("Introduceti cantitatea: ");
            int cantitateProdus = Integer.parseInt(scanner.nextLine());

            for(JucariiCopii element: listaJucariiBebelusi)
            {
                if(nume.equalsIgnoreCase(element.getNumeProdus())){
                    double pretTotal = cantitateProdus * element.getPret();
                    System.out.println("Pretul total este: " + pretTotal);
                    double pretCuDiscount = pretTotal - (element.getDiscount()/100 * pretTotal);
                    System.out.println("Pretul cu discount este: " +pretCuDiscount);
                    produseComandate.put(element.getNumeProdus(), cantitateProdus);
                    listaPreturiTotale.add(pretCuDiscount);
                }
            }
        } else if (y==2){
            for(JucariiCopii elem:listaJucariiCopii){
                System.out.println(elem);
            }
            System.out.print("Introduceti numele jucariei: ");
            String nume = scanner.nextLine();
            System.out.print("Introduceti cantitatea: ");
            int cantitateProdus = Integer.parseInt(scanner.nextLine());

            for(JucariiCopii element: listaJucariiCopii)
            {
                if(nume.equalsIgnoreCase(element.getNumeProdus())){
                    double pretTotal = cantitateProdus * element.getPret();
                    System.out.println("Pretul total este: " + pretTotal);
                    double pretCuDiscount = pretTotal - (element.getDiscount()/100 * pretTotal);
                    System.out.println("Pretul cu discount este: " +pretCuDiscount);
                    produseComandate.put(element.getNumeProdus(), cantitateProdus);
                    listaPreturiTotale.add(pretCuDiscount);
                }
            }
        }
    }

    public void dateImbracaminte(List<ImbracaminteCopii> listaImbracaminte){
        System.out.println("Produsele disponibile din categoria \"Imbracaminte Copii\" sunt:");
        for(ImbracaminteCopii element:listaImbracaminte){
            System.out.println(element);
        }
        System.out.print("Introduceti numele produsului: ");
        String nume = scanner.nextLine();
        System.out.print("Introduceti cantitatea: ");
        int cantitate = Integer.parseInt(scanner.nextLine());

        for(ImbracaminteCopii element: listaImbracaminte)
        {
            if(nume.equalsIgnoreCase(element.getNumeProdus())){
                double pretTotal = cantitate* element.getPret();
                System.out.println("Pretul total este: " + pretTotal);
                double pretCuDiscount =pretTotal-(element.getDiscount()/100 * pretTotal);
                System.out.println("Pretul cu discount este: " +pretCuDiscount);
                produseComandate.put(element.getNumeProdus(), cantitate);
                listaPreturiTotale.add(pretCuDiscount);
            }
        }
    }

}
