package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class asAndroidColorFilter {
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[toColorLong8_81llA.values().length];
        try {
            iArr[toColorLong8_81llA.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[toColorLong8_81llA.STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[toColorLong8_81llA.RESUMED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[toColorLong8_81llA.DESTROYED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[toColorLong8_81llA.INITIALIZED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        serializer = iArr;
    }
}
