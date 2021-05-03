package com.javalessons.tests;

import javax.swing.*;

public class TestArgs {

    public static void main (String[] args) {
/*        System.out.println ("#/args=" + args.length);
        for (String s:args) {
            System.out.println ("next arg=" + s);
        }
        System.out.println();
        for (String arg : args) {
            System.out.println("int arg=" + Integer.parseInt(arg));
        }*/
        var listener = new Clock();
        var timer = new Timer(1000, listener);
        timer.start();
        JOptionPane.showMessageDialog(null, "Quit");
        System.exit(0);

    }

}