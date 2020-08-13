package Observers.Grade.FullNotice;

import java.util.Collections;
import java.util.List;

public class MaxMinView implements Observer{

    private int max;
    private int min;
    private UpgradeScoreRecord upgradeScoreRecord;


    public MaxMinView(UpgradeScoreRecord upgradeScoreRecord) {
        this.upgradeScoreRecord = upgradeScoreRecord;
    }

    @Override
    public void update() {
        List<Integer> record = upgradeScoreRecord.getScore();
        displayMinMax(record);
    }

    private void displayMinMax(List<Integer> record) {
        min = Collections.min(record);
        max = Collections.max(record);

        System.out.println("Min: "+ min +", Max: "+max);
    }
}
