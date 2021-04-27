package Keisan;
import java.io.IOException;

public class kadai4 {
    public static void main(String[] args) throws IOException {
        Keisan data1 = new Keisan();
        data1.input();
        data1.output_ave();
        data1.output_max();
        data1.output_min();
        data1.output_sorted();
    }
}
