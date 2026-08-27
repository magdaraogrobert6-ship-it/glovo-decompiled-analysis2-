package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.deeplink.analytics.PushAnalyticsData;
import com.roadrunner.push.event.PushDeepLink;

/* JADX INFO: loaded from: classes3.dex */
public final class checkForInstallReferrerInfo extends AwaitFirstLayoutModifier {
    private static int ParcelableVolumeInfo = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public final String IconCompatParcelizer;
    public final maybeSendPoolingContainerAttach MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final boolean MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final String RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final PushDeepLink read;
    public final String serializer;
    public final PushAnalyticsData write;

    public checkForInstallReferrerInfo(String str, String str2, String str3, String str4, String str5, boolean z, String str6, PushDeepLink pushDeepLink, maybeSendPoolingContainerAttach maybesendpoolingcontainerattach, PushAnalyticsData pushAnalyticsData) {
        this.IconCompatParcelizer = str;
        this.MediaDescriptionCompat = str2;
        this.MediaSessionCompatQueueItem = str3;
        this.RemoteActionCompatParcelizer = str4;
        this.serializer = str5;
        this.MediaMetadataCompat = z;
        this.RatingCompat = str6;
        this.read = pushDeepLink;
        this.MediaBrowserCompatMediaItem = maybesendpoolingcontainerattach;
        this.write = pushAnalyticsData;
    }

    public static checkForInstallReferrerInfo write(checkForInstallReferrerInfo checkforinstallreferrerinfo, int i) {
        PushDeepLink pushDeepLink;
        maybeSendPoolingContainerAttach maybesendpoolingcontainerattach;
        int i2 = 2 % 2;
        String str = checkforinstallreferrerinfo.IconCompatParcelizer;
        String str2 = checkforinstallreferrerinfo.MediaDescriptionCompat;
        String str3 = checkforinstallreferrerinfo.MediaSessionCompatQueueItem;
        String str4 = checkforinstallreferrerinfo.RemoteActionCompatParcelizer;
        String str5 = checkforinstallreferrerinfo.serializer;
        boolean z = checkforinstallreferrerinfo.MediaMetadataCompat;
        String str6 = checkforinstallreferrerinfo.RatingCompat;
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0) {
            PushDeepLink pushDeepLink2 = checkforinstallreferrerinfo.read;
            int i3 = PlaybackStateCompatCustomAction + 9;
            ParcelableVolumeInfo = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 3 / 3;
            }
            pushDeepLink = pushDeepLink2;
        } else {
            pushDeepLink = null;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationX) != 0) {
            int i5 = ParcelableVolumeInfo + 25;
            int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            PlaybackStateCompatCustomAction = i6;
            int i7 = i5 % 2;
            maybeSendPoolingContainerAttach maybesendpoolingcontainerattach2 = checkforinstallreferrerinfo.MediaBrowserCompatMediaItem;
            int i8 = i6 + 19;
            ParcelableVolumeInfo = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            maybesendpoolingcontainerattach = maybesendpoolingcontainerattach2;
        } else {
            maybesendpoolingcontainerattach = null;
        }
        return new checkForInstallReferrerInfo(str, str2, str3, str4, str5, z, str6, pushDeepLink, maybesendpoolingcontainerattach, checkforinstallreferrerinfo.write);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 103;
        ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Hurrier(deliveryId=", this.IconCompatParcelizer, ", messageId=", this.MediaDescriptionCompat, ", messageNewId=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.MediaSessionCompatQueueItem, ", event=", this.RemoteActionCompatParcelizer, ", category=");
        SweepGradientShader9KIMszodefault.IconCompatParcelizer(this.serializer, ", receiptEnabled=", ", metadata=", sbM, this.MediaMetadataCompat);
        sbM.append(this.RatingCompat);
        sbM.append(", deepLink=");
        sbM.append(this.read);
        sbM.append(", inAppMessageData=");
        sbM.append(this.MediaBrowserCompatMediaItem);
        sbM.append(", analyticsData=");
        sbM.append(this.write);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = PlaybackStateCompatCustomAction + 11;
        ParcelableVolumeInfo = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public final int hashCode() {
        String str;
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 23;
        ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode3 = (i2 % 2 == 0 ? (str = this.IconCompatParcelizer) != null : (str = this.IconCompatParcelizer) != null) ? str.hashCode() : 0;
        String str2 = this.MediaDescriptionCompat;
        if (str2 == null) {
            int i3 = PlaybackStateCompatCustomAction + 19;
            ParcelableVolumeInfo = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.MediaSessionCompatQueueItem;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.RemoteActionCompatParcelizer;
        if (str4 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = str4.hashCode();
            int i5 = ParcelableVolumeInfo + 79;
            PlaybackStateCompatCustomAction = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        String str5 = this.serializer;
        int iM = d$$ExternalSyntheticOutline0.m(((((((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode4) * 31) + iHashCode2) * 31) + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.MediaMetadataCompat);
        String str6 = this.RatingCompat;
        int iHashCode5 = str6 == null ? 0 : str6.hashCode();
        PushDeepLink pushDeepLink = this.read;
        int iHashCode6 = pushDeepLink == null ? 0 : pushDeepLink.hashCode();
        maybeSendPoolingContainerAttach maybesendpoolingcontainerattach = this.MediaBrowserCompatMediaItem;
        int iHashCode7 = maybesendpoolingcontainerattach == null ? 0 : maybesendpoolingcontainerattach.hashCode();
        PushAnalyticsData pushAnalyticsData = this.write;
        return ((((((iM + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (pushAnalyticsData != null ? pushAnalyticsData.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof checkForInstallReferrerInfo) {
            checkForInstallReferrerInfo checkforinstallreferrerinfo = (checkForInstallReferrerInfo) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, checkforinstallreferrerinfo.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaDescriptionCompat, checkforinstallreferrerinfo.MediaDescriptionCompat}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, checkforinstallreferrerinfo.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, checkforinstallreferrerinfo.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                Object obj2 = null;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, checkforinstallreferrerinfo.serializer}, getCieXyz.write())).booleanValue()) {
                    if (this.MediaMetadataCompat == checkforinstallreferrerinfo.MediaMetadataCompat) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RatingCompat, checkforinstallreferrerinfo.RatingCompat}, getCieXyz.write())).booleanValue()) {
                            int i2 = ParcelableVolumeInfo + 71;
                            PlaybackStateCompatCustomAction = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i3 = i2 % 2;
                            return false;
                        }
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, checkforinstallreferrerinfo.read}, getCieXyz.write())).booleanValue()) {
                            int i4 = PlaybackStateCompatCustomAction + 27;
                            ParcelableVolumeInfo = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i4 % 2 == 0) {
                                return false;
                            }
                            throw null;
                        }
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, checkforinstallreferrerinfo.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue()) {
                            return false;
                        }
                        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, checkforinstallreferrerinfo.write}, getCieXyz.write())).booleanValue();
                    }
                    int i5 = PlaybackStateCompatCustomAction + 13;
                    ParcelableVolumeInfo = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    return false;
                }
                int i7 = PlaybackStateCompatCustomAction + 63;
                ParcelableVolumeInfo = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    return false;
                }
                obj2.hashCode();
                throw null;
            }
            int i8 = PlaybackStateCompatCustomAction + 27;
            ParcelableVolumeInfo = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        int i10 = ParcelableVolumeInfo + 17;
        PlaybackStateCompatCustomAction = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i10 % 2 == 0;
    }
}
