package Kadai04;

public class Driver extends Thread{
    // 各ドライバーから入ってきた金額の合計
    private Company comp;
    // コンストラクタを上書き（オーバーロード）
    public Driver(Company c) {
        comp = c;
    }
    public void run() {
        for(int i=0; i<3; i++) {
            comp.add(50);
        }
    }
}
