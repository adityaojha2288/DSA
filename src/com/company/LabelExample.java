package com.company;
import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LabelExample extends Frame implements ActionListener{
    JTextField tf; JLabel l; JButton b;
    LabelExample(){
        tf=new JTextField();
        tf.setBounds(50,50, 150,20);
        l=new JLabel();
        l.setBounds(50,100, 250,20);
        b=new JButton("Find IP");
        b.setBounds(50,150,95,30);
        b.addActionListener(this);
        add(b);add(tf);add(l);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        try{
            String host=tf.getText();
            String ip=java.net.InetAddress.getByName(host).getHostAddress();
            l.setText("IP of "+host+" is: "+ip);
        }catch(Exception ex){System.out.println(ex);}
    }
    public static void main(String[] args) {
        new LabelExample();
    } }
//  public class FirstSwingExample {
    //    public static void main(String[] args) {
//            JFrame f=new JFrame();//creating instance of JFrame
//
//            JButton b=new JButton("click");//creating instance of JButton
//            b.setBounds(130,100,100, 40);//x axis, y axis, width, height
//
//            f.add(b);//adding button in JFrame
//
//            f.setSize(400,500);//400 width and 500 height
//            f.setLayout(null);//using no layout managers
//            f.setVisible(true);//making the frame visible

            // Jlabel Example
//            JFrame f= new JFrame("Label Example");
//            JLabel l1,l2;
//            l1=new JLabel("First Label.");
//            l1.setBounds(50,50, 100,30);
//            l2=new JLabel("Second Label.");
//            l2.setBounds(50,100, 100,30);
//            f.add(l1); f.add(l2);
//            f.setSize(300,300);
//            f.setLayout(null);
//            f.setVisible(true);
//        }
//    }

