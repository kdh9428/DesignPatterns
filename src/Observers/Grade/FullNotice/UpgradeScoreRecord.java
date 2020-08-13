package Observers.Grade.FullNotice;

import java.util.ArrayList;
import java.util.List;

public class UpgradeScoreRecord extends Subject {

    private List<Integer> score = new ArrayList<Integer>();

    public void addScore(int score) {
        this.score.add(score);
        notifyObservers();
    }

    public List<Integer> getScore() {
        return score;
    }
}
