import java.io.*;

public class Kadai1 {
    public static void main(String[] args) throws IOException {
        // Step 0. 変数の宣言
        int num3;
        // Step 0. 標準入力用クラスの宣言
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Step 1. 1番目の文字列の入力
        System.out.println("整数1を入力してください");

        String str1 = br.readLine();

        // Step 1. 2番目の文字列の入力
        System.out.println("整数2を入力してください");
        String str2 = br.readLine();

        // Step 2. 入力した文字を整数に変換
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        // Step 3. 割算を計算
        num3=num1 / num2;

        // Step 4. 結果の表示
        System.out.println("入力した整数は "+num1+" と "+num2+" です。");
        System.out.println(num1 + "-" + num2 + "は " + (num1-num2)+" です。");
        System.out.println(num1 + "÷" + num2 + "は " + num3 + " です。");

    }
}
