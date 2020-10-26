package ExampleCollections;

public class Llapis {
    private int color;
    private float gruix;

    public Llapis(int color) {
        this.color = color;
        this.gruix = 1.0f;
    }

    public Llapis(int color, float gruix){
        this.color = color;
        this.gruix = gruix;
    }
    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public float getGruix() {
        return gruix;
    }

    public void setGruix(float gruix) {
        this.gruix = gruix;
    }

    @Override
    public String toString() {
        return "Llapis{" +
                "color=" + color +
                ", gruix=" + gruix +
                '}';
    }

    @Override
    public int compareTo(){
        if(this.color==){

        }
    }
}
