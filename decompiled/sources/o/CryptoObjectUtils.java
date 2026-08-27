package o;

/* JADX INFO: loaded from: classes.dex */
public final class CryptoObjectUtils {
    public static final CryptoObjectUtils RemoteActionCompatParcelizer;
    public final boolean MediaDescriptionCompat;
    public final long read;
    public final boolean serializer;
    public static final CryptoObjectUtils IconCompatParcelizer = new CryptoObjectUtils(0, false, false);
    public static final CryptoObjectUtils write = new CryptoObjectUtils(500, true, false);

    public CryptoObjectUtils(long j, boolean z, boolean z2) {
        this.MediaDescriptionCompat = z;
        this.read = j;
        if (z2) {
            coil3.util.UtilsKt.IconCompatParcelizer("shouldRetry must be false when completeWithoutFailure is set to true", !z);
        }
        this.serializer = z2;
    }

    static {
        new CryptoObjectUtils(100L, true, false);
        RemoteActionCompatParcelizer = new CryptoObjectUtils(0L, false, true);
    }
}
