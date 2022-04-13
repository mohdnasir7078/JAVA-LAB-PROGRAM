
/*Ques15. Write a java program to create an interface that 
consists of a method to display volume () as an abstract 
method and redefine this method in the derived classes to 
suit their requirements.Create classes called Cone, Hemisphere 
and Cylinder that implements the interface. Using these three 
classes, design a program that will accept dimensions of a cone, 
cylinder interactively and display the volumes and hemisphere.
Volume of cone (1/3)pir^2h
Volume of hemisphere = (2/3)pir^3
Volume of cylinder = pir^2h */
import java.util.Scanner;

interface Interface {
    void Volume();
}

class Cone implements Interface {
    float radius;
    float hight;

    void GetDataCone() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Please Enter Radius for Cone :");
        radius = obj.nextFloat();
        System.out.print("Please Enter Hight for Cone :");
        hight = obj.nextFloat();
    }

    public void Volume() {
        double val;
        val = (1.0 / 3) * radius * radius * 3.14 * hight;
        System.out.printf("Volume Of Cone is :%.2f", val);
        System.out.println();
    }
}

class Hemisphere implements Interface {
    float radius;

    void GetDataHemisphare() {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Please Enter Radius for Hemisphere :");
        radius = obj1.nextFloat();
    }

    public void Volume() {
        double val;
        val = (2.0 / 3) * radius * radius * 3.14 * radius;
        System.out.printf("Volume Of Hemisphere is :%.2f", val);
        System.out.println();
    }
}

class Cylinder implements Interface {
    float radius;
    float hight;

    void GetDataCylinder() {
        Scanner obj = new Scanner(System.in);
        System.out.printf("Please Enter Radius for Cylinder :");
        radius = obj.nextFloat();
        System.out.printf("Please Enter Hight for Cylinder :");
        hight = obj.nextFloat();
    }

    public void Volume() {
        double val;
        val = radius * radius * 3.14 * hight;
        System.out.printf("Volume Of Cylinder is :%.2f", val);
        System.out.println();
    }
}

public class VolumeInterface15 {
    public static void main(String[] args) {
        Cone ConeObject = new Cone();
        Hemisphere HemispphareObject = new Hemisphere();
        Cylinder CylinderObject = new Cylinder();
        ConeObject.GetDataCone();
        ConeObject.Volume();
        HemispphareObject.GetDataHemisphare();
        HemispphareObject.Volume();
        CylinderObject.GetDataCylinder();
        CylinderObject.Volume();
    }
}