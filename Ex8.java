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