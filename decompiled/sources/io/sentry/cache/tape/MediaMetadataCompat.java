package io.sentry.cache.tape;

import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.util.Iterator;
import o.PlatformMagnifierFactoryApi29Impl;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaMetadataCompat implements Iterator {
    public final /* synthetic */ MediaSessionCompatQueueItem IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public long read;
    public int write = 0;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        MediaSessionCompatQueueItem mediaSessionCompatQueueItem = this.IconCompatParcelizer;
        if (mediaSessionCompatQueueItem.write) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return false;
        }
        if (mediaSessionCompatQueueItem.MediaSessionCompatQueueItem == this.RemoteActionCompatParcelizer) {
            return this.write != mediaSessionCompatQueueItem.IconCompatParcelizer;
        }
        PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() throws IOException {
        byte[] bArr = MediaSessionCompatQueueItem.read;
        MediaSessionCompatQueueItem mediaSessionCompatQueueItem = this.IconCompatParcelizer;
        if (mediaSessionCompatQueueItem.write) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return null;
        }
        if (mediaSessionCompatQueueItem.MediaSessionCompatQueueItem != this.RemoteActionCompatParcelizer) {
            PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
            return null;
        }
        int i = mediaSessionCompatQueueItem.IconCompatParcelizer;
        if (i == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        if (this.write >= i) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        try {
            MediaBrowserCompatMediaItem mediaBrowserCompatMediaItemRemoteActionCompatParcelizer = mediaSessionCompatQueueItem.RemoteActionCompatParcelizer(this.read);
            int i2 = mediaBrowserCompatMediaItemRemoteActionCompatParcelizer.write;
            long j = mediaBrowserCompatMediaItemRemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
            byte[] bArr2 = new byte[i2];
            long j2 = j + 4;
            long jWrite = mediaSessionCompatQueueItem.write(j2);
            this.read = jWrite;
            if (!mediaSessionCompatQueueItem.write(i2, jWrite, bArr2)) {
                this.write = mediaSessionCompatQueueItem.IconCompatParcelizer;
                return bArr;
            }
            this.read = mediaSessionCompatQueueItem.write(j2 + ((long) i2));
            this.write++;
            return bArr2;
        } catch (IOException e) {
            throw e;
        } catch (OutOfMemoryError unused) {
            mediaSessionCompatQueueItem.IconCompatParcelizer();
            this.write = mediaSessionCompatQueueItem.IconCompatParcelizer;
            return bArr;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        MediaSessionCompatQueueItem mediaSessionCompatQueueItem = this.IconCompatParcelizer;
        if (mediaSessionCompatQueueItem.MediaSessionCompatQueueItem != this.RemoteActionCompatParcelizer) {
            PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
            return;
        }
        if (mediaSessionCompatQueueItem.IconCompatParcelizer == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
        } else {
            if (this.write != 1) {
                IBraze$$ExternalSyntheticBUOutline0.m("Removal is only permitted from the head.");
                return;
            }
            mediaSessionCompatQueueItem.RemoteActionCompatParcelizer(1);
            this.RemoteActionCompatParcelizer = mediaSessionCompatQueueItem.MediaSessionCompatQueueItem;
            this.write--;
        }
    }

    public MediaMetadataCompat(MediaSessionCompatQueueItem mediaSessionCompatQueueItem) {
        this.IconCompatParcelizer = mediaSessionCompatQueueItem;
        this.read = mediaSessionCompatQueueItem.RatingCompat.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = mediaSessionCompatQueueItem.MediaSessionCompatQueueItem;
    }
}
