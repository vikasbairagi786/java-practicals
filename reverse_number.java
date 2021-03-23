/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac1;


public class reverse_number {
    public static void main(String []args){
        int a;
        int r=0;
        int n=1234;
       
        while(n!=0){
            a=n%10;
            r=r*10+a;
            n=n/10;
        }
        System.out.println("Reverse number is: "+r);
        
    }
}
