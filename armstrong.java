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
public class armstrong {
    public static void main(String[] args){
        int b= 0,a;
        int n=153;
        int p=n;
        
        while(n>0){
            a=n%10;
            b=b+(a*a*a);
            n=n/10;
        }
        if(p==b){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong Number");
        }
    }
}
