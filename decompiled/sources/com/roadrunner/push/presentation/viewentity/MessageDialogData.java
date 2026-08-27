package com.roadrunner.push.presentation.viewentity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.deeplink.analytics.PushAnalyticsData;
import com.roadrunner.push.event.PushDeepLink;
import io.reactivex.internal.operators.flowable.FlowableCreate;
import o.access700;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class MessageDialogData implements Parcelable {
    public static final Parcelable.Creator<MessageDialogData> CREATOR = new access700(12);
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    private static int MediaSessionCompatToken = 1;
    private static int PlaybackStateCompatCustomAction;
    private static int RatingCompat;
    public final PushAnalyticsData IconCompatParcelizer;
    public final boolean MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final PushDeepLink RemoteActionCompatParcelizer;
    public final String read;
    public final boolean serializer;
    public final boolean write;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = ~(i6 | i3);
        int i11 = i9 | i10;
        int i12 = i9 | (~(i | i3)) | i10;
        int i13 = (~(i3 | i | i6)) | (~(i8 | (~i6)));
        int i14 = i + i6 + i5 + ((-2005657349) * i2) + (1476006321 * i4);
        int i15 = i14 * i14;
        int i16 = ((583353605 * i) - 1319501824) + (407026429 * i6) + ((-176327176) * i11) + (i12 * (-2059320060)) + ((-2059320060) * i13) + ((-1652293632) * i5) + ((-798228480) * i2) + ((-1404829696) * i4) + ((-1043726336) * i15);
        int i17 = (i * 961754349) + 784684277 + (i6 * 961754277) + (i11 * (-72)) + (i12 * 36) + (i13 * 36) + (i5 * 961754313) + (i2 * (-1264871149)) + (i4 * 72538105) + (i15 * 798621696);
        return i16 + ((i17 * i17) * (-1437204480)) != 1 ? write(objArr) : RemoteActionCompatParcelizer(objArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 79;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaSessionCompatResultReceiverWrapper = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 27;
        PlaybackStateCompatCustomAction = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 7 / 0;
        }
        return 0;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        MessageDialogData messageDialogData = (MessageDialogData) objArr[0];
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 125;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return messageDialogData.MediaSessionCompatQueueItem;
        }
        String str = messageDialogData.MediaSessionCompatQueueItem;
        throw null;
    }

    public final String IconCompatParcelizer() {
        String str;
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 11;
        int i3 = i2 % Fields.SpotShadowColor;
        PlaybackStateCompatCustomAction = i3;
        if (i2 % 2 != 0) {
            str = this.MediaDescriptionCompat;
            int i4 = 90 / 0;
        } else {
            str = this.MediaDescriptionCompat;
        }
        int i5 = i3 + 115;
        MediaSessionCompatResultReceiverWrapper = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 57 / 0;
        }
        return str;
    }

    public final boolean RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper;
        int i3 = i2 + 37;
        PlaybackStateCompatCustomAction = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        boolean z = this.MediaBrowserCompatMediaItem;
        int i5 = i2 + 119;
        PlaybackStateCompatCustomAction = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean read() {
        boolean z;
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 99;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaSessionCompatResultReceiverWrapper = i3;
        if (i2 % 2 == 0) {
            z = this.write;
            int i4 = 80 / 0;
        } else {
            z = this.write;
        }
        int i5 = i3 + 113;
        PlaybackStateCompatCustomAction = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return z;
    }

    public final PushAnalyticsData serializer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper;
        int i3 = i2 + 9;
        PlaybackStateCompatCustomAction = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        PushAnalyticsData pushAnalyticsData = this.IconCompatParcelizer;
        int i4 = i2 + 111;
        PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
        return pushAnalyticsData;
    }

    public MessageDialogData(String str, String str2, boolean z, boolean z2, PushDeepLink pushDeepLink, String str3, PushAnalyticsData pushAnalyticsData, boolean z3, String str4) {
        str.getClass();
        str2.getClass();
        this.MediaMetadataCompat = str;
        this.read = str2;
        this.write = z;
        this.serializer = z2;
        this.RemoteActionCompatParcelizer = pushDeepLink;
        this.MediaSessionCompatQueueItem = str3;
        this.IconCompatParcelizer = pushAnalyticsData;
        this.MediaBrowserCompatMediaItem = z3;
        this.MediaDescriptionCompat = str4;
    }

    static {
        int i = RatingCompat + 17;
        MediaSessionCompatToken = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 27 / 0;
        }
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        MessageDialogData messageDialogData = (MessageDialogData) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        if (messageDialogData == obj) {
            return true;
        }
        if (!(obj instanceof MessageDialogData)) {
            return false;
        }
        MessageDialogData messageDialogData2 = (MessageDialogData) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{messageDialogData.MediaMetadataCompat, messageDialogData2.MediaMetadataCompat}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{messageDialogData.read, messageDialogData2.read}, getCieXyz.write())).booleanValue() || messageDialogData.write != messageDialogData2.write) {
            return false;
        }
        if (messageDialogData.serializer != messageDialogData2.serializer) {
            int i2 = MediaSessionCompatResultReceiverWrapper + 27;
            PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 47 / 0;
            }
            return false;
        }
        if (true ^ ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{messageDialogData.RemoteActionCompatParcelizer, messageDialogData2.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            int i4 = PlaybackStateCompatCustomAction + 99;
            MediaSessionCompatResultReceiverWrapper = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{messageDialogData.MediaSessionCompatQueueItem, messageDialogData2.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{messageDialogData.IconCompatParcelizer, messageDialogData2.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (messageDialogData.MediaBrowserCompatMediaItem == messageDialogData2.MediaBrowserCompatMediaItem) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{messageDialogData.MediaDescriptionCompat, messageDialogData2.MediaDescriptionCompat}, getCieXyz.write())).booleanValue();
        }
        int i6 = PlaybackStateCompatCustomAction;
        int i7 = i6 + 93;
        MediaSessionCompatResultReceiverWrapper = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        int i9 = i6 + 103;
        MediaSessionCompatResultReceiverWrapper = i9 % Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            int i10 = 44 / 0;
        }
        return false;
    }

    public /* synthetic */ MessageDialogData(String str, String str2, boolean z, PushDeepLink pushDeepLink, String str3, PushAnalyticsData pushAnalyticsData, boolean z2, String str4) {
        this(str, str2, z, false, pushDeepLink, str3, pushAnalyticsData, z2, str4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = PlaybackStateCompatCustomAction + 19;
        MediaSessionCompatResultReceiverWrapper = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        parcel.getClass();
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.read);
        parcel.writeInt(this.write ? 1 : 0);
        parcel.writeInt(this.serializer ? 1 : 0);
        PushDeepLink pushDeepLink = this.RemoteActionCompatParcelizer;
        if (pushDeepLink == null) {
            int i5 = MediaSessionCompatResultReceiverWrapper + 79;
            PlaybackStateCompatCustomAction = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            pushDeepLink.writeToParcel(parcel, i);
            int i6 = MediaSessionCompatResultReceiverWrapper + 75;
            PlaybackStateCompatCustomAction = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                int i7 = 2 % 3;
            }
        }
        parcel.writeString(this.MediaSessionCompatQueueItem);
        parcel.writeParcelable(this.IconCompatParcelizer, i);
        parcel.writeInt(this.MediaBrowserCompatMediaItem ? 1 : 0);
        parcel.writeString(this.MediaDescriptionCompat);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 121;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("MessageDialogData(title=", this.MediaMetadataCompat, ", message=", this.read, ", isSyncPush=");
        af$$ExternalSyntheticOutline0.m(sbM, this.write, ", isCancelable=", this.serializer, ", deepLink=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(", pushCategory=");
        sbM.append(this.MediaSessionCompatQueueItem);
        sbM.append(", analyticsData=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(", shouldShowDialog=");
        sbM.append(this.MediaBrowserCompatMediaItem);
        sbM.append(", sourceTrigger=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.MediaDescriptionCompat, ")");
        int i4 = MediaSessionCompatResultReceiverWrapper + 49;
        PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.MediaMetadataCompat.hashCode() * 31, 31, this.read), 31, this.write), 31, this.serializer);
        PushDeepLink pushDeepLink = this.RemoteActionCompatParcelizer;
        int iHashCode4 = 0;
        if (pushDeepLink == null) {
            int i2 = PlaybackStateCompatCustomAction + 123;
            MediaSessionCompatResultReceiverWrapper = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = pushDeepLink.hashCode();
        }
        String str = this.MediaSessionCompatQueueItem;
        if (str == null) {
            int i4 = MediaSessionCompatResultReceiverWrapper + 23;
            PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str.hashCode();
        }
        PushAnalyticsData pushAnalyticsData = this.IconCompatParcelizer;
        if (pushAnalyticsData == null) {
            int i6 = MediaSessionCompatResultReceiverWrapper + 29;
            PlaybackStateCompatCustomAction = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = pushAnalyticsData.hashCode();
        }
        int iM2 = d$$ExternalSyntheticOutline0.m((((((iM + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31, 31, this.MediaBrowserCompatMediaItem);
        String str2 = this.MediaDescriptionCompat;
        if (str2 == null) {
            int i8 = MediaSessionCompatResultReceiverWrapper + 95;
            PlaybackStateCompatCustomAction = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        } else {
            iHashCode4 = str2.hashCode();
        }
        int i10 = iM2 + iHashCode4;
        int i11 = MediaSessionCompatResultReceiverWrapper + 83;
        PlaybackStateCompatCustomAction = i11 % Fields.SpotShadowColor;
        int i12 = i11 % 2;
        return i10;
    }

    public final String write() {
        int iMediaMetadataCompat = FlowableCreate.ErrorAsyncEmitter.MediaMetadataCompat();
        int iMediaMetadataCompat2 = FlowableCreate.ErrorAsyncEmitter.MediaMetadataCompat();
        return (String) RemoteActionCompatParcelizer(970192040, FlowableCreate.ErrorAsyncEmitter.MediaMetadataCompat(), iMediaMetadataCompat, FlowableCreate.ErrorAsyncEmitter.MediaMetadataCompat(), iMediaMetadataCompat2, -970192040, new Object[]{this});
    }

    public final boolean equals(Object obj) {
        int iMediaMetadataCompat = FlowableCreate.ErrorAsyncEmitter.MediaMetadataCompat();
        int iMediaMetadataCompat2 = FlowableCreate.ErrorAsyncEmitter.MediaMetadataCompat();
        return ((Boolean) RemoteActionCompatParcelizer(-999617582, FlowableCreate.ErrorAsyncEmitter.MediaMetadataCompat(), iMediaMetadataCompat, FlowableCreate.ErrorAsyncEmitter.MediaMetadataCompat(), iMediaMetadataCompat2, 999617583, new Object[]{this, obj})).booleanValue();
    }
}
