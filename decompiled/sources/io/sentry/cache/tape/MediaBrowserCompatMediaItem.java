package io.sentry.cache.tape;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaBrowserCompatMediaItem {
    public static final MediaBrowserCompatMediaItem read = new MediaBrowserCompatMediaItem(0, 0);
    public final long RemoteActionCompatParcelizer;
    public final int write;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MediaBrowserCompatMediaItem.class.getSimpleName());
        sb.append("[position=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", length=");
        return af$$ExternalSyntheticOutline0.m(this.write, "]", sb);
    }

    public MediaBrowserCompatMediaItem(long j, int i) {
        this.RemoteActionCompatParcelizer = j;
        this.write = i;
    }
}
