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
public class p15 {
    p15()
    {
        System.out.println("Parent class");
    }
}
class child extends p15{
    child()
    {
        System.out.println("Child class");
    }
    public static void main(String args[])
    {
        child obj=new child();
    }
}
