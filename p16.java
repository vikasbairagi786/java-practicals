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

public class p16 extends RectArea1 {
    double area(int b, int h)
    {
        return 0.5*b*h;
    }
    public static void main(String args[])
    {
        p16 obj = new p16();
        System.out.println(obj.area(10, 10));
    }
}
class RectArea1{
    double area(int l, int w)
    {
        return l*w;
    }
}