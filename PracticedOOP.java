import java.util.Scanner;   // its library for using user input

interface Shape{                    // interface for taking the area
    long getarea();
}
class Rectangle implements Shape{
    long length;
    long width;
    public Rectangle(long length, long width){
        this.length= length;
        this.width= width;

    }
    public long getarea(){
        return length*width;
    }

}

class Square extends Rectangle implements Shape{
    long sidelength;
    public Square(long sidelength){
        super(sidelength,0 );
            this.sidelength= sidelength;
        }
        public long getarea(){
            return sidelength* sidelength;
        }

    }


class Circle implements Shape{
    long radius;
    public Circle(long radius){
        this.radius= radius;
    }

    public long getarea(){
    return (long)(Math.PI*radius*radius);
}

}


public class PracticedOOP {
    public static void main(String[] args){
        System.out.print("Enter the length for Rectangle area: ");
        Scanner s= new Scanner(System.in);
        long length = s.nextLong();
        System.out.print("Enter the width for Rectangle area: ");
        long width= s.nextLong();
        System.out.print("Enter the length for Square area: ");
        long lengths= s.nextLong();
        System.out.print("Enter the Radius for Circle area: ");
        long radius = s.nextLong();
        Shape[] shapes = new Shape[3];
        shapes[0]= new Rectangle(length,width);
        shapes[1] = new Square(lengths);
        shapes[2]=new Circle(radius);
        for(Shape area: shapes){
            System.out.println("The area of :" + area.getarea() );
        }
        // for sperating showing the areas of these using polymorphism and typecasting
        Shape myshape= new Rectangle(length,width);
        System.out.println("The area of rectangle is: " + myshape.getarea());
        Shape myshape2 = new Square(lengths);
        System.out.println("THe area of Square is: " + myshape2.getarea());
        Shape myshape23 = new Circle(radius);
        System.out.println("THe area of Circle is: " + myshape23.getarea());
        




    }
}
