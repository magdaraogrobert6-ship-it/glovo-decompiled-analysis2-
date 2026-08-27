package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class drawRoundRect {
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[drawRawPointsO7TthRY.values().length];
        try {
            iArr[drawRawPointsO7TthRY.Move.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[drawRawPointsO7TthRY.Line.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[drawRawPointsO7TthRY.Quadratic.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[drawRawPointsO7TthRY.Conic.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[drawRawPointsO7TthRY.Cubic.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        read = iArr;
    }
}
