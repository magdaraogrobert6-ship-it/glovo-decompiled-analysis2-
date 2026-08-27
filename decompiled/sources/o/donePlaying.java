package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class donePlaying {
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[PreviewGreenTintQuirk.values().length];
        serializer = iArr;
        try {
            iArr[PreviewGreenTintQuirk.REALTIME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            serializer[PreviewGreenTintQuirk.UPTIME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
