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
public class rectarea_cmdlineargs {
    public static void main(String []args){
        double l= Double.parseDouble(args[0]);
        double w= Double.parseDouble(args[1]);
        
        double a;
        a=l*w;
        System.out.println("Area of rectangle is: "+a);
    }
}
