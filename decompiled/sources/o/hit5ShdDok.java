package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class hit5ShdDok {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

    static {
        int[] iArr = new int[updateUnsafe.values().length];
        RemoteActionCompatParcelizer = iArr;
        try {
            iArr[updateUnsafe.ARRAY_CONTAINS_ANY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            RemoteActionCompatParcelizer[updateUnsafe.ARRAY_CONTAINS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            RemoteActionCompatParcelizer[updateUnsafe.EQUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            RemoteActionCompatParcelizer[updateUnsafe.IN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            RemoteActionCompatParcelizer[updateUnsafe.NOT_IN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            RemoteActionCompatParcelizer[updateUnsafe.NOT_EQUAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            RemoteActionCompatParcelizer[updateUnsafe.LESS_THAN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            RemoteActionCompatParcelizer[updateUnsafe.LESS_THAN_OR_EQUAL.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            RemoteActionCompatParcelizer[updateUnsafe.GREATER_THAN_OR_EQUAL.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            RemoteActionCompatParcelizer[updateUnsafe.GREATER_THAN.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
