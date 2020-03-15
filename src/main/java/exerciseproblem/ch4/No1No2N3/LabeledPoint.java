package exerciseproblem.ch4.No1No2N3;

import java.util.Arrays;
import java.util.Objects;

public class LabeledPoint extends Point {

    private String label;
    public String[] arr = new String[10];

    public LabeledPoint(double x, double y, String label) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(),this.label,Arrays.hashCode(arr));
    }

    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj)) return false;
        LabeledPoint labeledPoint = (LabeledPoint)obj;
        return this.label.equals(labeledPoint.label);
    }

    @Override
    public String toString() {
        return super.toString() + "[label = "+this.label+"]";
    }
}
