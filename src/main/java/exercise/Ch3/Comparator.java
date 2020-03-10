package exercise.Ch3;

@FunctionalInterface
public interface Comparator<T> {
    int compare(T first, T second);
}
