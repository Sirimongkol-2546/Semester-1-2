package lab13;
import java.awt.*;
import java.util.Calendar;
import javax.swing.*;
/**
 *
 * @author sudthirak
 */
public class MyClock3 extends JLabel implements Runnable{  
    private int sec, min, hour;
    private boolean status;
    
    public synchronized void stopTime(){
        status = true;
        
    }
    
    public synchronized void resumeTime(){
        status = false;
        this.notify();
    }
    
    public synchronized void checkStop() throws InterruptedException{
        while(status){
            this.wait();
        }
    }
    
    @Override
    public void run(){
        while(true){
            Calendar d = Calendar.getInstance();
            int sec = d.get(Calendar.SECOND);
            int min = d.get(Calendar.MINUTE);
            int hour = d.get(Calendar.HOUR_OF_DAY);
                    
            
            //System.out.println(status);

            setFont(new Font("Arial", Font.BOLD, 50));
            setText("           " + String.format("%02d:%02d:%02d", hour, min, sec));
            
            
            try{
                Thread.sleep(1000);
                checkStop();
            }
            catch(InterruptedException ex){
                ex.printStackTrace();
                
            }
            
        }
        
    }
    

    
}