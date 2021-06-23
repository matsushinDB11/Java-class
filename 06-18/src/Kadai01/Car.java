package Kadai01;

public class Car extends Thread{
    private String name;
    public Car(String nm)
    {
        name = nm;
    }
    public void run()
    {
        for (int i=0; i<5; i++) {
            System.out.println(name + "の処理をしています。");
        }
    }
}
