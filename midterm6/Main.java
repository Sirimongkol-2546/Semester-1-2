/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm6;

/**
 *
 * @author sudthirak
 */
public class Main {
    public static void main(String[] args) {
        Pigeous p1 = new Pigeous("Alex",8);
 Pigeous p2 = new Pigeous("John",6);
 System.out.println(p1);
 System.out.println(p2);
 p2.wingAttack(p1, 5);
 System.out.println(p1.toString());
 System.out.println(p2.toString());
 p1.fly();
    }
}
