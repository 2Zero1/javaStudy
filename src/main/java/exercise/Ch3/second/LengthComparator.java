package exercise.Ch3.second;

import exerciseproblem.ch3.No2.Comparator;

public class LengthComparator implements  java.util.Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }
}
