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

}
