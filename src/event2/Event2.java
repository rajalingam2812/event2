package event2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class abc extends JFrame implements ActionListener
{
    JTextField tf1=new JTextField();
    JTextField tf2=new JTextField();
    JTextField tf3=new JTextField();
    abc()
    {
     getContentPane().setBackground(Color.pink); 
     JLabel l1=new JLabel("number 1:");
     l1.setBounds(100,100,100,30);
     add(l1);
     tf1.setBounds(350,100,100,30);
     add(tf1);
     JLabel l2=new JLabel("number 2:");
     l2.setBounds(100,200,100,30);
     add(l2);
     tf2.setBounds(350,200,100,30);
     add(tf2);
     JLabel l3=new JLabel("Result:");
     l3.setBounds(100,300,100,30);
     add(l3);
     tf3.setBounds(350,300,100,30);
     add(tf3);
     JButton b1=new JButton("ADD");
     b1.setBounds(100,450,80,30);
     JButton b2=new JButton("SUB");
     b2.setBounds(200,450,80,30);
     JButton b3=new JButton("MULTI");
     b3.setBounds(300,450,80,30);
     JButton b4=new JButton("DIV");
     b4.setBounds(400,450,80,30);
     b1.addActionListener(this);
       b2.addActionListener(this);
         b3.addActionListener(this);
         b4.addActionListener(this);
         add(b1);
         add(b2);
         add(b3);
         add(b4); 
setSize(600,400);
setLayout(null);
setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand()=="ADD")
        {
            int x=Integer.parseInt(tf1.getText());
            int y=Integer.parseInt(tf2.getText());
            int z=x+y;
            tf3.setText(String.valueOf(z));
            getContentPane().setBackground(Color.red);
        }
         if(e.getActionCommand()=="SUB")
        {
       int x=Integer.parseInt(tf1.getText());
            int y=Integer.parseInt(tf2.getText());
            int z=x-y;
            tf3.setText(String.valueOf(z));
            getContentPane().setBackground(Color.green);
        }
        if(e.getActionCommand()=="MULTI")
        {
             int x=Integer.parseInt(tf1.getText());
            int y=Integer.parseInt(tf2.getText());
            int z=x*y;
            tf3.setText(String.valueOf(z));
            getContentPane().setBackground(Color.blue);
        }
        if(e.getActionCommand()=="DIV")
        {
             int x=Integer.parseInt(tf1.getText());
            int y=Integer.parseInt(tf2.getText());
            int z=x/y;
            tf3.setText(String.valueOf(z));
            getContentPane().setBackground(Color.orange);
        }
    }
}
public class Event2
{
    public static void main(String[] args)
    {
        abc ob=new abc();
    }
    
}
