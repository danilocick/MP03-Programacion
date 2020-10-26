package ExampleCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Crea un classe Llapis com a mínim amb els atributs,
        // color(int) i gruix(float), afegint-hi el comportament que
        // creguis necessari (getters, setters, toString, etc.)
        //- Els colors van del 0 al 7 i el gruix de 0.1 a 3.0

        //Crea dues caixes de llapissos (amb List)
        List<Llapis> llistaLlapisos1 = new ArrayList<>();
        List<Llapis> llistaLlapisos2 = new ArrayList<>();

        //Omple una caixa amb 10 llapisos de diferents colors (random)
        for (int i = 0;i<10;i++){
            llistaLlapisos1.add(new Llapis((int) (Math.random()*7)+1));
        }
        //Omple l'altre caixa amb 10 llapissos amb diferents
        // colors i de diferens gruixos (random)
        for (int i = 0;i<10;i++){
            llistaLlapisos2.add(new Llapis((int) (Math.random()*7)+1, (float) (Math.random()*3)));
        }

        //Imprimeix per la consola la informació dels llapissos
        // que hi ha a les dues caixes. Usa recorreguts amb
        // diferents tècniques (for, foreach. iterator, for loop)
        for(Llapis c:llistaLlapisos1){
            System.out.println(c);
        }
        System.out.println("---------------");
        System.out.println("---------------");
        for(Llapis c:llistaLlapisos2){
            System.out.println(c);
        }

        //Ordena els llapissos per color del més gran al més petit
        Collections.sort(llistaLlapisos1);
        for(Llapis c:llistaLlapisos1){
            System.out.println(c);
        }

        //Ordena els llapissos per gruix amb una classe anònima i un Comparator
        Collections.sort(llistaLlapisos2, new Comparator<Llapis>() {
            @Override
            public int compare(Llapis o1, Llapis o2) {
                if(o1.getColor()<o2.getColor()) return -1;
                else if(o1.getColor()>o2.getColor()) return 0;
                else return 0;
            }
        });

    }
}
