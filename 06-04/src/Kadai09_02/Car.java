package Kadai09_02;

abstract class Vehicle {
    protected int speed;
    public void setSpeed(int s)
    {
        speed = s;
        System.out.println("速度を " + speed + "にしました。");
    }
    abstract void show();
}

class CarException extends Exception{};

public class Car extends Vehicle{
    private int num;
    private double gas;
    public void setNum(int n)
    {
        num = n;
        System.out.println("ナンバーを " + num + "にしました。");
    }
    public void setGas(double g) throws CarException
    {
        gas = g;
        if (gas < 0) {
            CarException e = new CarException();
            throw e;
        }
        System.out.println("ガソリン量を " + gas + "にしました。");
    }
    public void show()
    {
        System.out.println("車のナンバーは " + num + "です。");
        System.out.println("ガソリンの量は " + gas + "です。");
        System.out.println("速度は " + speed + "です。");
    }

}
