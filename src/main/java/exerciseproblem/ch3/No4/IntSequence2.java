package exerciseproblem.ch3.No4;

public class IntSequence2 {
    public static IntSequenceInterface[] of (int... ints) {
       IntSequenceInterface[] arr = new IntSequenceInterface[ints.length];
       for(int i = 0; i < ints.length; i++) {
           int finalI = i;
           arr[i] =  new IntSequenceInterface() {
               @Override
               public int getSequence() {
                   return ints[finalI];
               }
           };
       }
       return arr;
    }

}
