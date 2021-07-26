package kadai12_04;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Kadai12_04 implements ActionListener{
	private JFrame mainFrame;
	private Container contentPane;
//	private JLabel label;
	private JPanel buttonPane;
	private PaintPanel paintPanel;
	private JButton clearButton;
	private JButton cbutton0;
	private JButton cbutton1;
	private JButton cbutton2;
	
	
	public Kadai12_04() {
		// JFrameクラスのインスタンスを生成  
        mainFrame = new JFrame("Kadai12_4 サンプル");
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
        
        clearButton = new JButton("Clear!");
        clearButton.addActionListener(this);
        cbutton0 = new JButton("黒");
        cbutton1 = new JButton("赤");
        cbutton2 = new JButton("青");
        cbutton0.addActionListener(this);
        cbutton1.addActionListener(this);
        cbutton2.addActionListener(this);
        
        buttonPane = new JPanel();
        buttonPane.add(clearButton);
        buttonPane.add(cbutton0);
        buttonPane.add(cbutton1);
        buttonPane.add(cbutton2);
        
        contentPane.add(paintPanel, BorderLayout.CENTER);
//      contentPane.add(label, BorderLayout.CENTER);
//      contentPane.add(button, BorderLayout.SOUTH);
        contentPane.add(buttonPane, BorderLayout.SOUTH);
        
        mainFrame.setVisible(true);
	}
	
	public static void main(String[] args) {
        // ウィンドウを表示
        new Kadai12_04();
	}
	
	public void actionPerformed(ActionEvent event){
		
		int flag;
		if(event.getSource() == clearButton)
		{
			paintPanel.clearComponent();
		}
		else if(event.getSource() == cbutton0){
			flag=0;
			paintPanel.setColor(flag);
		}
		else if(event.getSource() == cbutton1){
			paintPanel.setColor(1);
		}
		else if(event.getSource() == cbutton2){
			paintPanel.setColor(2);
		}
		
	}	
}
