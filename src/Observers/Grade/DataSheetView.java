package Observers.Grade;

import java.util.List;

public class DataSheetView {

    private ScoreRecord scoreRecord;
    private int viewCount;

    public DataSheetView(ScoreRecord scoreRecord, int viewCount) {
        this.scoreRecord = scoreRecord;
        this.viewCount = viewCount;
    }

    public void update() {//점수 변경 확인
        List<Integer> record = scoreRecord.getScoreRecord();
        displayScores(record, viewCount);
    }

    public void displayScores(List<Integer> record, int viewCount) {
        System.out.println("List of " + viewCount + " entries : ");
        for (int i = 0; i < viewCount && i < record.size(); i++) {
            System.out.println(record.get(i) + " ");
        }
        System.out.println();
    }
}
