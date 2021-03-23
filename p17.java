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
public class p17 {
    public static void main(String args[]){
	Cat obj = new Cat();
	obj.sound();
   }
}
abstract class Animal{
   public abstract void sound();
}
class Cat extends Animal{
   public void sound(){
	System.out.println("Meow");
   }
}
