package Kadai02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        int[] input_nums = input();
        AveNum ave_of = new AveNum();
        ave_of.setNum(input_nums);
        ave_of.output();
        SortAscNum asc = new SortAscNum();
        asc.setNum(input_nums);
        System.out.println("昇順");
        asc.output_all();
        SortDescNum desc = new SortDescNum();
        desc.setNum(input_nums);
        System.out.println("降順");
        desc.output_all();
    }
    static int[] input() throws IOException {
        int arrays_size = 5;
        int[] input = new int[arrays_size];
        for (int i = 0; i < arrays_size; i++) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            input[i] = Integer.parseInt(br.readLine());
        }
        return input;
    }
}
