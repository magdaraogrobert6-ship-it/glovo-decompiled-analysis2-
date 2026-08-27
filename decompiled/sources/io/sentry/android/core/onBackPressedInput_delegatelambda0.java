package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
public final class onBackPressedInput_delegatelambda0 implements Comparable {
    public final long IconCompatParcelizer;
    public final boolean MediaBrowserCompatMediaItem;
    public final long RatingCompat;
    public final boolean RemoteActionCompatParcelizer;
    public final long read;
    public final long serializer;
    public final long write;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.write, ((onBackPressedInput_delegatelambda0) obj).write);
    }

    public onBackPressedInput_delegatelambda0(long j, long j2, long j3, long j4, boolean z, boolean z2, long j5) {
        this.RatingCompat = j;
        this.write = j2;
        this.IconCompatParcelizer = j3;
        this.read = j4;
        this.MediaBrowserCompatMediaItem = z;
        this.RemoteActionCompatParcelizer = z2;
        this.serializer = j5;
    }

    public onBackPressedInput_delegatelambda0(long j) {
        this(j, j, 0L, 0L, false, false, 0L);
    }
}
