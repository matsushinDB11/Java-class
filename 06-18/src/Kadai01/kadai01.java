package Kadai01;

public class kadai01 {
    public static void main(String[] args) {
        // Carクラスのオブジェクトcar1を作成
        Car car1 = new Car("1号車");
        // car1オブジェクトのスレッド起動
        car1.start();
        // Carクラスのオブジェクトcar2を作成
        Car car2 = new Car("2号車");
        // car2オブジェクトのスレッド起動
        car2.start();
        for(int i=0; i<5; i++)
        {
            System.out.println("これはmain()メソッドの処理です．");
        }
    }
}
