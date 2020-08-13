package Observers.Grade.FullNotice;

public class Client {
    public static void main(String[] args) {

        UpgradeScoreRecord upgradeScoreRecord = new UpgradeScoreRecord();

        DataSheetView dataSheetView = new DataSheetView(upgradeScoreRecord, 3);
        MaxMinView maxMinView = new MaxMinView(upgradeScoreRecord);
        StatisticsView statisticsView = new StatisticsView(upgradeScoreRecord);

        upgradeScoreRecord.attach(dataSheetView);
        upgradeScoreRecord.attach(maxMinView);
        upgradeScoreRecord.attach(statisticsView);

        for (int index = 1; index <= 5; index++) {
            int score = index * 10;
            System.out.println("점수 입력 : " + score);
            upgradeScoreRecord.addScore(score);
        }
    }
}