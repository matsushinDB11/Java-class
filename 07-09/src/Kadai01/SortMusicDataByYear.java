package Kadai01;

import java.util.Arrays;
import java.util.Comparator;

public class SortMusicDataByYear {
    void SortByYear(MusicData MusicArray[]) {
        Arrays.sort(MusicArray, new MusicDataComp());
    }
}

class MusicDataComp implements Comparator<MusicData> {
    @Override
    public int compare(MusicData o1, MusicData o2) {
        return o1.getHappyonen() - o2.getHappyonen();
    }
}