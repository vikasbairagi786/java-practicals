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
public class p19 {
    final String name;
    p19(String n)
    {
       name=n;
    }
    void display()
    {
        System.out.println("Name is: "+name);
    }
    public static void main(String args[])
    {
        p19 obj = new p19("asdf");
        obj.display();
    }
}
