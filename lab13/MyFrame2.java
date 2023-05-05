package lab13;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author sudthirak
 */
public class MyFrame2 implements MouseListener{
    private JFrame fr;
    private MyClock2 clock;
    private Thread t;
    private boolean status;
    
    
    public MyFrame2(){
        fr = new JFrame();
        clock = new MyClock2();
        t = new Thread(clock);
        
              
        fr.add(clock);
        fr.addMouseListener(this);
             
        fr.setSize(500, 300);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.start();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(status == false){
            status = true;
            clock.stopTime();
//            System.out.println(status);
            
        }
        else if(status == true){
            status = false;
            clock.resumeTime();
//            System.out.println(status);
        }
   
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    
    
}
