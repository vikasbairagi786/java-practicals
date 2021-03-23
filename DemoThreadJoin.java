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
public class DemoThreadJoin extends Thread{
     public void run(){
        for(int i=1;i<=10;i++)
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
        DemoThreadJoin t1=new DemoThreadJoin();
        DemoThreadJoin t2=new DemoThreadJoin();
        DemoThreadJoin t3=new DemoThreadJoin();
        DemoThreadJoin t4=new DemoThreadJoin();
        DemoThreadJoin t5=new DemoThreadJoin();
        t1.start();
        t2.start();
        try
        {
            t2.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        t3.start();
        t4.start();
        t5.start();
    }
}
