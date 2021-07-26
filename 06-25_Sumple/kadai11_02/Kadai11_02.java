package kadai11_02;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.AbstractAction;

public class Kadai11_02 {

    private JFrame mainFrame;
    private Container contentPane;
    private JButton button;
    private JTextField textField;
    private JTextArea textArea;
    private JScrollPane scrollPane;

	public Kadai11_02() {
		mainFrame = new JFrame("Kadai12_02");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(320,160);
		mainFrame.setLocationRelativeTo(null);

		contentPane = mainFrame.getContentPane();

		button = new JButton("追加");
        textField = new JTextField();
        textArea = new JTextArea();

        scrollPane = new JScrollPane(textArea);

		button.addActionListener(new AbstractAction() {
			public void actionPerformed(ActionEvent arg){
				textArea.append(textField.getText() + "\n");
			}
		});

        contentPane.add(textField, BorderLayout.NORTH);
        contentPane.add(scrollPane, BorderLayout.CENTER);
        contentPane.add(button, BorderLayout.SOUTH);

		mainFrame.setVisible(true);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Kadai11_02();
	}

}
