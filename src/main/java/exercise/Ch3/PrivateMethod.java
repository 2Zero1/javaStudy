package exercise.Ch3;

public interface PrivateMethod {

//    private
    static void makeFiniteSequence(int... value) { System.out.println(value);}

    static void of(int a) {
        makeFiniteSequence(1);
    }
    static void of(int a, int b) {

        makeFiniteSequence(2);
    }
    static void of(int a, int b,int c) {
        makeFiniteSequence(3);

    }

}
