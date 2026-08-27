package com.roadrunner.deeplink.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.search.result.SearchResult;
import o.UserPropertiesSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class PushAnalyticsData implements Parcelable {
    public static final Parcelable.Creator<PushAnalyticsData> CREATOR = new SearchResult.Creator(6);
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public final String IconCompatParcelizer;
    public final String MediaMetadataCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i6;
        int i8 = ~i;
        int i9 = i8 | i3;
        int i10 = (~(i7 | i8)) | (~(i7 | i3)) | (~i9);
        int i11 = ~i3;
        int i12 = (~(i | i11 | i6)) | (~(i7 | i11 | i8)) | (~(i9 | i6));
        int i13 = ~(i8 | i11 | i6);
        int i14 = i3 + i6 + i2 + ((-973178360) * i4) + (1542423572 * i5);
        int i15 = i14 * i14;
        int i16 = (((-1657973228) * i3) - 1073741824) + ((-187520530) * i6) + ((-735226349) * i10) + (i12 * 735226349) + (735226349 * i13) + ((-922746880) * i2) + (1207959552 * i4) + ((-1275068416) * i5) + (196542464 * i15);
        int i17 = (i3 * (-490823948)) + 944362368 + (i6 * (-490821954)) + (i10 * (-997)) + (i12 * 997) + (i13 * 997) + (i2 * (-490822951)) + (i4 * 2145288392) + (i5 * 779328756) + (i15 * (-1138819072));
        return i16 + ((i17 * i17) * 1440284672) != 1 ? serializer(objArr) : RemoteActionCompatParcelizer(objArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 19;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return 0;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        PushAnalyticsData pushAnalyticsData = (PushAnalyticsData) objArr[0];
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 77;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i3;
        int i4 = i2 % 2;
        String str = pushAnalyticsData.RemoteActionCompatParcelizer;
        int i5 = i3 + 3;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        PushAnalyticsData pushAnalyticsData = (PushAnalyticsData) objArr[0];
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 85;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return pushAnalyticsData.serializer;
        }
        String str = pushAnalyticsData.serializer;
        throw null;
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 107;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        int i4 = i2 % 2;
        String str = this.write;
        int i5 = i3 + 69;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 57 / 0;
        }
        return str;
    }

    public final String MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 77;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        int i4 = i2 % 2;
        String str = this.MediaMetadataCompat;
        int i5 = i3 + 85;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 65;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.IconCompatParcelizer;
        int i4 = i3 + 61;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem;
        int i3 = i2 + 53;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.read;
        int i5 = i2 + 31;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = MediaDescriptionCompat + 57;
        RatingCompat = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public PushAnalyticsData(String str, String str2, String str3, String str4, String str5, String str6) {
        this.write = str;
        this.RemoteActionCompatParcelizer = str2;
        this.read = str3;
        this.serializer = str4;
        this.MediaMetadataCompat = str5;
        this.IconCompatParcelizer = str6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = MediaSessionCompatQueueItem + 25;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        parcel.getClass();
        parcel.writeString(this.write);
        parcel.writeString(this.RemoteActionCompatParcelizer);
        parcel.writeString(this.read);
        parcel.writeString(this.serializer);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.IconCompatParcelizer);
        int i5 = MediaBrowserCompatMediaItem + 33;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 0 / 0;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 103;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("PushAnalyticsData(messageNewId=", this.write, ", notificationId=", this.RemoteActionCompatParcelizer, ", campaignId=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.read, ", executionId=", this.serializer, ", templateName=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.MediaMetadataCompat, ", templateId=", this.IconCompatParcelizer, ")");
        int i4 = MediaSessionCompatQueueItem + 7;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        String str = this.write;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.RemoteActionCompatParcelizer;
        if (str2 == null) {
            int i2 = MediaSessionCompatQueueItem;
            int i3 = i2 + 95;
            MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 109;
            MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
            int i7 = MediaSessionCompatQueueItem + 7;
            MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        String str3 = this.read;
        int iHashCode5 = 1;
        if (str3 == null) {
            int i9 = MediaBrowserCompatMediaItem + 41;
            MediaSessionCompatQueueItem = i9 % Fields.SpotShadowColor;
            iHashCode2 = i9 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        String str4 = this.serializer;
        if (str4 == null) {
            int i10 = MediaBrowserCompatMediaItem + 81;
            MediaSessionCompatQueueItem = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                iHashCode5 = 0;
            }
        } else {
            iHashCode5 = str4.hashCode();
        }
        String str5 = this.MediaMetadataCompat;
        if (str5 == null) {
            int i11 = MediaSessionCompatQueueItem + 11;
            MediaBrowserCompatMediaItem = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str5.hashCode();
        }
        String str6 = this.IconCompatParcelizer;
        return (((((((((iHashCode4 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode5) * 31) + iHashCode3) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if ((r23 instanceof com.roadrunner.deeplink.analytics.PushAnalyticsData) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        r3 = r3 + 103;
        com.roadrunner.deeplink.analytics.PushAnalyticsData.MediaSessionCompatQueueItem = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        r1 = (com.roadrunner.deeplink.analytics.PushAnalyticsData) r23;
        r13 = new java.lang.Object[]{r22.write, r1.write};
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r13, o.getCieXyz.write())).booleanValue() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        r1 = com.roadrunner.deeplink.analytics.PushAnalyticsData.MediaBrowserCompatMediaItem + 59;
        com.roadrunner.deeplink.analytics.PushAnalyticsData.MediaSessionCompatQueueItem = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        r20 = new java.lang.Object[]{r22.RemoteActionCompatParcelizer, r1.RemoteActionCompatParcelizer};
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008e, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r20, o.getCieXyz.write())).booleanValue() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0090, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
    
        r20 = new java.lang.Object[]{r22.read, r1.read};
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b7, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r20, o.getCieXyz.write())).booleanValue() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b9, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ba, code lost:
    
        r20 = new java.lang.Object[]{r22.serializer, r1.serializer};
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e0, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r20, o.getCieXyz.write())).booleanValue() == true) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e2, code lost:
    
        r1 = com.roadrunner.deeplink.analytics.PushAnalyticsData.MediaSessionCompatQueueItem + 81;
        com.roadrunner.deeplink.analytics.PushAnalyticsData.MediaBrowserCompatMediaItem = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00eb, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ec, code lost:
    
        r20 = new java.lang.Object[]{r22.MediaMetadataCompat, r1.MediaMetadataCompat};
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0112, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r20, o.getCieXyz.write())).booleanValue() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0114, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0115, code lost:
    
        r20 = new java.lang.Object[]{r22.IconCompatParcelizer, r1.IconCompatParcelizer};
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x013b, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r20, o.getCieXyz.write())).booleanValue() != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x013d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x013e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r22 == r23) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r22 == r23) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        r5 = r5 + 63;
        com.roadrunner.deeplink.analytics.PushAnalyticsData.MediaBrowserCompatMediaItem = r5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.deeplink.analytics.PushAnalyticsData.equals(java.lang.Object):boolean");
    }

    public final String write() {
        return (String) RemoteActionCompatParcelizer(UserPropertiesSerializer.read(), UserPropertiesSerializer.read(), 1807034167, UserPropertiesSerializer.read(), UserPropertiesSerializer.read(), new Object[]{this}, -1807034166);
    }

    public final String RemoteActionCompatParcelizer() {
        return (String) RemoteActionCompatParcelizer(UserPropertiesSerializer.read(), UserPropertiesSerializer.read(), -394501910, UserPropertiesSerializer.read(), UserPropertiesSerializer.read(), new Object[]{this}, 394501910);
    }
}
