/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5;

/**
 *
 * @author LAB203_68
 */
import java.util.*;
public class Ex8 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        
        System.out.println("Plese insert a number: " + num);
        
        for (int a = 1; a <= num; a++){
            if (a%5 == 0){System.out.print("/");}
            else {System.out.print("|");}
        }
    }
}
