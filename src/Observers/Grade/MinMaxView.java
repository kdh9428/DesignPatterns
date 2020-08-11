package Observers.Grade;

import java.util.Collections;
import java.util.List;

public class MinMaxView {

    private ScoreRecord scoreRecord;

    public MinMaxView(ScoreRecord scoreRecord) {
        this.scoreRecord = scoreRecord;
    }

    public void update() {
        List<Integer> record = this.scoreRecord.getScoreRecord();
        displayMinMax(record);
    }

    private void displayMinMax(List<Integer> record) {
        int min = Collections.min(record);
        int max = Collections.max(record);

        System.out.println("Min : " + min + ", Max : " + max);
    }
}
