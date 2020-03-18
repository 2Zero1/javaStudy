package exercise.Ch5;

import java.io.IOException;

public class FileFormatException extends IOException {
    public FileFormatException(){};

    public FileFormatException(String message) {
        super(message);
    }

    public FileFormatException(Throwable cause) { initCause(cause);}
    public FileFormatException(String message, Throwable cause) {
        super(message);
        initCause(cause);
    }
    public void write(Object obj, String fileName) throws IOException, ReflectiveOperationException{

    }
}
