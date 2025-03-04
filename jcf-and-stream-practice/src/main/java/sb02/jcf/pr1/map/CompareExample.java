package sb02.jcf.pr1.map;

import java.util.HashSet;
import java.util.Set;

public class CompareExample {

    public static void main(String[] args) {
        Score scoreA = new Score("score1", "Lee", 90);
        Score scoreB = new Score("score1", "Park", 50);

        Set<Score> scoreSet = new HashSet<>();
        scoreSet.add(scoreA);
        scoreSet.add(scoreB);
        scoreSet.remove(scoreB);
    }
}
