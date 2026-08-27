package o;

/* JADX INFO: loaded from: classes.dex */
public enum forwardFocusSearch {
    BOOLEAN(1),
    FLOAT(2),
    INTEGER(3),
    LONG(4),
    STRING(5),
    STRING_SET(6),
    DOUBLE(7),
    VALUE_NOT_SET(0);

    private final int value;

    public int getNumber() {
        return this.value;
    }

    forwardFocusSearch(int i) {
        this.value = i;
    }

    public static forwardFocusSearch forNumber(int i) {
        switch (i) {
            case 0:
                return VALUE_NOT_SET;
            case 1:
                return BOOLEAN;
            case 2:
                return FLOAT;
            case 3:
                return INTEGER;
            case 4:
                return LONG;
            case 5:
                return STRING;
            case 6:
                return STRING_SET;
            case 7:
                return DOUBLE;
            default:
                return null;
        }
    }

    @Deprecated
    public static forwardFocusSearch valueOf(int i) {
        return forNumber(i);
    }
}
