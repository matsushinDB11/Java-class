import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Keisan {
    private static final int array_size = 10;
    private int[] ten_array = new int[array_size];
    void input () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array_size; i++) {
            System.out.println("入力" + i);
            this.ten_array[i] = Integer.parseInt(br.readLine());
        }
    }
    int get_ave(){
        int sum = 0;
        for (int i : this.ten_array) {
            sum += i;
        }
        int ave = sum /array_size;
        return ave;
    }
    void output_ave(){
        System.out.println("平均値は " + get_ave());
    }
    int get_max(){
        int max = this.ten_array[0];
        for (int i = 1; i < array_size; i++) {
            if(ten_array[i] > max){
                max = ten_array[i];
            }
        }
        return max;
    }
    void output_max() {
        System.out.println("最大値は " + get_max());
    }
    int get_min(){
        int min = this.ten_array[0];
        for (int i = 1; i < array_size; i++) {
            if(ten_array[i] < min){
                min = ten_array[i];
            }
        }
        return min;
    }
    void output_min() {
        System.out.println("最小値は " + get_min());
    }
    void output_sorted() {
        Arrays.sort(this.ten_array);
        for (int i : this.ten_array) {
            System.out.println(i);
        }
    }
}


public class Kadai456 {
    public static void main(String[] args) throws IOException {
        Keisan data1 = new Keisan();
        data1.input();
        data1.output_ave();
        data1.output_max();
        data1.output_min();
        data1.output_sorted();
    }
}
