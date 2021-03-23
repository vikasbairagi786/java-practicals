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
public class p18 {
  public static void main(String args[])
    {
        TriArea obj = new TriArea();
        System.out.println(obj.area(10,10));
    }
}
abstract class RectArea{
   abstract double area(int l,int w);
}
class TriArea extends RectArea{
    
    double area(int h, int b)
    {
        return 0.5*b*h;
    }
}
