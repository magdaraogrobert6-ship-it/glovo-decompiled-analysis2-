package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.deeplink.analytics.PushAnalyticsData;
import com.roadrunner.push.event.PushDeepLink;

/* JADX INFO: loaded from: classes3.dex */
public final class access900 {
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    private static int MediaSessionCompatToken;
    public final PushAnalyticsData IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final boolean MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final String ParcelableVolumeInfo;
    public final boolean PlaybackStateCompat;
    public final String PlaybackStateCompatCustomAction;
    public final String RatingCompat;
    public final boolean RemoteActionCompatParcelizer;
    public final PushDeepLink read;
    public final boolean serializer;
    public final boolean write;

    public static /* synthetic */ Object read(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~((~i5) | i | i2);
        int i8 = ~((~i) | i5);
        int i9 = ~i2;
        int i10 = i8 | (~(i9 | i5));
        int i11 = ~(i9 | i);
        int i12 = i5 + i + i4 + ((-1568348280) * i3) + (1617068012 * i6);
        int i13 = i12 * i12;
        int i14 = (((-430874860) * i5) - 739508224) + (1544986862 * i) + (i7 * 987930861) + ((-987930861) * i10) + (987930861 * i11) + (557056000 * i4) + ((-1885339648) * i3) + (1743781888 * i6) + (858456064 * i13);
        int i15 = (i5 * (-973781596)) + 539565670 + (i * (-973779706)) + (i7 * 945) + (i10 * (-945)) + (i11 * 945) + (i4 * (-973780651)) + (i3 * 424585256) + (i6 * 537576796) + (i13 * 1078394880);
        int i16 = i14 + (i15 * i15 * 192741376);
        if (i16 != 1) {
            return i16 != 2 ? RemoteActionCompatParcelizer(objArr) : write(objArr);
        }
        return read(objArr);
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        access900 access900Var = (access900) objArr[0];
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 21;
        MediaSessionCompatToken = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return Boolean.valueOf(access900Var.RemoteActionCompatParcelizer);
        }
        boolean z = access900Var.RemoteActionCompatParcelizer;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 115;
        MediaSessionCompatResultReceiverWrapper = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.RatingCompat;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 37;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatResultReceiverWrapper = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.serializer;
        int i4 = i3 + 91;
        MediaSessionCompatToken = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return z;
    }

    public final boolean MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 9;
        MediaSessionCompatResultReceiverWrapper = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        boolean z = this.PlaybackStateCompat;
        int i5 = i2 + 41;
        MediaSessionCompatResultReceiverWrapper = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return z;
    }

    public final String MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 47;
        MediaSessionCompatResultReceiverWrapper = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.PlaybackStateCompatCustomAction;
        int i5 = i2 + 9;
        MediaSessionCompatResultReceiverWrapper = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 101;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatResultReceiverWrapper = i3;
        int i4 = i2 % 2;
        String str = this.MediaDescriptionCompat;
        int i5 = i3 + 101;
        MediaSessionCompatToken = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 50 / 0;
        }
        return str;
    }

    public final boolean PlaybackStateCompat() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 93;
        MediaSessionCompatResultReceiverWrapper = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.write;
        }
        throw null;
    }

    public final boolean PlaybackStateCompatCustomAction() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 101;
        MediaSessionCompatResultReceiverWrapper = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        boolean z = this.MediaMetadataCompat;
        int i5 = i2 + 95;
        MediaSessionCompatResultReceiverWrapper = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return z;
    }

    public final String RatingCompat() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 13;
        MediaSessionCompatToken = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.ParcelableVolumeInfo;
        }
        throw null;
    }

    public final PushAnalyticsData RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper;
        int i3 = i2 + 61;
        MediaSessionCompatToken = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        PushAnalyticsData pushAnalyticsData = this.IconCompatParcelizer;
        int i4 = i2 + 123;
        MediaSessionCompatToken = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return pushAnalyticsData;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 13;
        MediaSessionCompatResultReceiverWrapper = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.MediaBrowserCompatMediaItem;
        int i5 = i2 + 21;
        MediaSessionCompatResultReceiverWrapper = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 59;
        MediaSessionCompatResultReceiverWrapper = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.MediaSessionCompatQueueItem;
        int i4 = i2 + 37;
        MediaSessionCompatResultReceiverWrapper = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final PushDeepLink write() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper;
        int i3 = i2 + 81;
        MediaSessionCompatToken = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        PushDeepLink pushDeepLink = this.read;
        int i5 = i2 + 65;
        MediaSessionCompatToken = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return pushDeepLink;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public access900(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, PushDeepLink pushDeepLink, String str3, String str4, String str5, PushAnalyticsData pushAnalyticsData, boolean z5, String str6) {
        str.getClass();
        str2.getClass();
        this.PlaybackStateCompatCustomAction = str;
        this.RatingCompat = str2;
        this.MediaMetadataCompat = z;
        this.RemoteActionCompatParcelizer = z2;
        this.serializer = z3;
        this.write = z4;
        this.read = pushDeepLink;
        this.MediaSessionCompatQueueItem = str3;
        this.MediaBrowserCompatMediaItem = str4;
        this.MediaDescriptionCompat = str5;
        this.IconCompatParcelizer = pushAnalyticsData;
        this.PlaybackStateCompat = z5;
        this.ParcelableVolumeInfo = str6;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        access900 access900Var = (access900) objArr[0];
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 107;
        MediaSessionCompatToken = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("DialogMessageRequestEvent(title=", access900Var.PlaybackStateCompatCustomAction, ", message=", access900Var.RatingCompat, ", isSyncPush=");
        af$$ExternalSyntheticOutline0.m(sbM, access900Var.MediaMetadataCompat, ", isNewDeliveryPush=", access900Var.RemoteActionCompatParcelizer, ", isBackToBackDeliveryPush=");
        af$$ExternalSyntheticOutline0.m(sbM, access900Var.serializer, ", isPaymentDone=", access900Var.write, ", deepLink=");
        sbM.append(access900Var.read);
        sbM.append(", newDeliveryId=");
        sbM.append(access900Var.MediaSessionCompatQueueItem);
        sbM.append(", messageId=");
        c8$$ExternalSyntheticOutline0.m(sbM, access900Var.MediaBrowserCompatMediaItem, ", pushCategory=", access900Var.MediaDescriptionCompat, ", analyticsData=");
        sbM.append(access900Var.IconCompatParcelizer);
        sbM.append(", shouldShowDialog=");
        sbM.append(access900Var.PlaybackStateCompat);
        sbM.append(", sourceTrigger=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, access900Var.ParcelableVolumeInfo, ")");
        int i4 = MediaSessionCompatToken + 109;
        MediaSessionCompatResultReceiverWrapper = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
        return strM;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5 = 0;
        access900 access900Var = (access900) objArr[0];
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 39;
        MediaSessionCompatToken = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(access900Var.PlaybackStateCompatCustomAction.hashCode() * 31, 31, access900Var.RatingCompat), 31, access900Var.MediaMetadataCompat), 31, access900Var.RemoteActionCompatParcelizer), 31, access900Var.serializer), 31, access900Var.write);
        PushDeepLink pushDeepLink = access900Var.read;
        if (pushDeepLink == null) {
            int i4 = MediaSessionCompatToken + 1;
            MediaSessionCompatResultReceiverWrapper = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = pushDeepLink.hashCode();
        }
        String str = access900Var.MediaSessionCompatQueueItem;
        if (str == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = str.hashCode();
            int i6 = MediaSessionCompatResultReceiverWrapper + 45;
            MediaSessionCompatToken = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        String str2 = access900Var.MediaBrowserCompatMediaItem;
        if (str2 == null) {
            int i8 = MediaSessionCompatToken + 109;
            MediaSessionCompatResultReceiverWrapper = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str2.hashCode();
        }
        String str3 = access900Var.MediaDescriptionCompat;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        PushAnalyticsData pushAnalyticsData = access900Var.IconCompatParcelizer;
        if (pushAnalyticsData == null) {
            int i10 = MediaSessionCompatResultReceiverWrapper + 59;
            MediaSessionCompatToken = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = pushAnalyticsData.hashCode();
        }
        int iM2 = d$$ExternalSyntheticOutline0.m((((((((((iM + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode6) * 31) + iHashCode4) * 31, 31, access900Var.PlaybackStateCompat);
        String str4 = access900Var.ParcelableVolumeInfo;
        if (str4 != null) {
            iHashCode5 = str4.hashCode();
            int i12 = MediaSessionCompatResultReceiverWrapper + 23;
            MediaSessionCompatToken = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                int i13 = 4 % 2;
            }
        }
        return Integer.valueOf(iM2 + iHashCode5);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof access900)) {
                return false;
            }
            access900 access900Var = (access900) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.PlaybackStateCompatCustomAction, access900Var.PlaybackStateCompatCustomAction}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RatingCompat, access900Var.RatingCompat}, getCieXyz.write())).booleanValue() || this.MediaMetadataCompat != access900Var.MediaMetadataCompat) {
                return false;
            }
            if (this.RemoteActionCompatParcelizer == access900Var.RemoteActionCompatParcelizer) {
                if (this.serializer != access900Var.serializer) {
                    int i2 = MediaSessionCompatToken + 9;
                    MediaSessionCompatResultReceiverWrapper = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return false;
                }
                if (this.write != access900Var.write) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, access900Var.read}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, access900Var.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue()) {
                    int i4 = MediaSessionCompatResultReceiverWrapper + 65;
                    MediaSessionCompatToken = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        return false;
                    }
                    throw null;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, access900Var.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue()) {
                    int i5 = MediaSessionCompatToken + 119;
                    MediaSessionCompatResultReceiverWrapper = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaDescriptionCompat, access900Var.MediaDescriptionCompat}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, access900Var.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (this.PlaybackStateCompat != access900Var.PlaybackStateCompat) {
                        int i7 = MediaSessionCompatToken + 83;
                        MediaSessionCompatResultReceiverWrapper = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                        return false;
                    }
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.ParcelableVolumeInfo, access900Var.ParcelableVolumeInfo}, getCieXyz.write())).booleanValue();
                }
                int i9 = MediaSessionCompatResultReceiverWrapper + 109;
                MediaSessionCompatToken = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return false;
            }
            int i11 = MediaSessionCompatToken + 47;
            MediaSessionCompatResultReceiverWrapper = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i11 % 2 == 0;
        }
        int i12 = MediaSessionCompatResultReceiverWrapper + 3;
        MediaSessionCompatToken = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return true;
    }

    public final String toString() {
        return (String) read(1857570122, new Object[]{this}, PackageHandler7.read(), PackageHandler7.read(), PackageHandler7.read(), -1857570120, PackageHandler7.read());
    }

    public final boolean MediaSessionCompatToken() {
        return ((Boolean) read(42385299, new Object[]{this}, PackageHandler7.read(), PackageHandler7.read(), PackageHandler7.read(), -42385298, PackageHandler7.read())).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) read(36816942, new Object[]{this}, PackageHandler7.read(), PackageHandler7.read(), PackageHandler7.read(), -36816942, PackageHandler7.read())).intValue();
    }
}
