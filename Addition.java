package exam.src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Addition {
    JFrame f;
    JLabel rl,nl,al;
    JTextField tr,tn,ta;
    JButton btn;

    public Addition() {
        f = new JFrame("insert demo");
        rl = new JLabel("first num");
        nl = new JLabel("second num");
        tr = new JTextField();
        tn = new JTextField();
        ta = new JTextField();
        ta.addKeyListener(new keyChecker());
        btn = new JButton("submit");
        f.add(rl);
        f.add(tr);
        f.add(nl);
        f.add(tn);
        f.add(al);
        f.add(ta);
        f.add(btn);
        f.setSize(500,500);
        f.setLayout(new GridLayout(3,2));
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }}
    class keyChecker extends KeyAdapter{
        public void keyPressed(KeyEvent e) {
            int num1 = Integer.parseInt(tr.getText());
            int num2 = Integer.parseInt(tn.getText());
            int sum = num1+num2;
            JOptionPane.showMessageDialog(f, "ths sum is  "+sum);
            ta.setText(null);
        }
        public static void main(String[] args) {
            new Addition();
        }
    }
