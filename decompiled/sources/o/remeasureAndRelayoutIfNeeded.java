package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class remeasureAndRelayoutIfNeeded extends markSubtreeAsNotPlaced {
    public placeOuterCoordinatorMLgxB_4 IconCompatParcelizer;
    public String MediaBrowserCompatMediaItem;
    public String MediaDescriptionCompat;
    public List MediaMetadataCompat;
    public MergedViewAdapter MediaSessionCompatQueueItem;
    public long MediaSessionCompatToken;
    public isInLookaheadPass PlaybackStateCompat;
    public byte PlaybackStateCompatCustomAction;
    public int RatingCompat;
    public boolean RemoteActionCompatParcelizer;
    public String read;
    public getLookaheadPassDelegate serializer;
    public Long write;

    public final performMeasureAndLayout serializer() {
        String str;
        String str2;
        getLookaheadPassDelegate getlookaheadpassdelegate;
        if (this.PlaybackStateCompatCustomAction == 7 && (str = this.MediaBrowserCompatMediaItem) != null && (str2 = this.MediaDescriptionCompat) != null && (getlookaheadpassdelegate = this.serializer) != null) {
            return new performMeasureAndLayout(str, str2, this.read, this.MediaSessionCompatToken, this.write, this.RemoteActionCompatParcelizer, getlookaheadpassdelegate, this.PlaybackStateCompat, this.MediaSessionCompatQueueItem, this.IconCompatParcelizer, this.MediaMetadataCompat, this.RatingCompat);
        }
        StringBuilder sb = new StringBuilder();
        if (this.MediaBrowserCompatMediaItem == null) {
            sb.append(" generator");
        }
        if (this.MediaDescriptionCompat == null) {
            sb.append(" identifier");
        }
        if ((this.PlaybackStateCompatCustomAction & 1) == 0) {
            sb.append(" startedAt");
        }
        if ((this.PlaybackStateCompatCustomAction & 2) == 0) {
            sb.append(" crashed");
        }
        if (this.serializer == null) {
            sb.append(" app");
        }
        if ((this.PlaybackStateCompatCustomAction & 4) == 0) {
            sb.append(" generatorType");
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
        return null;
    }
}
