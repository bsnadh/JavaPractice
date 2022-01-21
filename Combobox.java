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
import java.awt.event.*;
public class Combobox {
    
    JFrame f;
    JLabel l;
    JComboBox cb;
    JButton b;
    Combobox() {
        f = new JFrame("combobox example");
        l = new JLabel("country");
        String country[] = {"Nepal","India","Pakistan","Taiwan"};
        cb = new JComboBox(country);
        b = new JButton("Select");
        f.add(l); f.add(cb); f.add(b);
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                JOptionPane.showMessageDialog(f, " You selected "+cb.getItemAt(cb.getSelectedIndex()));
            }
        });
    }
    public static void main(String[] args) {
        new Combobox();
    }
}

