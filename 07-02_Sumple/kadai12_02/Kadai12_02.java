package kadai12_02;

import java.awt.BorderLayout;
import java.awt.Container;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Kadai12_02 implements ActionListener {
	
	private JFrame mainFrame;
	private Container contentPane;
//	private JLabel label;
	private JPanel buttonPane;
	private PaintPanel paintPanel;
	private JButton clearButton;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	
	public Kadai12_02() {
		// JFrameクラスのインスタンスを生成  
        mainFrame = new JFrame("Kadai12 サンプル");
        // 閉じるボタン押下時のアプリケーションの振る舞いを決定
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // ウィンドウの初期サイズ（幅、高さ）をピクセル単位で設定
        mainFrame.setSize(700,640);
        // ウィンドウの表示場所を規定
        mainFrame.setLocationRelativeTo(null);        
        // ContentPaneの取得
        contentPane = mainFrame.getContentPane();
        
//      JLabel label = new JLabel(new ImageIcon("D:/Home/ohnittan/My Pictures/EU/DSC02146.jpg"));
//        JLabel label = new JLabel("                Label1");
//        label.setBackground(Color.WHITE);
        paintPanel = new PaintPanel();
        
//      JButton button = new JButton("Clear");
        clearButton = new JButton("Clear!");
        clearButton.addActionListener(this);
        button1 = new JButton("A");
        button1.addActionListener(this);
        button2 = new JButton("B");
        button2.addActionListener(this);
        button3 = new JButton("C");
        button3.addActionListener(this);
        
        
        buttonPane = new JPanel();
        buttonPane.add(clearButton);
        buttonPane.add(button1);
        buttonPane.add(button2);
        buttonPane.add(button3);
        
        
        contentPane.add(paintPanel, BorderLayout.CENTER);
//      contentPane.add(label, BorderLayout.CENTER);
//      contentPane.add(button, BorderLayout.SOUTH);
        contentPane.add(buttonPane, BorderLayout.SOUTH);
        
        mainFrame.setVisible(true);
	}
	
	public static void main(String[] args) {
        // ウィンドウを表示
        new Kadai12_02();
	}
	
	public void actionPerformed(ActionEvent event){
		
		if(event.getSource() == clearButton)
		{
			paintPanel.clearComponent();
		}
		
	}
	
}
