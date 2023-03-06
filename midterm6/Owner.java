
package midterm6;

/**
 *
 * @author sudthirak
 */
public class Owner {
    protected final String name;
    protected Animal animal;
    
    public Owner(){
        this("", null);
    }
    
    public Owner(String name){
        this.name = name;
    }
    
    public Owner(Animal animal){
        this("", animal);
    }
    
    public Owner(String name, Animal animal){
        this.name = name;
        this.animal = animal;
    }
    
    //setter
    public void setAnimal(Animal animal){
        this.animal = animal;
    }
    
    //getter
    public String getName(){
        return name;
    }
    
    public Animal getAnimal(){
        return animal;
    }
    
    public void feedFood(Food f){
        animal.eat(f);
    }
    
    public void  protectOwnerFrom(Animal a){
        if(animal instanceof Dog){
           ((Dog)animal).kick(a);
        }
        else{
            ((Pigeous)animal).wingAttack(a);
        }
    }
 
    @Override
    public String toString(){
        return ("Owner : name = " + this.name + ", " + animal.toString());
    }
}
