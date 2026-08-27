package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.deeplink.analytics.PushAnalyticsData;

/* JADX INFO: loaded from: classes3.dex */
public final class CloseableKt {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final String MediaMetadataCompat;
    public final String RatingCompat;
    public final boolean RemoteActionCompatParcelizer;
    public final String read;
    public final PushAnalyticsData serializer;
    public final String write;

    public static /* synthetic */ Object read(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i6;
        int i8 = ~i;
        int i9 = (~(i7 | i8)) | (~(i8 | i4));
        int i10 = ~((~i4) | i6 | i);
        int i11 = i9 | i10;
        int i12 = (~(i4 | i8 | i6)) | i10;
        int i13 = i6 | i;
        int i14 = i6 + i + i3 + ((-1865910757) * i2) + ((-1665280692) * i5);
        int i15 = i14 * i14;
        int i16 = ((i6 * (-906343980)) - 215482368) + ((-906343980) * i) + (i11 * (-2063747539)) + (2063747539 * i12) + ((-2063747539) * i13) + (1324875776 * i3) + ((-1540882432) * i2) + ((-912261120) * i5) + (1566179328 * i15);
        int i17 = (i6 * (-52584228)) + 761582770 + (i * (-52584228)) + (i11 * 415) + (i12 * (-415)) + (i13 * 415) + (i3 * (-52583813)) + (i2 * (-195242759)) + (i5 * 1657508740) + (i15 * (-834797568));
        if (i16 + (i17 * i17 * 1251344384) != 1) {
            return write(objArr);
        }
        CloseableKt closeableKt = (CloseableKt) objArr[0];
        int i18 = 2 % 2;
        int i19 = MediaDescriptionCompat + 69;
        MediaSessionCompatQueueItem = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i20 = i19 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("AuthPushData(title=", closeableKt.MediaMetadataCompat, ", message=", closeableKt.read, ", category=");
        SweepGradientShader9KIMszodefault.IconCompatParcelizer(closeableKt.write, ", isSyncPush=", ", newDeliveryId=", sbM, closeableKt.RemoteActionCompatParcelizer);
        c8$$ExternalSyntheticOutline0.m(sbM, closeableKt.MediaBrowserCompatMediaItem, ", messageId=", closeableKt.IconCompatParcelizer, ", analyticsData=");
        sbM.append(closeableKt.serializer);
        sbM.append(", sourceTrigger=");
        sbM.append(closeableKt.RatingCompat);
        sbM.append(")");
        String string = sbM.toString();
        int i21 = MediaDescriptionCompat + 45;
        MediaSessionCompatQueueItem = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i22 = i21 % 2;
        return string;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        CloseableKt closeableKt = (CloseableKt) objArr[0];
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem;
        int i3 = i2 + 105;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = closeableKt.MediaBrowserCompatMediaItem;
        int i5 = i2 + 115;
        MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 21;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.write;
        }
        int i3 = 99 / 0;
        return this.write;
    }

    public final boolean MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 113;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaDescriptionCompat = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.RemoteActionCompatParcelizer;
        int i4 = i3 + 67;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public final String MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem;
        int i3 = i2 + 1;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.MediaMetadataCompat;
        int i4 = i2 + 49;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final String MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 75;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.RatingCompat;
        int i5 = i2 + 65;
        MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 61;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.IconCompatParcelizer;
        int i4 = i3 + 53;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final PushAnalyticsData serializer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 61;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        PushAnalyticsData pushAnalyticsData = this.serializer;
        int i5 = i2 + 39;
        MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return pushAnalyticsData;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 83;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.read;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public CloseableKt(String str, String str2, String str3, boolean z, String str4, String str5, PushAnalyticsData pushAnalyticsData, String str6) {
        this.MediaMetadataCompat = str;
        this.read = str2;
        this.write = str3;
        this.RemoteActionCompatParcelizer = z;
        this.MediaBrowserCompatMediaItem = str4;
        this.IconCompatParcelizer = str5;
        this.serializer = pushAnalyticsData;
        this.RatingCompat = str6;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        String str = this.MediaMetadataCompat;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i2 = MediaSessionCompatQueueItem + 35;
            MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        String str2 = this.read;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.write;
        int iM = d$$ExternalSyntheticOutline0.m(((((iHashCode * 31) + iHashCode4) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.RemoteActionCompatParcelizer);
        String str4 = this.MediaBrowserCompatMediaItem;
        if (str4 == null) {
            int i4 = MediaSessionCompatQueueItem + 67;
            MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode2 = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = str4.hashCode();
        }
        String str5 = this.IconCompatParcelizer;
        if (str5 == null) {
            int i5 = MediaSessionCompatQueueItem + 63;
            MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str5.hashCode();
        }
        PushAnalyticsData pushAnalyticsData = this.serializer;
        int iHashCode5 = pushAnalyticsData == null ? 0 : pushAnalyticsData.hashCode();
        String str6 = this.RatingCompat;
        return ((((((iM + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode5) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloseableKt)) {
            return false;
        }
        CloseableKt closeableKt = (CloseableKt) obj;
        Object[] objArr = {this.MediaMetadataCompat, closeableKt.MediaMetadataCompat};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i2 = MediaSessionCompatQueueItem + 41;
            MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        Object[] objArr2 = {this.read, closeableKt.read};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr3 = {this.write, closeableKt.write};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
            int i4 = MediaSessionCompatQueueItem + 73;
            MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (this.RemoteActionCompatParcelizer != closeableKt.RemoteActionCompatParcelizer) {
            return false;
        }
        Object[] objArr4 = {this.MediaBrowserCompatMediaItem, closeableKt.MediaBrowserCompatMediaItem};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr5 = {this.IconCompatParcelizer, closeableKt.IconCompatParcelizer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr6 = {this.serializer, closeableKt.serializer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr6, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr7 = {this.RatingCompat, closeableKt.RatingCompat};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr7, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i6 = MediaDescriptionCompat + 107;
        MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }

    public final String toString() {
        int i = UserPropertiesSerializer.read();
        int i2 = UserPropertiesSerializer.read();
        return (String) read(-206660315, UserPropertiesSerializer.read(), i2, i, UserPropertiesSerializer.read(), new Object[]{this}, 206660316);
    }

    public final String RemoteActionCompatParcelizer() {
        int i = UserPropertiesSerializer.read();
        int i2 = UserPropertiesSerializer.read();
        return (String) read(-1209325344, UserPropertiesSerializer.read(), i2, i, UserPropertiesSerializer.read(), new Object[]{this}, 1209325344);
    }
}
