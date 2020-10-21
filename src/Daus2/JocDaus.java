package Daus2;

import java.util.Scanner;

public class JocDaus {
    public Dau dau1, dau2, dau3;
    int contadorpartidas, contadorganadas;
    int i;
    Scanner sc = new Scanner(System.in);


    public JocDaus() {
        dau1 = new Dau();
        dau2 = new Dau();
        dau3 = new Dau();
    }

    public void menu(){
        do {
            subMenu();
            i = sc.nextInt();
            switch (i){
                case 1:
                    Juga();
                    System.out.println(toString());
                    contadorpartidas++;
                    if(dau1.getDau() == dau2.getDau() && dau1.getDau() == dau3.getDau()){
                        contadorganadas++;
                    }

                    break;
                case 0:
                    System.out.println("Has jugat "+ contadorpartidas +" partides");
                    System.out.println("Has guanyat "+ contadorganadas +" partides");
                    break;
            }
        }while (i != 0);

    }

    public void Juga(){
        dau1.tirar();
        dau2.tirar();
        dau3.tirar();
    }

    public void subMenu(){
        System.out.println("1 - Tirar daus");
        System.out.println("0 - Acabar");
    }

    @Override
    public String toString() {
        return "JocDaus{" +
                " Dau1 = " + dau1 +
                ", Dau2 = " + dau2 +
                ", Dau3 = " + dau3 +
                " }";
    }
}
