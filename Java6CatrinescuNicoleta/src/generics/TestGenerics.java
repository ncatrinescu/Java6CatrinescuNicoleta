/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author Amastasia
 */
public class TestGenerics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new Box for String
        String sir = new String("Sirul de pus in cutie");
        Box<String> cutiuta = new Box<String>();
        cutiuta.setVolume(sir);
        
        //create a Box of Double
        Double numarCuVirgula = new Double(223.887);        
        Box<Double> cutioaie = new Box<>();
        cutioaie.setVolume(numarCuVirgula);
        
        // create a Box for Bocanc
        Bocanc bocanc = new Bocanc();
        Box<Bocanc> cutieDeBocanci = new Box<>();
        cutieDeBocanci.setVolume(bocanc);
        
        System.out.println("Cutiuta de siruri contine: " + cutiuta.getVolume());
        System.out.println("Cutia cu Double contine:" +  cutioaie.getVolume());
        System.out.println("Cutia de Bocanci contine: " + cutieDeBocanci.getVolume());
        
        
        // create a Urna for Interger
        
        Integer numarIntreg = 12;
        Urna<Integer> urnaCuIntregi = new Urna<>();
        urnaCuIntregi.setMyNumber(numarIntreg);
       //Urna<Bocanc> urnaDeBocanci = new Urna<>();
        //urnaCuIntregi.setMyNumber(bocanc);
       
        
        Ordered<Integer,String> perechiOrdonate;
        Integer i = 10;
        String s = "Aha!";
        perechiOrdonate = new Ordered<Integer,String>(i, s);
        System.out.println("Perechea ordonata este: (" +  
              perechiOrdonate.getKey() + "," +
                perechiOrdonate.getValue() + ")");
    

// test generyc method
//call a generyc type method

Ordered<Integer, String> p1 = new Ordered<>(1, "apple");
Ordered<Integer, String> p2 = new Ordered<>(2, "pear");
Ordered<Integer, String> p3 = new Ordered<>(1, "apple");
boolean same;
same = Util.<Integer, String>compare(p1, p2);
System.out.println("("+p1.getKey()+","+p1.getValue()+") is equal with ("+p2.getKey()+","+p2.getValue()+") is "+same);
same = Util.<Integer, String>compare(p1, p3);
System.out.println("("+p1.getKey()+","+p1.getValue()+") is equal with ("+p3.getKey()+","+p3.getValue()+") is "+same);
    }    
}
