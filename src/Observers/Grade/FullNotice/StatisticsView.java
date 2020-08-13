package Observers.Grade.FullNotice;

import java.util.List;

public class StatisticsView implements Observer {

    private UpgradeScoreRecord scoreRecord;
    private float average;
    private float sum;

    public StatisticsView(UpgradeScoreRecord scoreRecord) {
        this.scoreRecord = scoreRecord;
    }

    @Override
    public void update() {
        List<Integer> record = scoreRecord.getScore();
        displayStatistics(record);

    }
    private void displayStatistics(List<Integer> record) {
        for (float score : record) {
            sum += score;
        }
        average = sum / record.size();
        System.out.println("합계 : "+ sum + ", 평균 : "+ average);
    }
}
