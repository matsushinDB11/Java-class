package Car;

import java.io.*;

public class kadai1 {
    public static void main(String[] args) throws IOException{
        // Step 0. 標準入力用クラスとCarクラスのオブジェクトの宣言
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Car car1 = new Car();
        // Step 1. ナンバーの文字列の入力
        System.out.println("ナンバーを入力してください");
        String strnum = br.readLine();
        // Step 1. ガソリン量の文字列の入力
        System.out.println("ガソリンの量を入力してください");
        String strgas = br.readLine();
        // Step 2. 入力した文字を整数・小数点数に変換
        int num = Integer.parseInt(strnum);
        double gas = Double.parseDouble(strgas);
        // Step 3. クラスのオブジェクトへ代入
        // ナンバーの代入（フィールドへ直接代入）
        car1.num = num;
        // ガソリンの量の代入（フィールドへ直接記入）．
        car1.gas = gas;
        // Step 4. 代入した値を表示
        // クラスのメソッドを呼び出す．
        car1.show();
    }
}
