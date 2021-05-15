package Car;

public class Car {
    private int num;
    private double gas;
    public Car(){
        System.out.println("Car クラスのコンストラクタを呼び出しました。");
    }

    public void setNum(int n)
    {
        num = n;
        System.out.println("ナンバーを " + num + "にしました。");
    }
    public void setGas(double g)
    {
        gas = g;
        System.out.println("ガソリン量を " + gas + "にしました。");
    }
    public void show()
    {
        System.out.println("車のナンバーは " + num + "です。");
        System.out.println("ガソリンの量は " + gas + "です。");
    }

}
