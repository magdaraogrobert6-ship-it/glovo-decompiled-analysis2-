package o;

/* JADX INFO: loaded from: classes.dex */
public final class ClipKt extends onBuildCache {
    public final Object IconCompatParcelizer;
    public final CacheDrawScopeonDrawBehind1 MediaDescriptionCompat;
    public final clip RemoteActionCompatParcelizer;
    public final clip read;
    public final clipToBounds serializer;
    public final CacheDrawScopeonDrawBehind1 write;

    @Override // o.onBuildCache
    public final Object read() {
        return this.IconCompatParcelizer;
    }

    public ClipKt(Object obj) {
        super(obj);
        this.IconCompatParcelizer = obj;
        this.read = new clip(obj, -2, this);
        this.MediaDescriptionCompat = new CacheDrawScopeonDrawBehind1(obj, 0, this);
        this.RemoteActionCompatParcelizer = new clip(obj, -1, this);
        this.write = new CacheDrawScopeonDrawBehind1(obj, 1, this);
        this.serializer = new clipToBounds(obj, this);
    }
}
