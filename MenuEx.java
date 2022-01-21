



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BISHNU ADHIKARI
 */
import javax.swing.*;
public class MenuEx {
    JMenu menu,submenu;
    JMenuItem i1,i2,i3,i4,i5;
    
    MenuEx() {
        JFrame f = new JFrame("Menu and submenu example");
        JMenuBar mb = new JMenuBar();
        menu = new JMenu("items");
        submenu = new JMenu("subitems");
        i1 = new JMenuItem("item one");
        i2 = new JMenuItem("item two");
        i3 = new JMenuItem("item three");
        i4 = new JMenuItem("subitem one");
        i5 = new JMenuItem("subitem two");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        menu.add(submenu);
        mb.add(menu);
        f.setJMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public static void main(String[] args) {
        new MenuEx();
    }
}
