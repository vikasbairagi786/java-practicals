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
public class p13 {
    int add(int num1, int num2)
    {
        return num1+num2;
    }
    float add(float num1, float num2)
    {
        return num1+num2;
    }
    double add(double num1, double num2)
    {
        return num1+num2;
    }
    public static void main(String []args){
        p13 obj = new p13();
        System.out.println(obj.add(5,10));
        System.out.println(obj.add(5.20,2.2));
        System.out.println(obj.add(5.100125,3.2));
    
    }
}
