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
public class Ex9 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
         System.out.println("Please enter your number: " + num);
        for (int a = 1; a <= num; a++){
            System.out.print("|");
            if(a%5 == 0){
                System.out.println("");
            }
        }
           
     }
}

