package kadai11_03;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Kadai11_03 {

    private JFrame mainFrame;
    private Container contentPane;
    private JButton Button1;
    private JButton Button2;
    private JButton Button3;
    private JButton Button4;
    private JButton Button5;
    private JButton Button6;
    private JButton Button7;
    private JButton Button8;
    private JButton Button9;
    private JPanel buttonPane1;
    private JPanel buttonPane2;
    private JPanel buttonPane3;
	
	private Kadai11_03(){
        mainFrame = new JFrame("サンプル");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(320, 160);
        mainFrame.setLocationRelativeTo(null);

        contentPane = mainFrame.getContentPane();
        
        Button1 = new JButton("ボタン１");
        Button2 = new JButton("ボタン2");
        Button3 = new JButton("ボタン3");
        Button4 = new JButton("ボタン4");
        Button5 = new JButton("ボタン5");
        Button6 = new JButton("ボタン6");
        Button7 = new JButton("ボタン7");
        Button8 = new JButton("ボタン8");
        Button9 = new JButton("ボタン9");
        
        // 複数のボタンを配置するためのパネル(buttonPane)を作成
        buttonPane1 = new JPanel();
        buttonPane2 = new JPanel();
        buttonPane3 = new JPanel();
        buttonPane1.add(Button1);
        buttonPane1.add(Button2);
        buttonPane1.add(Button3);
        buttonPane2.add(Button4);
        buttonPane2.add(Button5);
        buttonPane2.add(Button6);
        buttonPane3.add(Button7);
        buttonPane3.add(Button8);
        buttonPane3.add(Button9);

        contentPane.add(buttonPane1, BorderLayout.NORTH);
        contentPane.add(buttonPane2, BorderLayout.CENTER);
        contentPane.add(buttonPane3, BorderLayout.SOUTH);

        mainFrame.setVisible(true); 
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// コンストラクタを呼び出すのみ
        new Kadai11_03();
	}

}
