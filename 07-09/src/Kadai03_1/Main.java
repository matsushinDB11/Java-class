package Kadai03_1;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Main {

    private JFrame mainFrame;
    private Container contentPane;
    private JButton Button_a;
    private JButton Button_b;
    private JButton Button_c;
    private JPanel buttonPane1;

    private Main(){
        mainFrame = new JFrame("課題3");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(320, 160);
        mainFrame.setLocationRelativeTo(null);

        contentPane = mainFrame.getContentPane();

        Button_a = new JButton("ボタンA");
        Button_b = new JButton("ボタンB");
        Button_c = new JButton("ボタンC");

        // 複数のボタンを配置するためのパネル(buttonPane)を作成
        buttonPane1 = new JPanel();
        buttonPane1.add(Button_a);
        buttonPane1.add(Button_b);
        buttonPane1.add(Button_c);

        contentPane.add(buttonPane1, BorderLayout.CENTER);

        mainFrame.setVisible(true);
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        // コンストラクタを呼び出すのみ
        new Main();
    }

}
