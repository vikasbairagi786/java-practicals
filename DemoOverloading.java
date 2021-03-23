/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac1;

/**
 *
 * @author Ankit Chandria
 */
public class DemoOverloading {
    double area(float x)
    {
        return 3.14*x*x;
    }
    double area(double x)
    {
        return x*x;
    }
    public static void main(String args[])
    {
        DemoOverloading obj = new DemoOverloading();
        System.out.println(obj.area(10));
        System.out.println(obj.area(5.4));
    }

}
