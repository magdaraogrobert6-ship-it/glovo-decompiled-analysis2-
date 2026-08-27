package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetComposeViewscp {
    public String IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public String MediaDescriptionCompat;
    public long MediaMetadataCompat;
    public String MediaSessionCompatQueueItem;
    public String MediaSessionCompatResultReceiverWrapper;
    public int MediaSessionCompatToken;
    public accessgetComposeAccessibilityDelegatep PlaybackStateCompat;
    public accessgetDispatchOnScrollChangedMethodcp RatingCompat;
    public String RemoteActionCompatParcelizer;
    public String read;
    public String serializer;
    public accessgetGetBooleanMethodcp write;

    public final void IconCompatParcelizer(int i) {
        this.MediaBrowserCompatMediaItem = i;
    }

    public final void IconCompatParcelizer(String str) {
        this.IconCompatParcelizer = str;
    }

    public final void IconCompatParcelizer(accessgetDispatchOnScrollChangedMethodcp accessgetdispatchonscrollchangedmethodcp) {
        this.RatingCompat = accessgetdispatchonscrollchangedmethodcp;
    }

    public final void MediaDescriptionCompat(String str) {
        this.MediaSessionCompatResultReceiverWrapper = str;
    }

    public final void MediaSessionCompatQueueItem(String str) {
        this.MediaDescriptionCompat = str;
    }

    public final void RemoteActionCompatParcelizer(String str) {
        this.RemoteActionCompatParcelizer = str;
    }

    public final void RemoteActionCompatParcelizer(accessgetComposeAccessibilityDelegatep accessgetcomposeaccessibilitydelegatep) {
        this.PlaybackStateCompat = accessgetcomposeaccessibilitydelegatep;
    }

    public final void RemoteActionCompatParcelizer(accessgetGetBooleanMethodcp accessgetgetbooleanmethodcp) {
        this.write = accessgetgetbooleanmethodcp;
    }

    public final void read(String str) {
        this.read = str;
    }

    public final void serializer(int i) {
        this.MediaSessionCompatToken = i;
    }

    public final void serializer(long j) {
        this.MediaMetadataCompat = j;
    }

    public final void serializer(String str) {
        this.MediaSessionCompatQueueItem = str;
    }

    public final void write(String str) {
        this.serializer = str;
    }

    public final accessdispatchKeyEvents408734394 read() {
        return new accessdispatchKeyEvents408734394(this.MediaMetadataCompat, this.MediaSessionCompatQueueItem, this.IconCompatParcelizer, this.RatingCompat, this.PlaybackStateCompat, this.MediaDescriptionCompat, this.read, this.MediaBrowserCompatMediaItem, this.MediaSessionCompatToken, this.MediaSessionCompatResultReceiverWrapper, this.write, this.serializer, this.RemoteActionCompatParcelizer);
    }
}
