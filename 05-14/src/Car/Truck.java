package Car;

public class Truck extends Car{
    private int capacity;
    void setCapacity(int weight) {
        capacity = weight;
    }

    public void show() {
        super.show();
        System.out.println(capacity);
    }
}
