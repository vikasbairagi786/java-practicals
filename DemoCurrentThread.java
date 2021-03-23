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
public class DemoCurrentThread extends Thread{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String args[]){
        DemoCurrentThread t1=new DemoCurrentThread();
        DemoCurrentThread t2=new DemoCurrentThread();
        DemoCurrentThread t3=new DemoCurrentThread();
        t1.start();
        t2.start();
        t3.start();
        
        
    }
}
