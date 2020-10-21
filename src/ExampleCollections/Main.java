package ExampleCollections;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Llapis> llistaLlapisos1 = new ArrayList<>();
        List<Llapis> llistaLlapisos2 = new ArrayList<>();

        for (int i = 0;i<10;i++){
            llistaLlapisos1.add(new Llapis((int) (Math.random()*7+1)));
        }

        for (int i = 0;i<10;i++){
            llistaLlapisos2.add(new Llapis((int) (Math.random()*7+1), (float) (Math.random()*3)));
        }

        //Printar
        for(Llapis c:llistaLlapisos1){
            System.out.println(c);
        }
        System.out.println("---------------");
        System.out.println("---------------");
        for(Llapis c:llistaLlapisos2){
            System.out.println(c);
        }

    }
}
