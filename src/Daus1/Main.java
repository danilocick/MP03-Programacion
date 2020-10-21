package Daus1;

import java.util.Scanner;
import java.util.Random;

public class Main {

    //Fer un programa que simuli el llançament de dos daus i
    // que mostri per pantalla la freqüència dels resultats de n llançaments.
    // (n ha de ser demanat per consola i sense crear cap classe Dau)
    //(per veure’n un exemple java -jar daus.jar)

    public static void main(String[] args) {

        int vegades, dado2 = 0, dado1 = 0;
        int[] resultat = new int[13];

        //constuctor del scanner i random
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantes vegades vols llençar els daus? ");
        vegades = sc.nextInt();

        daditos(dado1, dado2, resultat, vegades);
        imprimirresultado(resultat);

    }

    public static void daditos(int dado1, int dado2, int resultat[],int vegades){
        Random ran1 = new Random();
        for (int i=0;i<vegades;i++){
            dado1 = ran1.nextInt(6)+1;
            dado2 = ran1.nextInt(6)+1;
            resultat[dado1+dado2] = resultat[dado1+dado2] + 1;
        }
    }
    public static void imprimirresultado(int resultat[]) {
        for (int i = 2; i < resultat.length; i++) {
            System.out.println(i + " --> " + resultat[i] + " vegades");
        }
    }


}