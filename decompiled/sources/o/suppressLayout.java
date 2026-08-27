package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.navigation.voice.api.VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class suppressLayout {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int ParcelableVolumeInfo = 1;
    public final String IconCompatParcelizer;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final String RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final long read;
    public final String serializer;
    public final boolean write;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i | i5;
        int i8 = ~i6;
        int i9 = ~i5;
        int i10 = ~(i8 | i9);
        int i11 = (~(i5 | i8)) | (~(i9 | i));
        int i12 = i + i6 + i2 + (1389894630 * i4) + ((-1243605516) * i3);
        int i13 = i12 * i12;
        int i14 = ((-345998475) * i) + 1335230464 + (862422157 * i6) + ((-1543273332) * i7) + (i10 * 1543273332) + (1543273332 * i11) + ((-1889271808) * i2) + (1607991296 * i4) + ((-548405248) * i3) + ((-1553596416) * i13);
        int i15 = ((i * (-88671125)) - 261777699) + (i6 * (-88671149)) + (i7 * (-12)) + (i10 * 12) + (i11 * 12) + (i2 * (-88671137)) + (i4 * (-349388198)) + (i3 * (-147040884)) + (i13 * 182059008);
        return i14 + ((i15 * i15) * (-132513792)) != 1 ? serializer(objArr) : write(objArr);
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        suppressLayout suppresslayout = (suppressLayout) objArr[0];
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 65;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return suppresslayout.MediaMetadataCompat;
        }
        int i3 = 12 / 0;
        return suppresslayout.MediaMetadataCompat;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        suppressLayout suppresslayout = (suppressLayout) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 9;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        ParcelableVolumeInfo = i3;
        if (i2 % 2 == 0) {
            long j = suppresslayout.read;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j2 = suppresslayout.read;
        int i4 = i3 + 31;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return Long.valueOf(j2);
    }

    public final String IconCompatParcelizer() {
        String str;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 33;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        ParcelableVolumeInfo = i3;
        if (i2 % 2 == 0) {
            str = this.IconCompatParcelizer;
            int i4 = 4 / 0;
        } else {
            str = this.IconCompatParcelizer;
        }
        int i5 = i3 + 55;
        MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 67;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = this.write;
        int i4 = i3 + 67;
        ParcelableVolumeInfo = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
        return z;
    }

    public final String MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 81;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i3;
        int i4 = i2 % 2;
        String str = this.RatingCompat;
        int i5 = i3 + 91;
        ParcelableVolumeInfo = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 90 / 0;
        }
        return str;
    }

    public final String MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem;
        int i3 = i2 + 75;
        ParcelableVolumeInfo = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.MediaSessionCompatQueueItem;
        int i5 = i2 + 107;
        ParcelableVolumeInfo = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo;
        int i3 = i2 + 33;
        MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.serializer;
        int i4 = i2 + 87;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 83;
        ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.MediaDescriptionCompat;
        }
        throw null;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 93;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.RemoteActionCompatParcelizer;
        }
        throw null;
    }

    public suppressLayout(long j, String str, String str2, boolean z, String str3, String str4, String str5, String str6, String str7) {
        m1$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        this.read = j;
        this.MediaDescriptionCompat = str;
        this.IconCompatParcelizer = str2;
        this.write = z;
        this.MediaSessionCompatQueueItem = str3;
        this.RemoteActionCompatParcelizer = str4;
        this.serializer = str5;
        this.RatingCompat = str6;
        this.MediaMetadataCompat = str7;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 121;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.MediaMetadataCompat.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(Long.hashCode(this.read) * 31, 31, this.MediaDescriptionCompat), 31, this.IconCompatParcelizer), 31, this.write), 31, this.MediaSessionCompatQueueItem), 31, this.RemoteActionCompatParcelizer), 31, this.serializer), 31, this.RatingCompat);
        int i4 = MediaBrowserCompatMediaItem + 123;
        ParcelableVolumeInfo = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 119;
        ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sb = getBitmapFromCache.read("InAppMessage(id=", ", messageData=", this.read, this.MediaDescriptionCompat);
        sb.append(", contentResponseJson=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", isShown=");
        sb.append(this.write);
        c8$$ExternalSyntheticOutline0.m(sb, ", messageId=", this.MediaSessionCompatQueueItem, ", campaignId=", this.RemoteActionCompatParcelizer);
        c8$$ExternalSyntheticOutline0.m(sb, ", executionId=", this.serializer, ", templateId=", this.RatingCompat);
        String strM = d$$ExternalSyntheticOutline0.m(sb, ", notificationId=", this.MediaMetadataCompat, ")");
        int i4 = MediaBrowserCompatMediaItem + 95;
        ParcelableVolumeInfo = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 66 / 0;
        }
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = MediaBrowserCompatMediaItem + 97;
            ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof suppressLayout)) {
            return false;
        }
        suppressLayout suppresslayout = (suppressLayout) obj;
        if (this.read != suppresslayout.read) {
            return false;
        }
        Object[] objArr = {this.MediaDescriptionCompat, suppresslayout.MediaDescriptionCompat};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr2 = {this.IconCompatParcelizer, suppresslayout.IconCompatParcelizer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            int i4 = MediaBrowserCompatMediaItem + 11;
            ParcelableVolumeInfo = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (this.write != suppresslayout.write) {
            int i6 = MediaBrowserCompatMediaItem + 107;
            ParcelableVolumeInfo = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        Object[] objArr3 = {this.MediaSessionCompatQueueItem, suppresslayout.MediaSessionCompatQueueItem};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr4 = {this.RemoteActionCompatParcelizer, suppresslayout.RemoteActionCompatParcelizer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
            int i8 = ParcelableVolumeInfo + 99;
            MediaBrowserCompatMediaItem = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                int i9 = 6 / 0;
            }
            return false;
        }
        Object[] objArr5 = {this.serializer, suppresslayout.serializer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr6 = {this.RatingCompat, suppresslayout.RatingCompat};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr6, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr7 = {this.MediaMetadataCompat, suppresslayout.MediaMetadataCompat};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr7, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i10 = MediaBrowserCompatMediaItem + 125;
        ParcelableVolumeInfo = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return false;
    }

    public final String RatingCompat() {
        int iIconCompatParcelizer = VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return (String) RemoteActionCompatParcelizer(-730533709, new Object[]{this}, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), iIconCompatParcelizer, 730533709);
    }

    public final long RemoteActionCompatParcelizer() {
        int iIconCompatParcelizer = VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return ((Long) RemoteActionCompatParcelizer(-1785169446, new Object[]{this}, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), iIconCompatParcelizer, 1785169447)).longValue();
    }
}
