package Kadai02;

import java.util.Arrays;

public abstract class SerchNum {
    private int[] num = new int[5];
    void setNum(int num[]) {
        this.num = num;
    }
    abstract int getNum();
}

class AveNum extends SerchNum {
    int getAve(int[] num) {
        int sum = Arrays.stream(num).sum();
        return sum / num.length;
    }
    @Override
    int getNum() {
        return 0;
    }
}
