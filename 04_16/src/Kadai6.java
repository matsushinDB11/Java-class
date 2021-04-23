public class Kadai6 {
    public static void main(String[] args) {
        for (int i = 10; i <= 99; i++) {
            String msg = "";
            msg += i + " ";
            if (i % 10 == 9) {
                msg += "\n";
            }
            System.out.print(msg);
        }
    }
}
