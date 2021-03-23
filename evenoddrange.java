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
public class evenoddrange {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();
          int i;
         System.out.println("Even\tOdd");
        for(i=1;i<=a;i++)
        {
            if(i%2==0){
                 System.out.println(i);
                 continue;
            }
            else{
                System.out.println("\t"+i);
                continue;
            }
        }
      }
}
