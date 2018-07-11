package compare;

import java.util.Comparator;

public class SortClazzScore implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int score1=Integer.parseInt(o1.split("\t")[2]);
        int score2=Integer.parseInt(o2.split("\t")[2]);
        return score2-score1;
    }
}
