package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getViewportBounds {
    public final long IconCompatParcelizer;
    public final long RatingCompat;
    public final boolean RemoteActionCompatParcelizer;
    public final String read;
    public boolean serializer;
    public final String write;

    public getViewportBounds(String str, String str2, long j, boolean z, long j2) {
        this.read = str;
        this.write = str2;
        this.IconCompatParcelizer = j;
        this.serializer = false;
        this.RemoteActionCompatParcelizer = z;
        this.RatingCompat = j2;
    }

    public getViewportBounds(String str, String str2, long j) {
        this(str, str2, j, false, 0L);
    }
}
