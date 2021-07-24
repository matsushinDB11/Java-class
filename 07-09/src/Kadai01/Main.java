package Kadai01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException{
        MusicData[] MusicDB = inputCSV();
        SortMusicDataByYear sort_music = new SortMusicDataByYear();
        sort_music.SortByYear(MusicDB);
        outputMusicDBArray(MusicDB);
    }

    private static MusicData[] inputCSV() throws IOException {
        // 入力ファイル名(CSV形式)
        String filename = "C:\\Users\\motoa\\Documents\\Class\\Java-class\\07-09\\src\\Kadai01\\input.csv";
//        File file = new File(filename);
//        Path inputPath = Paths.get("Kadai01/input.csv");
        // 入力ファイルの行数をカウント
//        long lineCounter = Files.lines(inputPath).count();
        long lineCounter = 10;
        MusicData[] MusicDB = new MusicData[Math.toIntExact(lineCounter)];
        // 入力, MusicDBの作成
        BufferedReader br;
        br = new BufferedReader(new FileReader(filename));
        for (int i = 0; i < lineCounter; i++) {
            String line;
            String[] lineArray;
            line = br.readLine();
            lineArray = line.split(",");
            MusicDB[i] = new MusicData();
            MusicDB[i].setFields(lineArray[0], lineArray[1], lineArray[2], Integer.parseInt(lineArray[3]));
        }
        return MusicDB;
    }

    private static void outputMusicDBArray(MusicData[] MusicDBArray) {
        for (MusicData MusicDB: MusicDBArray
             ) {
            MusicDB.output();
        }
    }
}
