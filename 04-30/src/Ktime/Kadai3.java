package Ktime;

import java.io.IOException;

public class Kadai3 {
    public static void main(String[] args) throws IOException {
        Ktime time1 = new Ktime();
        Ktime time2 = new Ktime();
        time1.inputTime();
        time2.inputTime();
        Ktime time3 = time1.addTime(time2);
        System.out.println("addTime");
        time3.outputTime();
        time3 = time1.minTime(time2);
        System.out.println("minTime");
        time3.outputTime();
    }
}
