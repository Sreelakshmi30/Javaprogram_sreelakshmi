import java.util.*;
abstract class shape
{
    public int length,breadth;
    abstract void printArea();
}
class Rectangle extends shape{
    Scanner sc = new Scanner(System.in);
    void printArea()
    {
        System.out.println("Enter length:");
        super.length = sc.nextInt();
        System.out.println("Enter breadth:");
        super.breadth = sc.nextInt();
        System.out.println("Area of rectangle:"+(length*breadth));
    }
}
class Triangle extends shape
{
    Scanner sc = new Scanner(System.in);
    void printArea()
     {
        System.out.println("Enter height:");
        super.length = sc.nextInt();
        System.out.println("Enter breadth:");
        super.breadth = sc.nextInt();
        System.out.println("Area of triangle:"+(0.5f*length*breadth));
    }
}
class Circle extends shape
{
    Scanner sc = new Scanner(System.in);
    void printArea(){
        System.out.println("Enter radius:");
        super.length = sc.nextInt();
        System.out.println("Area of Circle:"+((3.14f)*length*length));
    }
}
public class CO3PG1
 {
    public static void main(String ...a){
        shape s = new Rectangle();
        shape s1 = new Triangle();
        shape s2 = new Circle();
        s.printArea();
        s1.printArea();
        s2.printArea();
    }
}