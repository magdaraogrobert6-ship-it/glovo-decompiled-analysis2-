package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class accessfillVector {
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[updateUnsafe.values().length];
        write = iArr;
        try {
            iArr[updateUnsafe.LESS_THAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            write[updateUnsafe.LESS_THAN_OR_EQUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            write[updateUnsafe.EQUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            write[updateUnsafe.NOT_EQUAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            write[updateUnsafe.GREATER_THAN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            write[updateUnsafe.GREATER_THAN_OR_EQUAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            write[updateUnsafe.ARRAY_CONTAINS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            write[updateUnsafe.ARRAY_CONTAINS_ANY.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            write[updateUnsafe.IN.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            write[updateUnsafe.NOT_IN.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
