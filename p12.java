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
public class p12 {
    double w,h,d,v;
    public p12(double w,double h,double d){
        System.out.println("Parameterised Constructor");
        v=w*h*d;
    }
    
    public static void main(String args[]){
        p12 obj=new p12(5,2,5);
        System.out.println("Volume is: "+obj.v);
    }
}
