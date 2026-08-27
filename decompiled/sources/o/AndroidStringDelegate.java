package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class AndroidStringDelegate extends ActualParagraph4FmOz70 {
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    private static int PlaybackStateCompat;
    public final String IconCompatParcelizer;
    public final boolean MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final boolean MediaSessionCompatQueueItem;
    public final boolean RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final getSpanVerticalAligndo9XGgannotations serializer;
    public final String write;

    public AndroidStringDelegate(String str, String str2, String str3, boolean z, getSpanVerticalAligndo9XGgannotations getspanverticalaligndo9xggannotations, String str4, boolean z2, String str5, String str6, boolean z3) {
        str.getClass();
        str2.getClass();
        this.MediaMetadataCompat = str;
        this.write = str2;
        this.IconCompatParcelizer = str3;
        this.MediaBrowserCompatMediaItem = z;
        this.serializer = getspanverticalaligndo9xggannotations;
        this.read = str4;
        this.RatingCompat = z2;
        this.RemoteActionCompatParcelizer = str5;
        this.MediaDescriptionCompat = str6;
        this.MediaSessionCompatQueueItem = z3;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 11;
        PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("DestinationHeader(stateTitle=", this.MediaMetadataCompat, ", destinationTitle=", this.write, ", arrivalTime=");
        SweepGradientShader9KIMszodefault.IconCompatParcelizer(this.IconCompatParcelizer, ", shouldShowBullet=", ", phoneNumber=REDACTED, infoSummary=", sbM, this.MediaBrowserCompatMediaItem);
        SweepGradientShader9KIMszodefault.IconCompatParcelizer(this.read, ", shouldShowInfoSummary=", ", reference=", sbM, this.RatingCompat);
        c8$$ExternalSyntheticOutline0.m(sbM, this.RemoteActionCompatParcelizer, ", shortCode=", this.MediaDescriptionCompat, ", shouldShowOrderSummary=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.MediaSessionCompatQueueItem, ")");
        int i4 = PlaybackStateCompat + 91;
        MediaSessionCompatResultReceiverWrapper = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 97;
        MediaSessionCompatResultReceiverWrapper = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.MediaMetadataCompat.hashCode() * 31, 31, this.write), 31, this.IconCompatParcelizer), 31, this.MediaBrowserCompatMediaItem);
        getSpanVerticalAligndo9XGgannotations getspanverticalaligndo9xggannotations = this.serializer;
        if (getspanverticalaligndo9xggannotations == null) {
            int i4 = MediaSessionCompatResultReceiverWrapper;
            int i5 = i4 + 49;
            PlaybackStateCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i5 % 2 != 0 ? 1 : 0;
            int i6 = i4 + 23;
            PlaybackStateCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            iHashCode = getspanverticalaligndo9xggannotations.hashCode();
        }
        int iHashCode2 = Boolean.hashCode(this.MediaSessionCompatQueueItem) + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((iM + iHashCode) * 31, 31, this.read), 31, this.RatingCompat), 31, this.RemoteActionCompatParcelizer), 31, this.MediaDescriptionCompat);
        int i8 = MediaSessionCompatResultReceiverWrapper + 31;
        PlaybackStateCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            return iHashCode2;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 103;
        PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidStringDelegate)) {
            return false;
        }
        AndroidStringDelegate androidStringDelegate = (AndroidStringDelegate) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaMetadataCompat, androidStringDelegate.MediaMetadataCompat}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, androidStringDelegate.write}, getCieXyz.write())).booleanValue() || !this.IconCompatParcelizer.equals(androidStringDelegate.IconCompatParcelizer) || this.MediaBrowserCompatMediaItem != androidStringDelegate.MediaBrowserCompatMediaItem) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, androidStringDelegate.serializer}, getCieXyz.write())).booleanValue() || !this.read.equals(androidStringDelegate.read)) {
            return false;
        }
        if (this.RatingCompat != androidStringDelegate.RatingCompat) {
            int i3 = PlaybackStateCompat + 119;
            MediaSessionCompatResultReceiverWrapper = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return false;
            }
            int i4 = 5 % 4;
            return false;
        }
        if (!this.RemoteActionCompatParcelizer.equals(androidStringDelegate.RemoteActionCompatParcelizer)) {
            return false;
        }
        if (this.MediaDescriptionCompat.equals(androidStringDelegate.MediaDescriptionCompat)) {
            return this.MediaSessionCompatQueueItem == androidStringDelegate.MediaSessionCompatQueueItem;
        }
        int i5 = PlaybackStateCompat + 31;
        MediaSessionCompatResultReceiverWrapper = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return false;
        }
        int i6 = 3 % 4;
        return false;
    }
}
