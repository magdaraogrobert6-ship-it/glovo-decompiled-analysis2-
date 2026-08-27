package io.sentry.android.replay.viewhierarchy;

import android.graphics.Rect;
import io.sentry.android.replay.util.RatingCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaSessionCompatQueueItem extends IconCompatParcelizer {
    public final RatingCompat MediaBrowserCompatMediaItem;
    public final int MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public final Integer MediaSessionCompatQueueItem;

    public MediaSessionCompatQueueItem(RatingCompat ratingCompat, Integer num, int i, int i2, int i3, int i4, float f, IconCompatParcelizer iconCompatParcelizer, boolean z, Rect rect) {
        super(i3, i4, f, iconCompatParcelizer, z, rect);
        this.MediaBrowserCompatMediaItem = ratingCompat;
        this.MediaSessionCompatQueueItem = num;
        this.MediaDescriptionCompat = i;
        this.MediaMetadataCompat = i2;
    }
}
