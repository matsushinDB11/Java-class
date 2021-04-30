package Ktime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SetException extends Exception {}

public class Ktime {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int h, int m, int s) throws SetException{
        if (m >= 60 || m < 0 || s >= 60 || s < 0) {
            SetException e = new SetException();
            throw e;
        }
        this.hour = h;
        this.minute = m;
        this.second = s;
    }
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
    public void outputTime() {
        System.out.println(this.hour + "時間");
        System.out.println(this.minute + "分");
        System.out.println(this.second + "秒");
    }
}
