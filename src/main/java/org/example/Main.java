package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Metode metode = new Metode();
        Scanner scanner = new Scanner(System.in);
        HranaCopii hrana1 = new HranaCopii("Piure de fructe", 8.50,10, 5.00, true, "Piureuri bebelusi");
        HranaCopii hrana2 = new HranaCopii("Cereale cu mar bio",11.50,15, 7.00, true, "Cereale");
        HranaCopii hrana3 = new HranaCopii("Lapte praf 0+", 24.00, 20, 5, false, "Formule speciale de lapte pt bebe");

        List<HranaCopii> listaHrana = new ArrayList<>();
        listaHrana.add(0, hrana1);
        listaHrana.add(1, hrana2);
        listaHrana.add(2, hrana3);

        JucariiCopii jucarie1 = new JucariiCopii("Inel gingival", 8.00, 26,
                2.00, "0-12 luni", "Jucarii dentitie");
        JucariiCopii jucarie2 = new JucariiCopii("Zornaitoare de plus",34.50,12,
                4.00, "0-12 luni", "Jucarii bebelusi");
        JucariiCopii jucarie3 = new JucariiCopii("Ariciul cu activitati senzoriale", 120.00, 10,
                7.00, "0-12 luni", "Jucarii bebelusi");
        JucariiCopii jucarie4 = new JucariiCopii("Piramida cu inele ursulet",30.00, 32,
                9.00, "1-3 ani", "Jucarii educative");
        JucariiCopii jucarie5 = new JucariiCopii("Sortator din lemn",72.00, 14,
                10.00, "1-3 ani", "Jucarii educative");
        JucariiCopii jucarie6 = new JucariiCopii("Masuta de activitati",88.00, 28,
                14.00, "1-3 ani", "Jucarii interactive");

        List<JucariiCopii> listaJucariiBebelusi = new ArrayList<>();
        listaJucariiBebelusi.add(jucarie1);
        listaJucariiBebelusi.add(jucarie2);
        listaJucariiBebelusi.add(jucarie3);

        List<JucariiCopii> listaJucariiCopii = new ArrayList<>();
        listaJucariiCopii.add(jucarie4);
        listaJucariiCopii.add(jucarie5);
        listaJucariiCopii.add(jucarie6);

        ImbracaminteCopii haine1 = new ImbracaminteCopii("Bluza din bumbac organic", 75.00, 10,
                5.00, "Bluze cu maneca lunga");
        ImbracaminteCopii haine2 = new ImbracaminteCopii("Rochita cu volanase",60.00,17,
                6.00, "Rochite fetite");
        ImbracaminteCopii haine3 = new ImbracaminteCopii("Salopeta impermeabila",160.00, 12,
                11.00, "Combinezoane");

        List<ImbracaminteCopii> listaImbracaminte = new ArrayList<>();
        listaImbracaminte.add(haine1);
        listaImbracaminte.add(haine2);
        listaImbracaminte.add(haine3);

        System.out.println("Alegeti din optiunile urmatoare: \n" +
                "0- Finalizare comanda \n" +
                "1- Categorie Hrana pentru copii \n" +
                "2- Categoria Jucarii pentru copii \n" +
                "3- Categoria Imbracaminte pentru copii");

        List<Double> listaPreturiTotale= new ArrayList<>();
        while(true){
            System.out.print("Introduceti optiunea: ");
            int x= Integer.parseInt(scanner.nextLine());

        switch (x) {
            case 0:
                metode.operatii();
                System.exit(0);
            case 1:
                metode.dateHrana(listaHrana);
                break;
            case 2:
                metode.dateJucarii(listaJucariiBebelusi, listaJucariiCopii);
                break;
            case 3:
                metode.dateImbracaminte(listaImbracaminte);
                break;
            default:
                System.out.println("Ne pare rau, categoria tastata nu exista! ");
                System.exit(0);
        }
       }
    }

}

