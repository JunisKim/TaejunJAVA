package Gourmet;

import java.util.List;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class GourmetService {
    public double calcAverageScore(List<Gourmet> eachScore){
        int sumOfScore = 0;
        for(Gourmet e : eachScore){
            sumOfScore += e.getScore();
        }
        return sumOfScore/eachScore.size();
    }
}
