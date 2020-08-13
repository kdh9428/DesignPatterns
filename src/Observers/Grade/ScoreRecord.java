package Observers.Grade;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {

    private List<Integer> scores = new ArrayList<>();
    private List<DataSheetView> dataSheetView = new ArrayList<DataSheetView>();
    private MinMaxView minMaxView;

    public void addDataSheetView(DataSheetView dataSheetView){
        this.dataSheetView.add(dataSheetView);
    }

    public void setMinMaxView(MinMaxView minMaxView) {
        this.minMaxView = minMaxView;
    }

    public List<Integer> getScoreRecord(){
        return scores;
    }

    public void addScore(int score){
        scores.add(score);
        for (DataSheetView dataSheetView : dataSheetView) {
            dataSheetView.update();
        }
        minMaxView.update();
    }
}