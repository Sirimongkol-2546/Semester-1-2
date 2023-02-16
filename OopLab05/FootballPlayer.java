package OopLab05;
public class FootballPlayer extends Player{
    private int playerNumber;
    private String position;
    
    public void setPlayerNumber(int n){
        playerNumber = n;
    }
    
    public void setPosition(String p){
        position = p;
    }
    
    public int getPlayerNumber(){
        return playerNumber;
    }
    
    public String getPosition(){
        return position;
    }
    
    public boolean isSamePosition(FootballPlayer p){
        return this.position.equals(p.getPosition()) && this.getTeam().equals(p.getTeam());
        
    }
}
