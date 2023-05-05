package lab13;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author sudthirak
 */
public class MyFrame3{
    private JFrame fr;
    private MyClock2 clock;
    private Thread t;
    private boolean status;
    
    
    public MyFrame3(){
        fr = new JFrame();
        clock = new MyClock2();
        t = new Thread(clock);
        
              
        fr.add(clock);
             
        fr.setSize(500, 300);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}