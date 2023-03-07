
package midterm7;

/**
 *
 * @author sudthirak
 */
public abstract class Houses {
    private String name;
    private String color;
    
    //con
    public Houses(){
        this("", "");
    }
    
    public Houses(String name, String color){
        this.name = name;
        this.color = color;
    }
    
    //methods
    public void setName(String name){
        this.name = name;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String getName(){
        return name;
    }
    
    public String getColor(){
        return color;
    }
    
    @Override
    public String toString(){
        return ("[House] : " + this.name + " , Color : " + this.color);
    }
}
