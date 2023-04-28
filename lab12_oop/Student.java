package lab12;
import java.io.*;
/**
 *
 * @author LAB203_44
 */
public class Student implements Serializable{
    private String name;
    private int ID;
    private int money;
    
    public Student(){
        this("", 0, 0);
    }
    
    public Student(String name, int ID, int money){
        this.name = name;
        this.ID = ID;
        this.money = money;
    }
    
    //setter getter
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setID(int ID){
        this.ID = ID;
    }
    
    public int getID(){
        return ID;
    }
    
    public void setMoney(int money){
        this.money = money;
    }
    
    public int getMoney(){
        return money;
    }
    
}
