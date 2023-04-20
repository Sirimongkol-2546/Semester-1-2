package lab09_oop;
import java.lang.Math;
/**
 *
 * @author sudthirak
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
        double a, b, c;
        a = Double.parseDouble(args[0]);
        b = Double.parseDouble(args[1]);
        c = Double.parseDouble(args[2]);
        
        double root = Math.sqrt(Math.pow(b, 2) - (4*a*c));
        double x1 = (-b + root) / (2*a);
        double x2 = (-b - root) / (2*a);
        
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
            
        } 
        
        catch(NumberFormatException ex){
            System.out.println("Please input data in nember format only.");
            
        } 
        
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Please enter 3 number as a, b, and c respectively.");
        }
    }
}
