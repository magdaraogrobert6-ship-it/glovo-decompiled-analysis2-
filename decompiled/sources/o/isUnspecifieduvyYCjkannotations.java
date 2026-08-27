package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class isUnspecifieduvyYCjkannotations {
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[toColorLong8_81llA.values().length];
        read = iArr;
        try {
            iArr[toColorLong8_81llA.RESUMED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            read[toColorLong8_81llA.STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            read[toColorLong8_81llA.CREATED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            read[toColorLong8_81llA.INITIALIZED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
