package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class updateValuesIJZedt4animation_core {
    public final int MediaBrowserCompatMediaItem;
    public final int MediaSessionCompatQueueItem;
    public final int RatingCompat;
    public static final updateValuesIJZedt4animation_core IconCompatParcelizer = new updateValuesIJZedt4animation_core(0, 0, 0);
    public static final updateValuesIJZedt4animation_core write = new updateValuesIJZedt4animation_core(1, 3, 2);
    public static final updateValuesIJZedt4animation_core serializer = new updateValuesIJZedt4animation_core(1, 3, 1);
    public static final updateValuesIJZedt4animation_core read = new updateValuesIJZedt4animation_core(6, 7, 1);
    public static final updateValuesIJZedt4animation_core RemoteActionCompatParcelizer = new updateValuesIJZedt4animation_core(6, 6, 1);

    public updateValuesIJZedt4animation_core(int i, int i2, int i3) {
        this.MediaSessionCompatQueueItem = i;
        this.RatingCompat = i2;
        this.MediaBrowserCompatMediaItem = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof updateValuesIJZedt4animation_core)) {
            return false;
        }
        updateValuesIJZedt4animation_core updatevaluesijzedt4animation_core = (updateValuesIJZedt4animation_core) obj;
        return this.MediaSessionCompatQueueItem == updatevaluesijzedt4animation_core.MediaSessionCompatQueueItem && this.RatingCompat == updatevaluesijzedt4animation_core.RatingCompat && this.MediaBrowserCompatMediaItem == updatevaluesijzedt4animation_core.MediaBrowserCompatMediaItem;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderDataSpace{standard=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", transfer=");
        sb.append(this.RatingCompat);
        sb.append(", range=");
        return af$$ExternalSyntheticOutline0.m(this.MediaBrowserCompatMediaItem, "}", sb);
    }

    public final int hashCode() {
        int i = this.MediaSessionCompatQueueItem;
        return ((((i ^ 1000003) * 1000003) ^ this.RatingCompat) * 1000003) ^ this.MediaBrowserCompatMediaItem;
    }
}
