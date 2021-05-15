class Car {
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


class RacingCar extends Car {
    private int track_num;

    void setTrack_num(int num) {
        track_num = num;
    }

    public RacingCar(){
        System.out.println("RacingCar クラスのコンストラクタを呼び出しました。");
    }
    public void show() {
        super.show();
        System.out.println("コースナンバーは " + track_num + "です。");
    }
}

class Truck extends Car {
    private int capacity;
    void setCapacity(int weight) {
        capacity = weight;
    }

    public Truck(){
        System.out.println("Truck クラスのコンストラクタを呼び出しました。");
    }

    public void show() {
        super.show();
        System.out.println(capacity);
    }
}
public class ht19a084_0514 {

    public static void main(String[] args) {

    }
}
