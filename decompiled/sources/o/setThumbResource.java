package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class setThumbResource {
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[SoftwareJpegEncodingPreferredQuirk.values().length];
        write = iArr;
        try {
            iArr[SoftwareJpegEncodingPreferredQuirk.PRIV.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            write[SoftwareJpegEncodingPreferredQuirk.YUV.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            write[SoftwareJpegEncodingPreferredQuirk.JPEG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
