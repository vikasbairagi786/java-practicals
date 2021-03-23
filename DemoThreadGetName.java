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
public class DemoThreadGetName extends Thread{
    public static void main(String args[]){
        DemoThreadGetName t1 = new DemoThreadGetName();
        DemoThreadGetName t2 = new DemoThreadGetName();
        DemoThreadGetName t3 = new DemoThreadGetName();
        System.out.println("Thread -1:"+t1.getName());
        System.out.println("Thread -2:"+t2.getName());
        System.out.println("Thread -3:"+t3.getName());
        t1.start();
        t2.start();
        t2.setName("Ankit");
        System.out.println("Thread -2:"+t2.getName());
        t3.start();
        System.out.println("Thread -3 ID:"+t3.getId());
    }
}