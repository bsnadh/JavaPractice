package exam.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class App {
    JFrame f;
    JLabel rl,nl,al;
    JTextField tr,tn,ta;
    JButton btn;

    public App() {
        f = new JFrame("insert demo");
        rl = new JLabel("roll");
        nl = new JLabel("name");
        al = new JLabel("address");
        tr = new JTextField("15");
        tn = new JTextField("15");
        ta = new JTextField("15");
        btn = new JButton("submit");
        f.add(rl);
        f.add(tr);
        f.add(nl);
        f.add(tn);
        f.add(al);
        f.add(ta);
        f.add(btn);
        f.setSize(500,500);
        //f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int roll = Integer.parseInt(tr.getText());
                String name = tn.getText();
                String address = ta.getText();
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javaforexam", "root","");
                    Statement stmt = con.createStatement();
                    String sql = "Insert into info values('"+name+"','"+roll+"','"+address+"')";
                    int row = stmt.executeUpdate(sql);
                    if(row>0)
                        JOptionPane.showMessageDialog(f, "successfully inserted.");
                    else
                        JOptionPane.showMessageDialog(f, "Some error occured!");
                    con.close();
                    tr.setText("");
                    tn.setText("");
                    ta.setText("");
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
    public static void main(String[] args) throws Exception {
        new App();
    }
}
