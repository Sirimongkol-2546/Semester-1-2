import java.util.*;
public class Lab3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int even, odd;
        even = 0;
        odd = 0;
        while (true){
            int num = input.nextInt();
            if(num < 0) break;
            if(num%2 == 0){even += 1;} 
            else{odd += 1;}
        }
        System.out.println("Odd number = " + odd + " and Even number = " + even);
        input.close(); //อย่าลืมมาลบตรงนี้
    }
}