package o;

import bo.app.d$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getOnEventTrackingFailedListener extends getOnDeeplinkResponseListener {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    public final boolean IconCompatParcelizer;
    public final isFbIdReadingEnabled MediaMetadataCompat;
    public final boolean RatingCompat;
    public final getDefaultTracker RemoteActionCompatParcelizer;
    public final List read;
    public final getOnSessionTrackingSucceededListener serializer;
    public final getLogger write;

    public getOnEventTrackingFailedListener(getDefaultTracker getdefaulttracker, boolean z, isFbIdReadingEnabled isfbidreadingenabled, getLogger getlogger, getOnSessionTrackingSucceededListener getonsessiontrackingsucceededlistener, boolean z2, List list) {
        getdefaulttracker.getClass();
        this.RemoteActionCompatParcelizer = getdefaulttracker;
        this.IconCompatParcelizer = z;
        this.MediaMetadataCompat = isfbidreadingenabled;
        this.write = getlogger;
        this.serializer = getonsessiontrackingsucceededlistener;
        this.RatingCompat = z2;
        this.read = list;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 111;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() * 31, 31, this.IconCompatParcelizer);
        int iHashCode = this.MediaMetadataCompat.hashCode();
        int iHashCode2 = this.write.hashCode();
        int iHashCode3 = this.read.hashCode() + d$$ExternalSyntheticOutline0.m((this.serializer.hashCode() + ((iHashCode2 + ((iHashCode + iM) * 31)) * 31)) * 31, 31, this.RatingCompat);
        int i4 = MediaDescriptionCompat + 5;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode3;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("Available(greetingState=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", shouldShowSafeTripRateHeader=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", welcomeMessageState=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", reportDetails=");
        sb.append(this.write);
        sb.append(", scores=");
        sb.append(this.serializer);
        sb.append(", showBatchCalculationMessage=");
        sb.append(this.RatingCompat);
        sb.append(", recommendations=");
        String str = MediaSessionCompatQueueItem.read(sb, this.read, ")");
        int i2 = MediaDescriptionCompat + 39;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 19 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 25;
        MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 33;
            MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } else {
            if (!(obj instanceof getOnEventTrackingFailedListener)) {
                return false;
            }
            getOnEventTrackingFailedListener getoneventtrackingfailedlistener = (getOnEventTrackingFailedListener) obj;
            Object[] objArr = {this.RemoteActionCompatParcelizer, getoneventtrackingfailedlistener.RemoteActionCompatParcelizer};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() || this.IconCompatParcelizer != getoneventtrackingfailedlistener.IconCompatParcelizer || !this.MediaMetadataCompat.equals(getoneventtrackingfailedlistener.MediaMetadataCompat) || !this.write.equals(getoneventtrackingfailedlistener.write) || !this.serializer.equals(getoneventtrackingfailedlistener.serializer)) {
                return false;
            }
            if (this.RatingCompat == getoneventtrackingfailedlistener.RatingCompat) {
                if (!this.read.equals(getoneventtrackingfailedlistener.read)) {
                    return false;
                }
            } else {
                int i7 = MediaDescriptionCompat + 87;
                MediaBrowserCompatMediaItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return false;
            }
        }
        return true;
    }
}
