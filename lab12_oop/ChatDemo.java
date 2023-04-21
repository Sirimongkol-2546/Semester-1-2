import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author sudthirak
 */
public class ChatDemo implements ActionListener, WindowListener{
    private JFrame fr;
    private JTextArea area;
    private JTextField blank;
    private JPanel panel;
    private JButton submit, reset;
    
    public ChatDemo(){
        fr = new JFrame("Chat Demo");
        fr.setLayout(new BorderLayout());
   
        area = new JTextArea(20, 45);
        area.setEditable(false);
        fr.add(area);
        
        blank = new JTextField(45);
        fr.add(blank);
        
        panel = new JPanel();
        submit = new JButton("Submit");
        reset = new JButton("Reset");
        panel.add(submit);
        panel.add(reset);
        fr.add(panel);
        
        fr.add(area, BorderLayout.NORTH);
        fr.add(blank, BorderLayout.CENTER);
        fr.add(panel, BorderLayout.SOUTH);
        
        submit.addActionListener(this);
        reset.addActionListener(this);
        fr.addWindowListener(this);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true); 
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource().equals(submit)){
           DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
           if (area.getText().equals("")){
               area.setText(dtf.format(LocalDateTime.now()) + ": " + blank.getText());
               blank.setText("");
           }
           else{
               area.setText(area.getText()+ "\n" + dtf.format(LocalDateTime.now()) + ": " + blank.getText());
               blank.setText("");
           }
        }
        
        else if (e.getSource().equals(reset)){
            area.setText("");
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        String txt = "";
        File f = new File("ChatDemo.dat");
        if(f.exists() == false){
            try {
                f.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(ChatDemo.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
 
        try(FileReader fr = new FileReader("ChatDemo.dat");){ 
            int ch;
            ch = fr.read();
            while (ch != -1){
                System.out.println((char)ch);
                txt += (char)ch;
                ch = fr.read();
            }
            area.setText(txt);
        }
        catch(IOException ex){
            ex.printStackTrace();          
        }
    }
            
    @Override
    public void windowClosing(WindowEvent e) {
        try(FileWriter fw = new FileWriter("ChatDemo.dat");){
            fw.write(area.getText());
        
        }
        catch(IOException io){
            System.out.println(io);
            
        }
    }
        
    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}

    
}