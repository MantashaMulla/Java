package javaapplication1;
import java.util.Scanner;
public class MethodOverloadingEx2 {
    int rc,lr,wr,ht,bt,as,rcy,hcy;
    public static void main(String[] args) 
    {
        MethodOverloadingEx2 obj =new MethodOverloadingEx2();
        obj.use_of_mo();
    }
    public void use_of_mo()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        rc=sc.nextInt();
        System.out.println("Enter the length of rectangle: ");
        lr=sc.nextInt();
        System.out.println("Enter the width of rectangle: ");
        wr=sc.nextInt();
        System.out.println("Enter the height of triangle: ");
        ht=sc.nextInt();
        System.out.println("Enter the base of triangle: ");
        bt=sc.nextInt(); 
        System.out.println("Enter the side of square: ");
        as=sc.nextInt();
        System.out.println("Enter the radius of cylinder: ");
        rcy=sc.nextInt();
        System.out.println("Enter the height of cylinder: ");
        hcy=sc.nextInt();
        Area(rc);
        Area(lr,wr);
        Area(ht,bt);
        Area(as);
        Area(rcy,hcy);
    }
    public void Area(int rc)
    {
        double aoc;
        aoc = Math.PI * rc * rc;
        System.out.println("The Area of Circle: " + aoc);
    }
    
    public void Area(int lr, int wr)
    {
        double aor;
        aor = lr * wr;
        System.out.println("The Area of Rectangle: " + aor);
    }
    
    public void Area(double ht, double bt)
    {
        double aot;
        aot = ht * bt / 2;
        System.out.println("The Area of Triangle: " + aot);
    }
    
    public void Area(double as)
    {
        double aos;
        aos = as * as;
        System.out.println("The Area of Square: " + aos);
    }
    
    public void Area(float rcy, float hcy)
    {
        double aocy;
        aocy = 2 * Math.PI * rcy * hcy + 2 * Math.PI * rcy * rcy;
        System.out.println("The Area of Cylinder: " + aocy);
    }
}

