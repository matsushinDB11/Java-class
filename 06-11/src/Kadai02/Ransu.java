package Kadai02;
import java.io.*;
import java.util.Random;


public class Ransu {
    int R[]=new int[20];
    Random ran;
    public Ransu() {
        ran = new Random(90515);
    }
    // 0以上100未満の任意の整数を返す
    int getRev(){
        return ran.nextInt(100);
    }
    // 配列R[x]にnを代入しておく
    void setRm(int index,int n){
        R[index]=n;
    }
    void SetInitRm() {
        for (int i = 0; i < 20; i++) {
            setRm(i, getRev());
        }
    }
// 入力された数sと20個の各乱数の大きさを比較して結果を出力する
// 関数内で標準出力を利用して結果をコンソールに出力する
// 結果：入力された数に対しての乱数の大きさ
// 出力フォーマット：
// “入力: <入力された値>，乱数<配列index>: <乱数の値>，乱数の大きさ:<大,小,同>
    // 例：入力: 23, 乱数1: 51, 大きさ: 大
    void checking(int s){
        char checker;
        for (int i = 0; i < 20; i++) {
            if (R[i] > s) checker = '大';
            else if (R[i] < s) checker = '小';
            else checker = '同';
            System.out.println("入力" + s + ", " + "乱数" + i + ": " + R[i] + ", " + "乱数の大きさ: " + checker);
        }
    }
}
