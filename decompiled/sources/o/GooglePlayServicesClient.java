package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class GooglePlayServicesClient {
    private static int ComponentActivity = 0;
    private static int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 1;
    public final String IconCompatParcelizer;
    public final boolean MediaBrowserCompatMediaItem;
    public final boolean MediaDescriptionCompat;
    public final List MediaMetadataCompat;
    public final boolean MediaSessionCompatQueueItem;
    public final GooglePlayServicesClientGooglePlayServicesConnection MediaSessionCompatResultReceiverWrapper;
    public final String MediaSessionCompatToken;
    public final long ParcelableVolumeInfo;
    public final String PlaybackStateCompat;
    public final Calendar PlaybackStateCompatCustomAction;
    public final boolean RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final EventResponseData read;
    public final int serializer;
    public final long write;

    public GooglePlayServicesClient(long j, String str, String str2, int i, String str3, String str4, Calendar calendar, boolean z, boolean z2, boolean z3, boolean z4, ArrayList arrayList, GooglePlayServicesClientGooglePlayServicesConnection googlePlayServicesClientGooglePlayServicesConnection, long j2, EventResponseData eventResponseData) {
        d$$ExternalSyntheticOutline0.m(str, str2, str3, str4);
        this.write = j;
        this.PlaybackStateCompat = str;
        this.IconCompatParcelizer = str2;
        this.serializer = i;
        this.RemoteActionCompatParcelizer = str3;
        this.MediaSessionCompatToken = str4;
        this.PlaybackStateCompatCustomAction = calendar;
        this.RatingCompat = z;
        this.MediaDescriptionCompat = z2;
        this.MediaSessionCompatQueueItem = z3;
        this.MediaBrowserCompatMediaItem = z4;
        this.MediaMetadataCompat = arrayList;
        this.MediaSessionCompatResultReceiverWrapper = googlePlayServicesClientGooglePlayServicesConnection;
        this.ParcelableVolumeInfo = j2;
        this.read = eventResponseData;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.serializer, af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(Long.hashCode(this.write) * 31, 31, this.PlaybackStateCompat), 31, this.IconCompatParcelizer), 31), 31, this.RemoteActionCompatParcelizer), 31, this.MediaSessionCompatToken);
        Calendar calendar = this.PlaybackStateCompatCustomAction;
        int iHashCode4 = 0;
        if (calendar == null) {
            int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 75;
            ComponentActivity = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = calendar.hashCode();
        }
        int iM2 = d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m((iM + iHashCode) * 31, 31, this.RatingCompat), 31, this.MediaDescriptionCompat), 31, this.MediaSessionCompatQueueItem), 31, this.MediaBrowserCompatMediaItem);
        List list = this.MediaMetadataCompat;
        if (list == null) {
            int i3 = ComponentActivity + 19;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = list.hashCode();
            int i5 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 85;
            ComponentActivity = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        GooglePlayServicesClientGooglePlayServicesConnection googlePlayServicesClientGooglePlayServicesConnection = this.MediaSessionCompatResultReceiverWrapper;
        if (googlePlayServicesClientGooglePlayServicesConnection == null) {
            int i7 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 105;
            ComponentActivity = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = googlePlayServicesClientGooglePlayServicesConnection.IconCompatParcelizer.hashCode();
        }
        int iM3 = d$$ExternalSyntheticOutline0.m((((iM2 + iHashCode2) * 31) + iHashCode3) * 31, 31, this.ParcelableVolumeInfo);
        EventResponseData eventResponseData = this.read;
        if (eventResponseData != null) {
            iHashCode4 = eventResponseData.hashCode();
            int i9 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 125;
            ComponentActivity = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        return iM3 + iHashCode4;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = ComponentActivity + 43;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sb = getBitmapFromCache.read("ShiftInfo(courierId=", ", zone=", this.write, this.PlaybackStateCompat);
        sb.append(", city=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", cityId=");
        sb.append(this.serializer);
        c8$$ExternalSyntheticOutline0.m(sb, ", contractType=", this.RemoteActionCompatParcelizer, ", status=", this.MediaSessionCompatToken);
        sb.append(", statusEndingTime=");
        sb.append(this.PlaybackStateCompatCustomAction);
        sb.append(", isEndBreakAllowed=");
        sb.append(this.RatingCompat);
        sb.append(", isBreakScheduled=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", isShiftExtensionAllowed=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", isShiftExtensionRequestedByRider=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", shifts=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", startingArea=");
        sb.append(this.MediaSessionCompatResultReceiverWrapper);
        sb.append(", timestamp=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", balanceLimit=");
        sb.append(this.read);
        sb.append(")");
        String string = sb.toString();
        int i4 = ComponentActivity + 71;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof GooglePlayServicesClient)) {
                return false;
            }
            GooglePlayServicesClient googlePlayServicesClient = (GooglePlayServicesClient) obj;
            if (this.write == googlePlayServicesClient.write) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.PlaybackStateCompat, googlePlayServicesClient.PlaybackStateCompat}, getCieXyz.write())).booleanValue()) {
                    if ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, googlePlayServicesClient.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) || this.serializer != googlePlayServicesClient.serializer) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, googlePlayServicesClient.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatToken, googlePlayServicesClient.MediaSessionCompatToken}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.PlaybackStateCompatCustomAction, googlePlayServicesClient.PlaybackStateCompatCustomAction}, getCieXyz.write())).booleanValue() || this.RatingCompat != googlePlayServicesClient.RatingCompat) {
                        return false;
                    }
                    if (this.MediaDescriptionCompat != googlePlayServicesClient.MediaDescriptionCompat) {
                        int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 47;
                        ComponentActivity = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i3 = i2 % 2;
                        return false;
                    }
                    if (this.MediaSessionCompatQueueItem == googlePlayServicesClient.MediaSessionCompatQueueItem) {
                        if (this.MediaBrowserCompatMediaItem != googlePlayServicesClient.MediaBrowserCompatMediaItem) {
                            return false;
                        }
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaMetadataCompat, googlePlayServicesClient.MediaMetadataCompat}, getCieXyz.write())).booleanValue()) {
                            return false;
                        }
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatResultReceiverWrapper, googlePlayServicesClient.MediaSessionCompatResultReceiverWrapper}, getCieXyz.write())).booleanValue() || this.ParcelableVolumeInfo != googlePlayServicesClient.ParcelableVolumeInfo) {
                            return false;
                        }
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, googlePlayServicesClient.read}, getCieXyz.write())).booleanValue()) {
                            return true;
                        }
                        int i4 = ComponentActivity + 47;
                        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i5 = i4 % 2;
                        return false;
                    }
                    int i6 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 47;
                    ComponentActivity = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return false;
                }
                int i8 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 51;
                ComponentActivity = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i8 % 2 != 0;
            }
            int i9 = ComponentActivity + 3;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return false;
        }
        int i11 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 83;
        ComponentActivity = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i12 = i11 % 2;
        return true;
    }
}
