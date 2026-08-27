package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ActualCanvas {
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[AndroidColorSpace_androidKt.values().length];
        try {
            iArr[AndroidColorSpace_androidKt.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AndroidColorSpace_androidKt.ON_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AndroidColorSpace_androidKt.ON_RESUME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AndroidColorSpace_androidKt.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[AndroidColorSpace_androidKt.ON_STOP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[AndroidColorSpace_androidKt.ON_DESTROY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[AndroidColorSpace_androidKt.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        serializer = iArr;
    }
}
