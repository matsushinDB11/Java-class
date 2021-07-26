package kadai11_01;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// アクションイベントと，アクションリスナーのインポート
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


// アクションリスナーはインタフェースなので必ずimplementsして
// actionPerformedメソッドを定義すること
// 【課題】
// 　以下にActionListenerインタフェースを実装する
public class Kadai11_01 implements ActionListener{

        private JFrame mainFrame;
        private Container contentPane;
        private JTextField textField;
        private JTextArea textArea;
        private JScrollPane scrollPane;
        private JPanel buttonPane;
        private JButton addButton;
        private JButton clearButton;

        // コンストラクタ
        // コンストラクタで，GUIコンポーネントの配置や設定を行う方法もある
        public Kadai11_01(){ 
                mainFrame = new JFrame("サンプル");
                mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mainFrame.setSize(320, 200);
                mainFrame.setLocationRelativeTo(null);

                contentPane = mainFrame.getContentPane();

                textField = new JTextField();
                textArea = new JTextArea();

                scrollPane = new JScrollPane(textArea);

                addButton = new JButton("追加");
                clearButton = new JButton("消去");

                // 「追加」ボタンとアクション・リスナーの関連付け
                addButton.addActionListener(this);

                // 【課題】
                // 　以下に「消去」ボタンとアクション・リスナーの関連付けを追加
                clearButton.addActionListener(this);


                // 複数のボタンを配置するためのパネル(buttonPane)を作成
                buttonPane = new JPanel();
                buttonPane.add(addButton);
                buttonPane.add(clearButton);

                contentPane.add(textField, BorderLayout.NORTH);
                contentPane.add(scrollPane, BorderLayout.CENTER);
                contentPane.add(buttonPane, BorderLayout.SOUTH);

                mainFrame.setVisible(true); 
        }


        // 利用者の操作に応じた処理を実装
        // 必ず定義する必要がある
        public void actionPerformed(ActionEvent event){

                // ユーザの操作対象を判断
                // event.getSource()にてどのボタンを
                // クリックしたのかが判断できる
                // （ボタンのインスタンス名が戻り値となる）

                // 「追加」ボタンをクリックしたときの処理
                if(event.getSource() == addButton) {

                        // テキストエリアへ文字列を追加
                        textArea.append(textField.getText() + "\n");
                }
                // 【課題】
                // 　以下に「消去」ボタンをクリックしたとき，すべて消去する処理を追加
                // 　参考：テキストエリアの文字列を全消去
                //      　　　textArea.setText(null);
                else if(event.getSource() == clearButton) {
                	textArea.setText(null);
                }
        }

        // アプリケーションの起動
        public static void main(String[] args) {

		// コンストラクタを呼び出すのみ
                new Kadai11_01();
        }
} 
