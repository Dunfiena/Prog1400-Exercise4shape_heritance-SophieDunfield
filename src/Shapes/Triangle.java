package Shapes;

public class Triangle extends Shapes {
    private int angle1;
    private int angle2;

    private String Name;
    // Giving angles to determine what kind of triangle
    public Triangle(String color, double xlength, double ylength, int angle1, int angle2) {
        super(color, xlength, ylength);
        this.angle1=angle1;
        this.angle2=angle2;
    }

    public int getAngle1() {
        return angle1;
    }
    public int getAngle2() {
        return angle2;
    }
    //Determining what kind of triangle based on angles
    public String name(int angle1, int angle2){
        if (angle1==60 && angle2==60){
            Name="Equilateral Triangle";
        } else if (angle1==angle2) {
            Name="Isosceles Triangle";
        } else {
            Name="Scalene Triangle";
        }
        return Name;
    }
    //Triangle get area method
    public double getarea(double xlength, double ylength) {
        double area = (xlength * ylength)/2;
        return area;
    }
}
