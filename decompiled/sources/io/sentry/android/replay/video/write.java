package io.sentry.android.replay.video;

import android.media.MediaMuxer;

/* JADX INFO: loaded from: classes4.dex */
public final class write {
    public final MediaMuxer IconCompatParcelizer;
    public int RatingCompat;
    public boolean RemoteActionCompatParcelizer;
    public final long read;
    public int serializer;
    public long write;

    public write(String str, float f) {
        this.read = (long) (1000000.0f / f);
        this.IconCompatParcelizer = new MediaMuxer(str, 0);
    }
}
