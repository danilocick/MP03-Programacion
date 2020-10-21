package Daus2;

import java.util.Objects;
import java.util.Random;

public class Dau {

    public int dau;
    Random ran1 = new Random();

    public int getDau() {
        return dau;
    }

    public void setDau(int dau) {
        this.dau = dau;
    }

    @Override
    public String toString() {
        return "Dau{" + " Dau= " + dau + " }";
    }

    public int tirar(){
        dau = ran1.nextInt(6)+1;
        return dau;
    }
}
