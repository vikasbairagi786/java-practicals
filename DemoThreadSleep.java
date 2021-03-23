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
public class DemoThreadSleep extends Thread{
    public void run(){
        for(int i=1;i<=100;i++)
        {
            try
            {
                Thread.sleep(500);
            }
            catch(Exception eh)
            {
                System.out.println(eh);
            }
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String args[])
    {
        DemoThreadSleep t1=new DemoThreadSleep();
        DemoThreadSleep t2=new DemoThreadSleep();
        DemoThreadSleep t3=new DemoThreadSleep();
        DemoThreadSleep t4=new DemoThreadSleep();
        DemoThreadSleep t5=new DemoThreadSleep();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
