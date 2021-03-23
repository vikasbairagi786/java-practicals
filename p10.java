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
public class p10 {
    public static void main(String args[])
    {
        Scanner scan= new Scanner(System.in);
        int a[]=new int[10];
        
        int sum=0;
        
        System.out.println("Enter number of elements: ");
        
        for(int i=0;i<10;i++)
        {
            a[i]=scan.nextInt();
        }
        for (int number:a)
        {
            sum=sum+number;
        }
        System.out.println("Sum of elements of array: "+sum);
    }
}
