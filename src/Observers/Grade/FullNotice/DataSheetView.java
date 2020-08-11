package Observers.Grade.FullNotice;

import Observers.Grade.ScoreRecord;

import java.util.List;

public class DataSheetView implements Observer {

    private UpgradeScoreRecord upgradeScoreRecord;
    private int viewCount;

    public DataSheetView(UpgradeScoreRecord upgradeScoreRecord, int viewCount) {
        this.upgradeScoreRecord = upgradeScoreRecord;
        this.viewCount = viewCount;
    }

    @Override
    public void update() {
        List<Integer> record = upgradeScoreRecord.getScore();
        displayScores(record, viewCount);
    }

    private void displayScores(List<Integer> record, int viewCount) {
        System.out.println("List of " + viewCount + ", entries : ");
        for (int i = 0; i < viewCount && i < record.size(); i++) {
            System.out.print(record.get(i) + " ");
        }
        System.out.println();
    }
}
