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
 */
import java.awt.*;
import javax.swing.*;

import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ProfileMDI {
    private JFrame fr;
    private JDesktopPane j;
    private JInternalFrame app1;
    private JMenuBar b;
    private JMenu m1;
    private JMenuItem i1, i2;
    public ProfileMDI () {
        fr = new JFrame("SubMenuItem Demo");
        j = new JDesktopPane();
        app1 = new JInternalFrame("Application 01", true, true, true, true);

        
        b = new JMenuBar();
        m1 = new JMenu("File");
        
        i1 = new JMenuItem("Open");
        i2 = new JMenuItem("Save");
        
        j.setBackground(Color.BLACK);
        app1.setBounds(200, 50, 400, 400);
        app1.setVisible(true);

        
        fr.setJMenuBar(b);
        b.add(m1);
        m1.add(i1);
        m1.add(i2);
        j.add(app1);
        fr.add(j);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(380, 150, 800, 500);
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        new ProfileMDI();
    }
}


