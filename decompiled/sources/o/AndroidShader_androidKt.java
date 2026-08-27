package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AndroidShader_androidKt {
    public static final /* synthetic */ int[] IconCompatParcelizer;

    static {
        int[] iArr = new int[AndroidColorSpace_androidKt.values().length];
        try {
            iArr[AndroidColorSpace_androidKt.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AndroidColorSpace_androidKt.ON_RESUME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AndroidColorSpace_androidKt.ON_STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AndroidColorSpace_androidKt.ON_DESTROY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        IconCompatParcelizer = iArr;
    }
}
