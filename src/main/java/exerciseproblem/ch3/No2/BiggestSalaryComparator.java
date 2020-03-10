package exerciseproblem.ch3.No2;

public class BiggestSalaryComparator implements Comparator<Double> {
    @Override
    public int compare(Double o1, Double o2) {
        return Double.compare(o2, o1);
    }
}
