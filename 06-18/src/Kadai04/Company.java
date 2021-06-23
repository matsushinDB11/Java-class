package Kadai04;

public class Company {
    private int sum = 0;
    // sumに金額aを足していく
    public synchronized void add(int a)
    {
        int tmp = sum;
        System.out.println("現在、金額は" + tmp + "円です。");
        tmp = tmp + a;
        System.out.println("合計額を" + tmp + "円にします。");
        sum = tmp;
    }
}
