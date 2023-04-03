package org.example;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static junit.framework.TestCase.*;

public class MetodeTest {

    Metode metode;
    Random random = new Random();

    @Before
    public void setup(){
        metode = new Metode();
    }

    @Test
    public void testMesajLivrare() {
        String str = metode.mesajLivrare(180);
        assertEquals("Comanda este peste 150 lei, iar livrarea este gratuita",str);

    }

    @Test
    public void testMesajLivrare2(){
        String str = metode.mesajLivrare(100);
        assertEquals("La comenzi sub 150 de lei, costul de livrare este 10 lei",str);
    }

    @Test
    public void testCadou()
    {
        String str = metode.cadou(0);
        assertEquals("Delfin-jucarie pentru baie", str);
    }
    @Test
    public void testCadou1()
    {
        String str = metode.cadou(1);
        assertEquals("Carte senzoriala bebelusi", str);
    }
    @Test
    public void testCadou2(){
        String str = metode.cadou(2);
        assertEquals("Jucarie minge colorata",str);
    }
    @Test
    public void testCadou3(){
        String str = metode.cadou(3);
        assertEquals("Set cuburi educative", str);
    }
    @Test
    public void testCadou4(){
        String str = metode.cadou(4);
        assertEquals(null,str);
    }


    List<Double>lista = new ArrayList<>();

    @Test
    public void TestTotalDePlataProduse(){
        lista.add(20.55);
        lista.add(10.24);
        lista.add(15.34);
        double rezultat = metode.totalDePlataProduse(lista);
        assertEquals(46.13, rezultat, 0.01);
    }

    @Test
    public void TestVerificSumaPentruCadou(){
        boolean rezultat = metode.verificSumaPentruCadou(199);
        assertFalse(rezultat);
    }
    @Test
    public void TestVerificSumaPentruCadou2(){
        boolean rezultat = metode.verificSumaPentruCadou(200);
        assertTrue(rezultat);
    }

    @Test
    public void TestTotalPlataCuLivrare(){
        double rezultat = metode.totalPlataCuLivrare(32.87);
        assertEquals(42.87, rezultat, 0.01);
    }
}

