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
public class p4_SwitchCase {
     public static void main(String []args)
    {
        int i,count;
        float marks=0, per, avg;
        Scanner scan;
        scan=new Scanner(System.in);
        
        System.out.println("Enter the number of subjects");
        count=scan.nextInt();
        System.out.println("Marks:");
        for(i=0;i<count;i++){
            marks+=scan.nextInt();
        }
        System.out.println("Total marks: "+marks);
        per=((100*marks)/(100*count));
        System.out.println("Percentage: "+per);
        switch((int)per/10) {
            case 9: System.out.println("Grade A");
               break;            
            case 8: System.out.println("Grade B");
               break;
            case 7: System.out.println("Grade c");
               break;
            case 6: System.out.println("Grade D");
               break;
            case 5: System.out.println("Grade F");
               break;
            default: System.out.println("Grade Fail");
              break;
        }
                

    }

}
