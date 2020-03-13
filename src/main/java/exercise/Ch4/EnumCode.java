package exercise.Ch4;

public class EnumCode {

    public static int eval(Operation op, int arg1, int arg2) {
        int result = 0;
        switch (op) {
            case ADD : result = arg1 + arg2; break;
            case SUBTRACT : result = arg1 - arg2; break;
            case MULTIPLY : result = arg1 * arg2; break;
            case DIVIDE : result = arg1 / arg2; break;
        }
        return result;
    }
    int a = 1;
    public enum Operation {

        ADD {
            public int eval(int arg1, int arg2) { return arg1 + arg2;}
        },
        SUBTRACT {
            @Override
            public int eval(int arg1, int arg2) {
                return arg1-arg2;
            }
        },
        MULTIPLY {
            @Override
            public int eval(int arg1, int arg2) {
                return arg1-arg2;
            }
        },
        DIVIDE {
            @Override
            public int eval(int arg1, int arg2) {
                return arg1-arg2;
            }
        };

        public abstract int eval(int arg1, int arg2);
    }

    public enum Modifier {
        PUBLIC, PRIVATE, PROTECTED, STATIC, FINAL, ABSTRACT;
        private static int maskBit = 1;
        private int mask;
        static {
            int mask = 1;
            for (Modifier m : Modifier.values()) {
                m.mask = maskBit;
                maskBit *= 2;
            }
        }
//        Modifier() {
//            mask = maskBit;
//            maskBit *= 2;
//
//        }
    }
}
