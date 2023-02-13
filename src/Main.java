import Shapes.*;

public class Main {

    public static void main(String[]arg){

        // instances of shapes
        Circle oval=new Circle("Green", 5, 3, false);
        Triangle equilateral=new Triangle("Blue", 6, 4, 60, 60);
        Square Rectangle = new Square("Red", 4, 7, true);

        // getting and printing the areas of various shapes
        System.out.println("The area of the "+oval.getColor()+ " circle is "+ oval.getarea(oval.getXlength(), oval.getYlength(),
                oval.isCircle()));
        System.out.println("The area of the "+equilateral.getColor() +" "+ equilateral.name(equilateral.getAngle1(), equilateral.getAngle2())
                + " is " +equilateral.getarea(equilateral.getXlength(), equilateral.getYlength()));
        System.out.println("The area of the "+Rectangle.getColor() +" " + Rectangle.Name(Rectangle.getXlength(), Rectangle.getYlength(),
                Rectangle.isParallel()) + " is "+ Rectangle.getarea(Rectangle.getXlength(), Rectangle.getYlength()));
    }
}
