import java.io.*;

public class Kadai2 {
    public static void main(String[] args) throws IOException{
        // 整数2つの宣言
        int num1;
        int num2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("整数1を入力してください");
        String str1 =br.readLine();

        System.out.println("整数2を入力してください");
        String str2 =br.readLine();

        num1 = Integer.parseInt(str1);
        num2 = Integer.parseInt(str2);

        if (num1 > num2) {
            System.out.println("大きな整数は" + str1 + " です");
        } else {
            System.out.println("大きな整数は" + str2 + " です");
        }
    }
}
