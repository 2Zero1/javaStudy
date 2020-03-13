package exercise.Ch4;

import java.util.Objects;

public interface Interface {
//    default String toString() {
//
//    }

    default boolean equals() {
         return false;
    }

//    default void hashCode() {
//
//    }
}
