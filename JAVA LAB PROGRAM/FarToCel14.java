
/*Ques14. Write a java program to implement abstract class and
abstract method with following details:
Create a abstract Base Class Data members: Temperature double temp;
Method members: void setTempData(double) abstact void changeTemp()
SubClass Fahrenheit (subclass of Temperature) Data members: double ctemp;
method member: Override abstract method changeTemp() to convert Fahrenheit
temperature into degree Celsius by using formula C=5/9*(F-32) and display 
converted temperatureSub Class Celsius Temperature) Data member: double ftemp;
Method member: (subclass of Override abstract method changeTemp() to convert
degree Celsius into Fahrenheit temperature by using formula F=9/5 c+32 and display
converted temperature */
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

abstract class Tempreture {
    double temp;

    void SetTempData(double t) {
        temp = t;
    }

    abstract void ChangeTemp();
}

class Fahrenheit extends Tempreture {
    double Ftemp;

    void ChangeTemp() {
        Ftemp = (5.0 / 9) * (temp - 32);
        System.out.printf("Tempreture in Celsius :%.2f", Ftemp);
        System.out.println("");
    }
}

class Celsius extends Tempreture {
    double Ctemp;

    void ChangeTemp() {
        Ctemp = (9.0 / 5) * temp + 32;
        System.out.printf("Tempreture in Farenheit :%.2f", Ctemp);
        System.out.println("");
    }
}

public class FarToCel14 {
    public static void main(String[] args) {
        Fahrenheit object = new Fahrenheit();
        Celsius object1 = new Celsius();
        Scanner obj = new Scanner(System.in);
        double temp;
        System.out.print("Enter Tempreture in Fahrenheit :");
        temp = obj.nextDouble();
        object.SetTempData(temp);
        object.ChangeTemp();
        System.out.print("Enter Tempreture in Celsious :");
        temp = obj.nextDouble();
        object1.SetTempData(temp);
        object1.ChangeTemp();
    }
}
