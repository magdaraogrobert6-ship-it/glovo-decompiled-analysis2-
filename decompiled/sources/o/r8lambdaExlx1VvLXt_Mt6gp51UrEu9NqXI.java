package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class r8lambdaExlx1VvLXt_Mt6gp51UrEu9NqXI {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[io.sentry.rrweb.RemoteActionCompatParcelizer.values().length];
        read = iArr;
        try {
            iArr[io.sentry.rrweb.RemoteActionCompatParcelizer.IncrementalSnapshot.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            read[io.sentry.rrweb.RemoteActionCompatParcelizer.Meta.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            read[io.sentry.rrweb.RemoteActionCompatParcelizer.Custom.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[io.sentry.rrweb.MediaMetadataCompat.values().length];
        RemoteActionCompatParcelizer = iArr2;
        try {
            iArr2[io.sentry.rrweb.MediaMetadataCompat.MouseInteraction.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            RemoteActionCompatParcelizer[io.sentry.rrweb.MediaMetadataCompat.TouchMove.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
