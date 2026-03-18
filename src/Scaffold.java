import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public enum Scaffold {
    ZERO_POSITION("""
                     _______
                     |     |
                           |
                           |
                           |
                           |
            ----------------
            """),
    ONE("""
                     _______
                     |     |
                     O     |
                           |
                           |
                           |
            ----------------
            """),
    TWO("""
                     _______
                     |     |
                     O     |
                     |     |
                     |     |
                           |
            ----------------
            """),
    THREE("""
                     _______
                     |     |
                     O     |
                  ---|     |
                     |     |
                           |
            ----------------
            """),
    FOUR("""
                     _______
                     |     |
                     O     |
                  ---|---  |
                     |     |
                           |
            ----------------
            """),
    FIVE("""
                     _______
                     |     |
                     O     |
                  ---|---  |
                    _|     |
                   _|      |
            ----------------
            """),
    SIX("""
                     _______
                     |     |
                     O     |
                  ---|---  |
                    _|_    |
                   _| |_   |
            ----------------
            """);

    private final String value;

    Scaffold(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }


    private static final Map<Integer, String> ERROR_MAP;
    static {
        Map<Integer, String> m = new HashMap<>();
        m.put(0, ZERO_POSITION.toString());
        m.put(1, ONE.toString());
        m.put(2, TWO.toString());
        m.put(3, THREE.toString());
        m.put(4, FOUR.toString());
        m.put(5, FIVE.toString());
        ERROR_MAP = Collections.unmodifiableMap(m);
    }

}
