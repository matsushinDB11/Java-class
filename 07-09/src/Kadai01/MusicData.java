package Kadai01;

public class MusicData {
    private String title;
    private String singer;
    private String album_title;
    private int year;

    // 曲名，歌手名，アルバム名，発表年
    void setFields(String k_title, String kasyu, String al_name, int y){
        this.title = k_title;
        this.singer = kasyu;
        this.album_title = al_name;
        this.year = y;
    }
    String getKyokumei(){return this.title;}
    String getKasyumei(){return this.singer;}
    String getAlbummei(){return this.album_title;}
    int getHappyonen(){return this.year;}

    void output() {
        System.out.println("曲名: " + getKyokumei());
        System.out.println("歌手名: "+ getKasyumei());
        System.out.println("アルバム名: " + getAlbummei());
        System.out.println("発表年: "  + getHappyonen() + "\n");
    }
}
