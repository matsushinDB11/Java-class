package Car;

public class Car {
    int num;
    double gas;
    void setNum(int n)
    {
        num = n;
        System.out.println("ナンバーを " + num + "にしました。");
    }
    void setGas(double g)
    {
        gas = g;
        System.out.println("ガソリン量を " + gas + "にしました。");
    }
    void show()
    {
        System.out.println("車のナンバーは " + num + "です。");
        System.out.println("ガソリンの量は " + gas + "です。");
    }
}
