/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BISHNU ADHIKARI
 */
import javax.swing.*;
import java.awt.*;
public class RadioButt {
    JFrame f;
    JRadioButton b1, b2;
    JLabel l1;
    
    public RadioButt() {
        f = new JFrame("radio button example");
        l1 = new JLabel("programming language");
        b1 = new JRadioButton("java");
        b2 = new JRadioButton("php");
        ButtonGroup bg = new ButtonGroup();
        bg.add(b1); bg.add(b2);
        f.add(l1); f.add(b1); f.add(b2);
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        new RadioButt();
    }
}
