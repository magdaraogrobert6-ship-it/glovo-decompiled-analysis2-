package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class remeasureLookaheadRootsInSubtree extends getDuringAlignmentLinesQueryui {
    public String IconCompatParcelizer;
    public String MediaBrowserCompatMediaItem;
    public long MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public byte MediaSessionCompatQueueItem;
    public boolean RatingCompat;
    public int RemoteActionCompatParcelizer;
    public int read;
    public String serializer;
    public long write;

    public final requestLookaheadRelayoutdefault read() {
        String str;
        String str2;
        String str3;
        if (this.MediaSessionCompatQueueItem == 63 && (str = this.IconCompatParcelizer) != null && (str2 = this.serializer) != null && (str3 = this.MediaBrowserCompatMediaItem) != null) {
            return new requestLookaheadRelayoutdefault(this.read, str, this.RemoteActionCompatParcelizer, this.MediaDescriptionCompat, this.write, this.RatingCompat, this.MediaMetadataCompat, str2, str3);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.MediaSessionCompatQueueItem & 1) == 0) {
            sb.append(" arch");
        }
        if (this.IconCompatParcelizer == null) {
            sb.append(" model");
        }
        if ((this.MediaSessionCompatQueueItem & 2) == 0) {
            sb.append(" cores");
        }
        if ((this.MediaSessionCompatQueueItem & 4) == 0) {
            sb.append(" ram");
        }
        if ((this.MediaSessionCompatQueueItem & 8) == 0) {
            sb.append(" diskSpace");
        }
        if ((this.MediaSessionCompatQueueItem & 16) == 0) {
            sb.append(" simulator");
        }
        if ((this.MediaSessionCompatQueueItem & 32) == 0) {
            sb.append(" state");
        }
        if (this.serializer == null) {
            sb.append(" manufacturer");
        }
        if (this.MediaBrowserCompatMediaItem == null) {
            sb.append(" modelClass");
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
        return null;
    }
}
