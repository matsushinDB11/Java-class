package Kadai02;

import java.util.Arrays;
import java.util.Collections;

public abstract class SearchNum {
    int[] num = new int[5];
    void setNum(int num[]) {
        this.num = num;
    }
    abstract int getNum();
    abstract int getNum(int index);
    void output_all() {
        for (int i = 0; i < 5; i++) System.out.println(getNum(i));
    };
}

interface SortNum {
    void num_sort();
}

class AveNum extends SearchNum {
    int getNum() {
        int sum = Arrays.stream(num).sum();
        return sum / num.length;
    }

    @Override
    int getNum(int index) {
        return 0;
    }

    void output() {
        System.out.println("平均値: " + getNum());
    }
}

class SortAscNum extends SearchNum implements SortNum{
    int getNum(int index) {
        this.num_sort();
        return num[index];
    }

    @Override
    int getNum() {
        return 0;
    }

    @Override
    public void num_sort() {
        Arrays.sort(this.num);
    }
}

class  SortDescNum extends SearchNum implements SortNum{
    int getNum(int index) {
        this.num_sort();
        return num[index];
    }

    @Override
    int getNum() {
        return 0;
    }
    @Override
    public void num_sort() {
        Integer[] list = new Integer[5];
        for (int i = 0; i < 5; i++) {
            list[i] = this.num[i];
        }
        Arrays.sort(list, Collections.reverseOrder());
        for (int i = 0; i < 5; i++) {
            this.num[i] = list[i];
        }
    }
}