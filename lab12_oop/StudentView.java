import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class StudentView implements ActionListener, WindowListener{
    private JFrame fr;
    private JPanel panel1, panel2;
    private JLabel id, name, money;
    private JTextField text_ID, text_Name, text_Money;
    private JButton deposit, withdraw;
    private Student s;
    
    public StudentView(){
        fr = new JFrame("Student View");
        fr.setLayout(new GridLayout(4, 2));
        
        panel1 = new JPanel();
        panel2 = new JPanel();
        
        id = new JLabel("ID:");
        name = new JLabel("Name:");
        money = new JLabel("Money:");
        
        text_ID = new JTextField();
        text_Name = new JTextField();
        text_Money = new JTextField("0");
        text_Money.setEditable(false);
        
        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        
        panel1.add(deposit);
        panel2.add(withdraw);
        
        fr.add(id);
        fr.add(text_ID);
        fr.add(name);
        fr.add(text_Name);
        fr.add(money);
        fr.add(text_Money);
        fr.add(panel1);
        fr.add(panel2);
        
        deposit.addActionListener(this);
        withdraw.addActionListener(this);
        fr.addWindowListener(this);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
        
    }
    
//    FileOutputStream fw = new FileOutputStream("ChatDemo.dat");
//            ObjectOutputStream oout = new  ObjectOutputStream(fw);
//            oout.writeObject();

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    @Override
    public void windowOpened(WindowEvent e) {
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try(FileOutputStream fw = new FileOutputStream("ChatDemo.dat");
            ObjectOutputStream oout = new  ObjectOutputStream(fw);){
         
            FileOutputStream fw = new FileOutputStream("ChatDemo.dat");
            ObjectOutputStream oout = new  ObjectOutputStream(fw);
            oout.writeObject(s);
            System.out.println("");
        }
        catch(){
            
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
    
    
    
}