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
public class DemoThreadPriority extends Thread{
    public void run(){
        System.out.println("Thread priority:"+Thread.currentThread().getPriority());
    }
    public static void main(String args[]){
        DemoThreadPriority t1 = new DemoThreadPriority();
        DemoThreadPriority t2 = new DemoThreadPriority();
        t2.setPriority(MAX_PRIORITY);
        t1.setPriority(MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}
