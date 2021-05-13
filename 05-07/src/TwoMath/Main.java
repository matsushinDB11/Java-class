package TwoMath;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        TwoMath math1 = new TwoMath();
        math1.inputNum();
        System.out.println(math1.sinp());
        System.out.println(math1.sinm());
        System.out.println(math1.cosp());
        System.out.println(math1.cosm());
        System.out.println(math1.tanp());
        System.out.println(math1.tanm());
    }
}
