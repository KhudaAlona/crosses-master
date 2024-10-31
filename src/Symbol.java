public enum Symbol {
    X('X'),
    O('O'),
    BLANK('_');
    private final char value;
    Symbol(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }
}
