
/*Ques13. Write a java programto calculate the area of a
rectangle, a square and a circle. Create an abstract
class 'Shape' with three abstract methods namely 
rectangleArea() taking two parameters, squareArea()
and circleArea() taking one parameter each. Now create 
another class 'Area' containing all the three methods 
rectangleArea(),squareArea() and circleArea() for 
printing the area of rectangle, square and circle 
respectively. Create an object of class Area and call 
all the three methods. (Use Runtime Polymorphism) */
import java.util.*;

abstract class Shape {
    abstract void rectangleArea(int l, int b);

    abstract void squareArea(int s);

    abstract void circleArea(int r);
}

public class Area13 extends Shape {
    void rectangleArea(int l, int b) {
        System.out.println("Area of rectangle is : " + (l * b));
    }

    void squareArea(int s) {
        System.out.println("Area of sqaure is : " + (s * s));
    }

    void circleArea(int r) {
        System.out.println("Area of cirlce is: " + (3.14 * r * r));
    }

    public static void main(String args[]) {
        Scanner so = new Scanner(System.in);
        Area13 obj = new Area13();
        int ll, bb;
        int rr, ss;
        System.out.println("Enter the value of length and breadth of rectangle");
        ll = so.nextInt();
        bb = so.nextInt();
        System.out.println("Enter the value of Circle radius");
        rr = so.nextInt();
        System.out.println("Enter the side of the square");
        ss = so.nextInt();

        obj.rectangleArea(ll, bb);
        obj.squareArea(ss);
        obj.circleArea(rr);

    }
}