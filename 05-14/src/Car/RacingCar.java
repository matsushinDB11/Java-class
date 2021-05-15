package Car;

public class RacingCar extends Car{
    private int track_num;

    void setTrack_num(int num) {
        track_num = num;
    }

    public RacingCar(){
        System.out.println("RacingCar クラスのコンストラクタを呼び出しました。");
    }
    public void show() {
        super.show();
        System.out.println("コースナンバーは " + track_num + "です。");
    }
}
