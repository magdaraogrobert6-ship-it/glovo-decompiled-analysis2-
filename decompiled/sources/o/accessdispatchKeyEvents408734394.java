package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessdispatchKeyEvents408734394 {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final accessgetDispatchOnScrollChangedMethodcp MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final long MediaSessionCompatQueueItem;
    public final String MediaSessionCompatToken;
    public final int PlaybackStateCompat;
    public final accessgetComposeAccessibilityDelegatep PlaybackStateCompatCustomAction;
    public final int RatingCompat;
    public final accessgetGetBooleanMethodcp RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    static {
        accessgetDispatchOnScrollChangedMethodcp accessgetdispatchonscrollchangedmethodcp = accessgetDispatchOnScrollChangedMethodcp.UNKNOWN;
        accessgetComposeAccessibilityDelegatep accessgetcomposeaccessibilitydelegatep = accessgetComposeAccessibilityDelegatep.UNKNOWN_OS;
        accessgetGetBooleanMethodcp accessgetgetbooleanmethodcp = accessgetGetBooleanMethodcp.UNKNOWN_EVENT;
    }

    public static accessgetComposeViewscp serializer() {
        accessgetComposeViewscp accessgetcomposeviewscp = new accessgetComposeViewscp();
        accessgetcomposeviewscp.MediaMetadataCompat = 0L;
        accessgetcomposeviewscp.MediaSessionCompatQueueItem = "";
        accessgetcomposeviewscp.IconCompatParcelizer = "";
        accessgetcomposeviewscp.RatingCompat = accessgetDispatchOnScrollChangedMethodcp.UNKNOWN;
        accessgetcomposeviewscp.PlaybackStateCompat = accessgetComposeAccessibilityDelegatep.UNKNOWN_OS;
        accessgetcomposeviewscp.MediaDescriptionCompat = "";
        accessgetcomposeviewscp.read = "";
        accessgetcomposeviewscp.MediaBrowserCompatMediaItem = 0;
        accessgetcomposeviewscp.MediaSessionCompatToken = 0;
        accessgetcomposeviewscp.MediaSessionCompatResultReceiverWrapper = "";
        accessgetcomposeviewscp.write = accessgetGetBooleanMethodcp.UNKNOWN_EVENT;
        accessgetcomposeviewscp.serializer = "";
        accessgetcomposeviewscp.RemoteActionCompatParcelizer = "";
        return accessgetcomposeviewscp;
    }

    public accessdispatchKeyEvents408734394(long j, String str, String str2, accessgetDispatchOnScrollChangedMethodcp accessgetdispatchonscrollchangedmethodcp, accessgetComposeAccessibilityDelegatep accessgetcomposeaccessibilitydelegatep, String str3, String str4, int i, int i2, String str5, accessgetGetBooleanMethodcp accessgetgetbooleanmethodcp, String str6, String str7) {
        this.MediaSessionCompatQueueItem = j;
        this.MediaBrowserCompatMediaItem = str;
        this.IconCompatParcelizer = str2;
        this.MediaDescriptionCompat = accessgetdispatchonscrollchangedmethodcp;
        this.PlaybackStateCompatCustomAction = accessgetcomposeaccessibilitydelegatep;
        this.MediaMetadataCompat = str3;
        this.read = str4;
        this.RatingCompat = i;
        this.PlaybackStateCompat = i2;
        this.MediaSessionCompatToken = str5;
        this.RemoteActionCompatParcelizer = accessgetgetbooleanmethodcp;
        this.write = str6;
        this.serializer = str7;
    }
}
