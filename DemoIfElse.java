
package prac1;

import java.util.Scanner;

public class DemoIfElse {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();
        if(a%2==0)
        {
            System.out.print("Given number is even");
        }
        else{
            System.out.print("Given number is odd");
        }
        
                
    
    }
}
