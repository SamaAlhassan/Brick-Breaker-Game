package com.mycompany.java_project;

import javax.swing.*;

public class Java_Project {

    public static final int WIDTH = 700, HEIGHT = 650;
    
    public static void main(String[] args) {
        
        
        JFrame frame = new JFrame("Brick Breaker");
        GamePlay game = new GamePlay();

        frame.setSize(WIDTH, HEIGHT);
        
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(game);
        
    } // end main
} // end class Java_Project
