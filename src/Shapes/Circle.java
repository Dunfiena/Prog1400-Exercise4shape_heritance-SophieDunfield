package Shapes;

public class Circle extends Shapes{
    private boolean isCircle;

    public boolean isCircle() {
        return isCircle;
    }

    //Uses isCircle boolean to figure out if it's a circle or oval and then
    // getting the area
    public double getarea(double xlength, double ylength, boolean isCircle) {
        double a=xlength;
        double b=ylength;
        double area = 0;
        if(isCircle){
            double rad=a/2;
            area=Math.PI*rad*rad;
        }else{
            if (xlength>ylength){
                area=Math.PI*a/2*b/2;
            }else{
                area=Math.PI*b/2*a/2;
            }
        }
        return area;
    }
    public Circle(String color, double xlength, double ylength, boolean isCircle) {
        super(color, xlength, ylength);
        this.isCircle=isCircle;
    }
}
