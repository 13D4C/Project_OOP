/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author airew
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author airew
 */import java.awt.*;
import javax.swing.*;

import java.awt.Color;
import java.sql.ResultSet;
import java.util.Calendar;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ProfileMDI {
    private JFrame fr;
    private JDesktopPane j;
    private JInternalFrame app1, app2;
    private JMenuBar b;
    private JMenu m1;
    private JMenuItem i1, i2;
    private JPanel p1, p2;
    private JTextArea ta1, ta2;
    int i;
    
    public ProfileMDI () {
        fr = new JFrame("SubMenuItem Demo");
        j = new JDesktopPane();
        app1 = new JInternalFrame("UserInfo", true, true, true, true);
        app2 = new JInternalFrame("ProjectInfo", true, true, true, true);
        
        p1 = new JPanel();
        p2 = new JPanel();

        ta1 = new JTextArea();
        ta2 = new JTextArea();
        
        p1.add(ta1);
        app1.add(p1);
        
        p2.add(ta2);
        app2.add(p2);

        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        i = 0;
        
        try {
            DBConnect db = new DBConnect();
            ResultSet rs = null;
            ResultSet rs2 = null;
            ResultSet rs3 = null;
            
            rs = db.getLogin(UserDatabase.key);
            rs2 = db.getProfit(UserDatabase.key, currentYear);
            rs3 = db.getProject(UserDatabase.key);
            
            if (rs.next() & rs2.next()) {
                String name = rs.getString("Username");
                String pass = rs.getString("Password");
                String role = rs.getString("Role");
                String income = rs2.getString("income");
                
                ta1.setText("Username: " + name + "\n"+ "Password: " + pass + "\n" + "Role: " + role + "\n" + "Income: " + income);
            }
            ta2.setText("Project list: " + "\n");
            while (rs3.next()) {
                String name = rs3.getString("ProjectName");
                i += 1;
                
                ta2.setText(ta2.getText() + String.valueOf(i) + ": " + name + "\n");
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        
        ta1.setFont(ta1.getFont().deriveFont(12f));
        ta2.setFont(ta2.getFont().deriveFont(12f));

        ta1.setEditable(false);
        ta2.setEditable(false);
        b = new JMenuBar();
        m1 = new JMenu("File");
        
        i1 = new JMenuItem("Open");
        i2 = new JMenuItem("Save");
        
        j.setBackground(Color.BLACK);
        app1.setBounds(10, 50, 400, 400);
        app1.setVisible(true);
        int x1 = app1.getX();
        int y1 = app1.getY();
        x1 += app1.getWidth(); x1 += 50;
        app2.setBounds(x1, y1, 400, 400);
        app2.setVisible(true);

        
        fr.setJMenuBar(b);
        b.add(m1);
        m1.add(i1);
        m1.add(i2);
        j.add(app1);
        j.add(app2);
        fr.add(j);
        
        fr.pack();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(380, 150, 900, 550);
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        new ProfileMDI();
    }
}

