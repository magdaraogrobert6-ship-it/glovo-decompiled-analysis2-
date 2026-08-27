package o;

/* JADX INFO: loaded from: classes.dex */
public final class CacheDrawScope {
    public static final CacheDrawScope RemoteActionCompatParcelizer;
    public static final CacheDrawScope write;
    public final Throwable IconCompatParcelizer;
    public final boolean serializer;

    public CacheDrawScope(Throwable th, boolean z) {
        this.serializer = z;
        this.IconCompatParcelizer = th;
    }

    static {
        if (getGraphicsContext.read) {
            RemoteActionCompatParcelizer = null;
            write = null;
        } else {
            RemoteActionCompatParcelizer = new CacheDrawScope(null, false);
            write = new CacheDrawScope(null, true);
        }
    }
}
