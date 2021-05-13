import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TwoMath {
    private double alpha;
    private double beta;

    void setNum(double a, double b){
        this.alpha = Math.toRadians(a);
        this.beta = Math.toRadians(b);
    }
    void inputNum() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1つめの角度を入力");
        double x = Double.parseDouble(br.readLine());
        System.out.println("2つめの角度を入力");
        double y = Double.parseDouble(br.readLine());
        setNum(x, y);
    }

    double sinp() {
        return Math.sin(alpha + beta);
    }
    double sinm() {
        return Math.sin(alpha - beta);
    }
    double cosp(){
        return Math.cos(alpha + beta);
    }
    double cosm(){
        return Math.cos(alpha - beta);
    }
    double tanp(){
        return Math.tan(alpha + beta);
    }
    double tanm(){
        return Math.tan(alpha - beta);
    }
}

public class ht19a084_0507 {
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
