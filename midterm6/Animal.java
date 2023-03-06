package midterm6;

/**
 *
 * @author sudthirak
 */
public abstract class Animal {
    private String name;
    private int power;
    private int age;
    
    //constructor
    public Animal(){
        this("", 0, 0);
    }
    
    public Animal(String name, int power, int age){
        this.name = name;
        this.power = power;
        this.age = age;
    }
    
    //setter
    public void setName(String name){
        this.name = name;
    }
    
    public void setPower(int power){
        this.power = power;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    //getter
    
    public String getName(){
        return name;
    }
    
    public int getPower(){
        return power;
    }
    
    public int getAge(){
        return age;
    }
    
    public boolean equals(Animal a){
        return this.name.equals(a.name) && this.age == a.age;
    }
    
    @Override
    public String toString(){
        return ("Animal : name = " + name + ", power = " + power + ", age = " + age);
    }
    
    public abstract void eat(Food f);
}
