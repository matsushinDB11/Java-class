package Car;

public class Truck extends Car{
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
