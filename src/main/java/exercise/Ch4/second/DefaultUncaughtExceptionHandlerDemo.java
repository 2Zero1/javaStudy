package exercise.Ch4.second;

public class DefaultUncaughtExceptionHandlerDemo {
    public static void main(String[] args) throws Exception {
        Thread.setDefaultUncaughtExceptionHandler((thread, ex) -> {
            System.err.println(ex.getMessage());
            System.err.println("Goodbye, cruel world!");
        });
//        System.out.println(1 / 0);

        Integer.parseInt("adsf");
    }
}