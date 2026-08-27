package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class closeInAppMessageOnKeycodeBack {
    public long[] PlaybackStateCompat = new long[8];
    public int ParcelableVolumeInfo = -1;

    public final long RemoteActionCompatParcelizer() {
        int i = this.ParcelableVolumeInfo;
        if (i < 0) {
            DrawableTransformation.serializer("No tag in stack for requested element");
            return 0L;
        }
        long[] jArr = this.PlaybackStateCompat;
        this.ParcelableVolumeInfo = i - 1;
        return jArr[i];
    }

    public final void MediaBrowserCompatMediaItem(long j) {
        if (j == 19500) {
            return;
        }
        int i = this.ParcelableVolumeInfo + 1;
        this.ParcelableVolumeInfo = i;
        long[] jArr = this.PlaybackStateCompat;
        if (i >= jArr.length) {
            this.PlaybackStateCompat = Arrays.copyOf(jArr, jArr.length * 2);
        }
        this.PlaybackStateCompat[i] = j;
    }

    public final long read() {
        int i = this.ParcelableVolumeInfo;
        if (i == -1) {
            return 19500L;
        }
        long[] jArr = this.PlaybackStateCompat;
        this.ParcelableVolumeInfo = i - 1;
        return jArr[i];
    }

    public final long serializer() {
        int i = this.ParcelableVolumeInfo;
        if (i == -1) {
            return 19500L;
        }
        return this.PlaybackStateCompat[i];
    }
}
