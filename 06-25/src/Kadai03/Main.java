package Kadai03;

import javax.swing.*;
import java.awt.*;

public class Main {
    private JFrame mainFrame;
    private Container contentPane;
    private JPanel buttonPane;
    private JButton Button_a;
    private JButton Button_b;
    private JButton Button_c;
    private JButton Button_d;
    private JButton Button_e;
    private JButton Button_f;
    private JButton Button_g;
    private JButton Button_h;
    private JButton Button_i;
    public Main() {
        mainFrame = new JFrame("Kadai03");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(320, 160);
        mainFrame.setLocationRelativeTo(null);
        contentPane = mainFrame.getContentPane();
        buttonPane = new JPanel();

        Button_a = new JButton("Button_a");
        Button_b = new JButton("Button_b");
        Button_c = new JButton("Button_c");
        Button_d = new JButton("Button_d");
        Button_e = new JButton("Button_e");
        Button_f = new JButton("Button_f");
        Button_g = new JButton("Button_g");
        Button_h = new JButton("Button_h");
        Button_i = new JButton("Button_i");
        buttonPane.add(Button_a);
        buttonPane.add(Button_b);
        buttonPane.add(Button_c);
        buttonPane.add(Button_d);
        buttonPane.add(Button_e);
        buttonPane.add(Button_f);
        buttonPane.add(Button_g);
        buttonPane.add(Button_h);
        buttonPane.add(Button_i);
        contentPane.add(buttonPane, BorderLayout.CENTER);
        mainFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
