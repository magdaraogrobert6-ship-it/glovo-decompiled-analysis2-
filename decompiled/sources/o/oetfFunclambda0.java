package o;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class oetfFunclambda0 {
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[ImageHeaderParser$ImageType.values().length];
        read = iArr;
        try {
            iArr[ImageHeaderParser$ImageType.WEBP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            read[ImageHeaderParser$ImageType.WEBP_A.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            read[ImageHeaderParser$ImageType.ANIMATED_WEBP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
