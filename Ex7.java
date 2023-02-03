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
public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int even, odd;
        even = 0;
        odd = 0;
        while (true){
            int num = input.nextInt();
            if(num == -1) break;
            if(num%2 == 0){even += 1;} 
            else{odd += 1;}
        }
        System.out.println("Odd number = " + odd + " and Even number = " + even);
   
    }
}
