package Daus2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        Dau dau = new Dau();
        JocDaus joc = new JocDaus();
        int i;

        do {
            menu.ImprimirMenu();
            i = sc.nextInt();
            switch (i){
                case 1:
                    joc.menu();
                    //Daus();
                    break;
                case 2:
                    //Oca();
                    break;
                case 3:
                    //TicTacToe();
                    break;
                case 4:
                    break;
            }
        }while (i!=4);

    }
}

