package io.sentry.rrweb;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class IconCompatParcelizer {
    public RemoteActionCompatParcelizer PlaybackStateCompat;
    public long PlaybackStateCompatCustomAction = System.currentTimeMillis();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.PlaybackStateCompat, Long.valueOf(this.PlaybackStateCompatCustomAction)});
    }

    public IconCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.PlaybackStateCompat = remoteActionCompatParcelizer;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IconCompatParcelizer)) {
            return false;
        }
        IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
        return this.PlaybackStateCompatCustomAction == iconCompatParcelizer.PlaybackStateCompatCustomAction && this.PlaybackStateCompat == iconCompatParcelizer.PlaybackStateCompat;
    }
}
