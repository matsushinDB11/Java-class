import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// �A�N�V�����C�x���g�ƁC�A�N�V�������X�i�[�̃C���|�[�g
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


// �A�N�V�������X�i�[�̓C���^�t�F�[�X�Ȃ̂ŕK��implements����
// actionPerformed���\�b�h���`���邱��
// �y�ۑ�z
// �@�ȉ���ActionListener�C���^�t�F�[�X����������
public class Kadai11_05 {

        private JFrame mainFrame;
        private Container contentPane;
        private JTextField textField;
        private JTextArea textArea;
        private JScrollPane scrollPane;
        private JPanel buttonPane;
        private JButton addButton;
        private JButton clearButton;

        // �R���X�g���N�^
        // �R���X�g���N�^�ŁCGUI�R���|�[�l���g�̔z�u��ݒ���s�����@������
        public Kadai11_05(){ 
                mainFrame = new JFrame("�T���v��");
                mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mainFrame.setSize(320, 200);
                mainFrame.setLocationRelativeTo(null);

                contentPane = mainFrame.getContentPane();

                textField = new JTextField();
                textArea = new JTextArea();

                scrollPane = new JScrollPane(textArea);

                addButton = new JButton("�ǉ�");
                clearButton = new JButton("����");

                // �u�ǉ��v�{�^���ƃA�N�V�����E���X�i�[�̊֘A�t��
                addButton.addActionListener(this);

                // �y�ۑ�z
                // �@�ȉ��Ɂu�����v�{�^���ƃA�N�V�����E���X�i�[�̊֘A�t����ǉ�


                // �����̃{�^����z�u���邽�߂̃p�l��(buttonPane)���쐬
                buttonPane = new JPanel();
                buttonPane.add(addButton);
                buttonPane.add(clearButton);

                contentPane.add(textField, BorderLayout.NORTH);
                contentPane.add(scrollPane, BorderLayout.CENTER);
                contentPane.add(buttonPane, BorderLayout.SOUTH);

                mainFrame.setVisible(true); 
        }


        // ���p�҂̑���ɉ���������������
        // �K����`����K�v������
        public void actionPerformed(ActionEvent event){

                // ���[�U�̑���Ώۂ𔻒f
                // event.getSource()�ɂĂǂ̃{�^����
                // �N���b�N�����̂������f�ł���
                // �i�{�^���̃C���X�^���X�����߂�l�ƂȂ�j

                // �u�ǉ��v�{�^�����N���b�N�����Ƃ��̏���
                if(event.getSource() == addButton) {

                        // �e�L�X�g�G���A�֕������ǉ�
                        textArea.append(textField.getText() + "\n");
                }

                // �y�ۑ�z
                // �@�ȉ��Ɂu�����v�{�^�����N���b�N�����Ƃ��C���ׂď������鏈����ǉ�
                // �@�Q�l�F�e�L�X�g�G���A�̕������S����
                //      �@�@�@textArea.setText(null);
        }

        // �A�v���P�[�V�����̋N��
        public static void main(String[] args) {

		// �R���X�g���N�^���Ăяo���̂�
                new Kadai11_05();
        }
} 
