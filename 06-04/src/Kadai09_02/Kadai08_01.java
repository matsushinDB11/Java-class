package Kadai09_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kadai08_01 {
    public static void main(String[] args) throws IOException {
        // Step 0. 標準入力用クラスとCarクラスのオブジェクトの宣言
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Car car1 = new Car(); // Carオブジェクトの作成
// Step 1. ナンバーの文字列の入力
        System.out.println("ナンバーを入力してください");
        String strnum = br.readLine();
// Step 1. ガソリン量の文字列の入力
        System.out.println("ガソリンの量を入力してください");
        String strgas = br.readLine();
// Step 1. 速度の文字列の入力
        System.out.println("速度を入力してください");
        String strspd = br.readLine();
// Step 2. 入力した文字を整数・小数点数に変換
        int num = Integer.parseInt(strnum);
        double gas = Double.parseDouble(strgas);
        int spd = Integer.parseInt(strspd);
// Step 3. クラスのオブジェクトへ代入
        car1.setNum(num); // ナンバーの代入（メソッドにて代入）．
        try {
            car1.setGas(gas); // ガソリンの量の代入（メソッドにて代入）．
        } catch (CarException e) {
            e.printStackTrace();
            System.out.println("ガスの入力が間違っています。");
        }
        car1.setSpeed(spd); // 速度の代入（メソッドにて代入）．

// Step 4. 代入した値を表示
        car1.show() ;// クラスのメソッドを呼び出して表示．

    }
}
