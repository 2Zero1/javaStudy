package exercise.Ch5;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends FileFormatException {
    @Override
    public void write(Object obj, String fileName) throws IOException, ReflectiveOperationException {
        super.write(obj, fileName);
    }
}
