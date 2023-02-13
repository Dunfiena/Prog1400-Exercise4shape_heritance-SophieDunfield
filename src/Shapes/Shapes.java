package Shapes;

public abstract class Shapes {
    private String Color;
    private double xlength;
    private double ylength;

    public String getColor() {
        return Color;
    }

    //Super class, just getting a few normal values and passing them from constructor
    // to child classes
    public Shapes(String color, double xlength, double ylength) {
        Color = color;
        this.xlength = xlength;
        this.ylength = ylength;
    }

    public double getXlength() {
        return xlength;
    }
    public double getYlength() {
        return ylength;
    }
    // get area method to pass to child classes
    public double getarea(double xlength, double ylength){
        double area=xlength*ylength;
        return area;
    }
}
