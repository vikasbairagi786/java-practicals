/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac1;
import java.util.Scanner;

/**
 *
 * @author Ankit Chandria
 */
public class dowhile {
      public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();
        do
        {
            if(a%2==0)
                System.out.println(a);
            a++;
        }
        while(a<10);
      }
}
