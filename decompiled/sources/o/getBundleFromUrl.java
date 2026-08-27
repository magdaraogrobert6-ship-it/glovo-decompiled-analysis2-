package o;

/* JADX INFO: loaded from: classes4.dex */
public final class getBundleFromUrl {
    public long IconCompatParcelizer;
    public boolean serializer;

    public getBundleFromUrl(boolean z, long j) {
        this.serializer = z;
        this.IconCompatParcelizer = j;
    }

    public long RemoteActionCompatParcelizer() {
        if (this.serializer) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, this.IconCompatParcelizer - System.nanoTime());
    }

    public getBundleFromUrl() {
    }
}
