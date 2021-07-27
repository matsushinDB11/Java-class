package Kadai03;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Main extends Frame{

    private JFrame mainFrame;
    private Container contentPane;
    private JButton Button_a;
    private JButton Button_b;
    private JButton Button_c;
    private JPanel buttonPane1;

    public static void main(String[] args) {
        new Main();
    }
    private Main(){
        mainFrame = new JFrame("課題3");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(320, 160);
        mainFrame.setLocationRelativeTo(null);

        contentPane = mainFrame.getContentPane();

        Button_a = new JButton("ボタンA");
        Button_b = new JButton("ボタンB");
        Button_c = new JButton("ボタンC");

        Button_a.addActionListener(new ViewImage("src/Kadai03/img/image_a.jpg"));
        Button_b.addActionListener(new ViewImage("src/Kadai03/img/image_b.jpg"));
        Button_c.addActionListener(new ViewImage("src/Kadai03/img/image_a.jpg"));

        // 複数のボタンを配置するためのパネル(buttonPane)を作成
        buttonPane1 = new JPanel();
        buttonPane1.add(Button_a);
        buttonPane1.add(Button_b);
        buttonPane1.add(Button_c);

        contentPane.add(buttonPane1, BorderLayout.CENTER);

        mainFrame.setVisible(true);
    }

    class SampleWindowListener extends WindowAdapter{
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }

}

