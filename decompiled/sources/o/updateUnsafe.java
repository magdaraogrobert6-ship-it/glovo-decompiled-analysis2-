package o;

/* JADX INFO: loaded from: classes2.dex */
public enum updateUnsafe {
    LESS_THAN("<"),
    LESS_THAN_OR_EQUAL("<="),
    EQUAL("=="),
    NOT_EQUAL("!="),
    GREATER_THAN(">"),
    GREATER_THAN_OR_EQUAL(">="),
    ARRAY_CONTAINS("array_contains"),
    ARRAY_CONTAINS_ANY("array_contains_any"),
    IN("in"),
    NOT_IN("not_in");

    private final String text;

    @Override // java.lang.Enum
    public String toString() {
        return this.text;
    }

    updateUnsafe(String str) {
        this.text = str;
    }
}
