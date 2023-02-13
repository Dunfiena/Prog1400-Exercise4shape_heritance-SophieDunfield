package Shapes;

public class Square extends Shapes {
    private String Name;
    private boolean isParallel;

    public boolean isParallel() {
        return isParallel;
    }
    // contructor for square
    public Square(String color, double xlength, double ylength, boolean isParallel) {
        super(color, xlength, ylength);
        this.isParallel = isParallel;
    }
    // determine what kind of 4 sides shape
    public String Name(double xlength, double ylength, boolean isParallel) {
        if (getXlength() == getYlength()) {
            Name = "Square";
        } else if (!isParallel) {
            Name = "Parallelogram";
        } else {
            Name = "Rectangle";
        }
        return Name;
    }
}
