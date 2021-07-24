package Kadai02;

import java.util.Arrays;

public abstract class SearchNum {
    private int[] num = new int[5];
    void setNum(int num[]) {
        this.num = num;
    }
    abstract int getNum();
}

interface SortNum {
    void num_sort();
}

class AveNum extends SearchNum {
    int getAve(int[] num) {
        int sum = Arrays.stream(num).sum();
        return sum / num.length;
    }
    @Override
    int getNum() {
        return 0;
    }
}

class SortAscNum extends SearchNum {

    @Override
    int getNum() {
        return 0;
    }
}
