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
public class p11 {
    private String n;
    public p11(){
        n="program";
        System.out.println("Constructor Called");
    }
    public static void main(String args[]){
        p11 obj=new p11();
        System.out.println("Name is: "+obj.n);
    }
}
