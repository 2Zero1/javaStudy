package exercise.Ch8;

import java.util.Optional;

public class TType {

    public Optional<UType> g() {
        return Optional.of(new UType());
    }
}
