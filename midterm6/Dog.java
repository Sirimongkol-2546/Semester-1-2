/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm6;

/**
 *
 * @author sudthirak
 */
public class Dog extends Animal{
    
    public Dog(String name, int age){
        super(name, 200, age);
    }
    
    public void kick(Animal a){
       setPower(a.getPower() - 5);
    }
    
    @Override
    public void eat(Food f){
        setPower(getPower() + (f.getPower() * 1));
    }
    
    
}
