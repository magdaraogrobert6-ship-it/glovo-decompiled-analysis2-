package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.util.BitSet;
import org.apache.commons.compress.MemoryLimitException;

/* JADX INFO: loaded from: classes4.dex */
public final class getOrderID {
    public int IconCompatParcelizer;
    public long MediaBrowserCompatMediaItem;
    public long MediaDescriptionCompat;
    public long MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public long RemoteActionCompatParcelizer;
    public BitSet read;
    public int serializer;
    public int write;

    public final String toString() {
        StringBuilder sb = new StringBuilder("Archive with ");
        sb.append(this.serializer);
        sb.append(" entries in ");
        sb.append(this.IconCompatParcelizer);
        sb.append(" folders. Estimated size ");
        return c8$$ExternalSyntheticOutline0.m(IconCompatParcelizer() / 1024, " kB.", sb);
    }

    public final void write(int i) throws IOException {
        int i2 = this.write;
        if (i2 > 0 && this.IconCompatParcelizer == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("archive with entries but no folders");
        } else {
            if (i2 > this.MediaMetadataCompat) {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("archive doesn't contain enough substreams for entries");
                return;
            }
            long jIconCompatParcelizer = IconCompatParcelizer() / 1024;
            if (i < jIconCompatParcelizer) {
                throw new MemoryLimitException(jIconCompatParcelizer, i);
            }
        }
    }

    public final long IconCompatParcelizer() {
        int i = this.MediaSessionCompatQueueItem;
        long j = i / 8;
        int i2 = this.IconCompatParcelizer;
        long j2 = i2;
        long j3 = this.RemoteActionCompatParcelizer;
        long j4 = this.MediaBrowserCompatMediaItem;
        long j5 = this.MediaDescriptionCompat;
        int i3 = this.serializer;
        return ((i3 * 100) + (j4 * 8) + (((j5 - j4) + j2) * 8) + ((j4 - j2) * 16) + (j3 * 22) + (j2 * 30) + (((long) i) * 16) + j + ((long) ((i3 * 4) + (i * 8) + (i2 * 8)))) * 2;
    }
}
