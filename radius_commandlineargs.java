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
public class radius_commandlineargs {
    public static void main(String[] args){
        double r=Double.parseDouble(args[0]);
        double a;
        a=(22*r*r)/7;
        System.out.println("Area of circle is: "+a);
        
    }
}
