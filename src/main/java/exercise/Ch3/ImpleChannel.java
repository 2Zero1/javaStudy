package exercise.Ch3;

public class ImpleChannel implements Channel {
    @Override
    public boolean isOpen() {
        return false;
    }

    @Override
    public void close() {

    }
}
