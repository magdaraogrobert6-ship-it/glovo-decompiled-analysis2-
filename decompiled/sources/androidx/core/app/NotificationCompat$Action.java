package androidx.core.app;

import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import o.getEnterdhqQ8s;
import o.invalidateNodes;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationCompat$Action {
    public final PendingIntent IconCompatParcelizer;
    public final CharSequence MediaBrowserCompatMediaItem;
    public final invalidateNodes[] MediaMetadataCompat;
    public final boolean MediaSessionCompatQueueItem;
    public final int RemoteActionCompatParcelizer;
    public IconCompat read;
    public final boolean serializer;
    public final Bundle write;

    public NotificationCompat$Action(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, invalidateNodes[] invalidatenodesArr, boolean z, boolean z2) {
        this.MediaSessionCompatQueueItem = true;
        this.read = iconCompat;
        if (iconCompat != null) {
            int i = iconCompat.PlaybackStateCompatCustomAction;
            if ((i == -1 ? ((Icon) iconCompat.IconCompatParcelizer).getType() : i) == 2) {
                this.RemoteActionCompatParcelizer = iconCompat.read();
            }
        }
        this.MediaBrowserCompatMediaItem = getEnterdhqQ8s.serializer(charSequence);
        this.IconCompatParcelizer = pendingIntent;
        this.write = bundle == null ? new Bundle() : bundle;
        this.MediaMetadataCompat = invalidatenodesArr;
        this.serializer = z;
        this.MediaSessionCompatQueueItem = z2;
    }
}
