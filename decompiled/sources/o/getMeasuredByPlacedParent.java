package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getMeasuredByPlacedParent extends traceMeasureLayoutIf {
    public int IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public String MediaDescriptionCompat;
    public byte MediaMetadataCompat;
    public long MediaSessionCompatQueueItem;
    public long RatingCompat;
    public long RemoteActionCompatParcelizer;
    public String read;
    public int serializer;
    public List write;

    public final getMeasuredByPlacedParent RemoteActionCompatParcelizer(String str) {
        this.MediaDescriptionCompat = str;
        return this;
    }

    public final getMeasuredByPlacedParent RemoteActionCompatParcelizer(List list) {
        this.write = list;
        return this;
    }

    public final getMeasuredByPlacedParent IconCompatParcelizer(long j) {
        this.RatingCompat = j;
        this.MediaMetadataCompat = (byte) (this.MediaMetadataCompat | 16);
        return this;
    }

    public final getMeasuredByPlacedParent RemoteActionCompatParcelizer(int i) {
        this.MediaBrowserCompatMediaItem = i;
        this.MediaMetadataCompat = (byte) (this.MediaMetadataCompat | 2);
        return this;
    }

    public final getMeasuredByPlacedParent RemoteActionCompatParcelizer(long j) {
        this.RemoteActionCompatParcelizer = j;
        this.MediaMetadataCompat = (byte) (this.MediaMetadataCompat | 8);
        return this;
    }

    public final getMeasuredByPlacedParent read(int i) {
        this.IconCompatParcelizer = i;
        this.MediaMetadataCompat = (byte) (this.MediaMetadataCompat | 4);
        return this;
    }

    public final getMeasuredByPlacedParent write(int i) {
        this.serializer = i;
        this.MediaMetadataCompat = (byte) (this.MediaMetadataCompat | 1);
        return this;
    }

    public final getMeasuredByPlacedParent write(long j) {
        this.MediaSessionCompatQueueItem = j;
        this.MediaMetadataCompat = (byte) (this.MediaMetadataCompat | 32);
        return this;
    }

    public final getMeasuredByPlacedParent write(String str) {
        if (str != null) {
            this.read = str;
            return this;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null processName");
        return null;
    }

    public final getLookaheadRemeasureCanAffectParentSize read() {
        String str;
        if (this.MediaMetadataCompat == 63 && (str = this.read) != null) {
            return new getLookaheadRemeasureCanAffectParentSize(this.serializer, str, this.MediaBrowserCompatMediaItem, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.RatingCompat, this.MediaSessionCompatQueueItem, this.MediaDescriptionCompat, this.write);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.MediaMetadataCompat & 1) == 0) {
            sb.append(" pid");
        }
        if (this.read == null) {
            sb.append(" processName");
        }
        if ((this.MediaMetadataCompat & 2) == 0) {
            sb.append(" reasonCode");
        }
        if ((this.MediaMetadataCompat & 4) == 0) {
            sb.append(" importance");
        }
        if ((this.MediaMetadataCompat & 8) == 0) {
            sb.append(" pss");
        }
        if ((this.MediaMetadataCompat & 16) == 0) {
            sb.append(" rss");
        }
        if ((this.MediaMetadataCompat & 32) == 0) {
            sb.append(" timestamp");
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
        return null;
    }
}
