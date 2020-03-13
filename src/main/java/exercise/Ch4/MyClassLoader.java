package exercise.Ch4;

public class MyClassLoader extends ClassLoader {
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] bytes = new byte[1]; //클래스 파일의 바이트들 넣고

        return defineClass(name, bytes, 0, bytes.length);
    }
}
