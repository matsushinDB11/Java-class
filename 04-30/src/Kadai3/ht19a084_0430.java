package Kadai3;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


class SetException extends Exception {}

class Ktime {
    private int hour;
    private int minute;
    private int second;

    // フィールドを設定
    public void setTime(int h, int m, int s) throws SetException {
        // 入力値の分または秒が60以上or0未満の場合、例外を送出
        if (m >= 60 || m < 0 || s >= 60 || s < 0) {
            SetException e = new SetException();
            throw e;
        }
        this.hour = h;
        this.minute = m;
        this.second = s;
    }

    //和を計算
    public Ktime addTime(Ktime t) {
        Ktime reTime = new Ktime();
        reTime.hour = this.hour + t.hour;
        reTime.minute = this.minute + t.minute;
        reTime.second = this.second + t.second;
        // 秒繰り上げ
        if (reTime.second >= 60) {
            reTime.minute += 1;
            reTime.second -= 60;
        }
        // 分繰り上げ
        if (reTime.minute >= 60) {
            reTime.hour += 1;
            reTime.minute -= 60;
        }
        return reTime;
    }

    //差を計算
    public Ktime minTime(Ktime t) {
        Ktime reTime_min = new Ktime();
        reTime_min.hour = this.hour - t.hour;
        reTime_min.minute = this.minute - t.minute;
        reTime_min.second = this.second - t.second;
        // 秒繰り下げ
        if (reTime_min.second < 0) {
            reTime_min.minute -= 1;
            reTime_min.second += 60;
        }
        // 分繰り下げ
        if (reTime_min.minute < 0) {
            reTime_min.hour -= 1;
            reTime_min.minute += 60;
        }
        return reTime_min;
    }

    //フィールドを入力、設定
    public void inputTime() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("時間を入力");
        int h = Integer.parseInt(br.readLine());
        System.out.println("分を入力");
        int m = Integer.parseInt(br.readLine());
        System.out.println("秒を入力");
        int s = Integer.parseInt(br.readLine());
        try {
            this.setTime(h, m, s);
        } catch (SetException e) {
            System.out.println("入力値が無効です");
            this.inputTime();
        }
    }
    //フィールドを出力
    public void outputTime() {
        System.out.println(this.hour + "時間");
        System.out.println(this.minute + "分");
        System.out.println(this.second + "秒");
    }
}

public class ht19a084_0430 {
    public static void main(String[] args) throws IOException{
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
