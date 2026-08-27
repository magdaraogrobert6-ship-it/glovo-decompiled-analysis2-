package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class GroupComponentwrappedListener1 {
    public final long IconCompatParcelizer;
    public final long MediaBrowserCompatMediaItem;
    public final long MediaDescriptionCompat;
    public final long MediaMetadataCompat;
    public final long MediaSessionCompatQueueItem;
    public final long RatingCompat;
    public final long RemoteActionCompatParcelizer;
    public final long read;
    public final long serializer;
    public final long write;

    public final int hashCode() {
        return Long.hashCode(this.serializer) + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(Long.hashCode(this.MediaSessionCompatQueueItem) * 31, 31, this.RatingCompat), 31, this.MediaBrowserCompatMediaItem), 31, this.MediaMetadataCompat), 31, this.IconCompatParcelizer), 31, this.read), 31, this.RemoteActionCompatParcelizer), 31, this.write), 31, this.MediaDescriptionCompat);
    }

    public GroupComponentwrappedListener1(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.MediaSessionCompatQueueItem = j;
        this.RatingCompat = j2;
        this.MediaBrowserCompatMediaItem = j3;
        this.MediaMetadataCompat = j4;
        this.IconCompatParcelizer = j5;
        this.read = j6;
        this.RemoteActionCompatParcelizer = j7;
        this.write = j8;
        this.MediaDescriptionCompat = j9;
        this.serializer = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupComponentwrappedListener1)) {
            return false;
        }
        GroupComponentwrappedListener1 groupComponentwrappedListener1 = (GroupComponentwrappedListener1) obj;
        return this.MediaSessionCompatQueueItem == groupComponentwrappedListener1.MediaSessionCompatQueueItem && this.RatingCompat == groupComponentwrappedListener1.RatingCompat && this.MediaBrowserCompatMediaItem == groupComponentwrappedListener1.MediaBrowserCompatMediaItem && this.MediaMetadataCompat == groupComponentwrappedListener1.MediaMetadataCompat && this.IconCompatParcelizer == groupComponentwrappedListener1.IconCompatParcelizer && this.read == groupComponentwrappedListener1.read && this.RemoteActionCompatParcelizer == groupComponentwrappedListener1.RemoteActionCompatParcelizer && this.write == groupComponentwrappedListener1.write && this.MediaDescriptionCompat == groupComponentwrappedListener1.MediaDescriptionCompat && this.serializer == groupComponentwrappedListener1.serializer;
    }

    public final String toString() {
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(this.MediaSessionCompatQueueItem, "ScreenFrameMetric(totalFrames=", ", frozenFrames=");
        sbM.append(this.RatingCompat);
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sbM, ", frozenFramesRate=", this.MediaBrowserCompatMediaItem, ", frozenFrameRate=");
        sbM.append(this.MediaMetadataCompat);
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sbM, ", defaultSlowFrames=", this.IconCompatParcelizer, ", defaultSlowFramesRate=");
        sbM.append(this.read);
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sbM, ", defaultSlowFrameRate=", this.RemoteActionCompatParcelizer, ", dynamicSlowFrames=");
        sbM.append(this.write);
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sbM, ", dynamicSlowFramesRate=", this.MediaDescriptionCompat, ", dynamicSlowFrameRate=");
        return c8$$ExternalSyntheticOutline0.m(this.serializer, ")", sbM);
    }
}
