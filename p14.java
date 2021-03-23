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
public class p14 {
    double area(int r)
    {
        return 3.14*r*r;
    }
    double area(int l,int w)
    {
        return l*w;
    }
    public static void main(String args[])
    {
        p14 obj = new p14();
        System.out.println(obj.area(10));
        System.out.println(obj.area(5,4));
    }
}
