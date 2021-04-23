import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kadai3 {
    public static void main(String[] args) throws IOException {
        int drink_price = 100;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        int bought_drink_num = Integer.parseInt(str1);
        if (bought_drink_num >= 10) {
            drink_price = (int) (drink_price * 0.9);
        } else if (bought_drink_num >= 30) {
            drink_price = (int) (drink_price * 0.7);
        }
        System.out.println(drink_price);
    }
}
