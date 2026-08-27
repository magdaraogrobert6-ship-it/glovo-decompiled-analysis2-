package o;

import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.repository.api.DeliveryInformation$ScreenDataType;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class timesmpE4wyQ {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public final boolean IconCompatParcelizer;
    public final Set MediaBrowserCompatMediaItem;
    public final DeliveryInformation$ScreenDataType MediaMetadataCompat;
    public final Set RemoteActionCompatParcelizer;
    public final boolean read;
    public final Map serializer;
    public final Map write;

    public timesmpE4wyQ(Set set, Set set2, DeliveryInformation$ScreenDataType deliveryInformation$ScreenDataType, Map map, boolean z, Map map2, boolean z2) {
        this.MediaBrowserCompatMediaItem = set;
        this.RemoteActionCompatParcelizer = set2;
        this.MediaMetadataCompat = deliveryInformation$ScreenDataType;
        this.write = map;
        this.read = z;
        this.serializer = map2;
        this.IconCompatParcelizer = z2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003d A[PHI: r1 r3 r4
  0x003d: PHI (r1v14 int) = (r1v5 int), (r1v16 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x003d: PHI (r3v8 int) = (r3v1 int), (r3v10 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x003d: PHI (r4v5 com.roadrunner.delivery.repository.api.DeliveryInformation$ScreenDataType) = 
  (r4v0 com.roadrunner.delivery.repository.api.DeliveryInformation$ScreenDataType)
  (r4v6 com.roadrunner.delivery.repository.api.DeliveryInformation$ScreenDataType)
 binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0033 A[PHI: r1 r3
  0x0033: PHI (r1v6 int) = (r1v5 int), (r1v16 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0033: PHI (r3v2 int) = (r3v1 int), (r3v10 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        DeliveryInformation$ScreenDataType deliveryInformation$ScreenDataType;
        int i = 2 % 2;
        int i2 = RatingCompat + 9;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode3 = 0;
        if (i2 % 2 == 0) {
            iHashCode = this.MediaBrowserCompatMediaItem.hashCode();
            iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
            deliveryInformation$ScreenDataType = this.MediaMetadataCompat;
            int i3 = 57 / 0;
            if (deliveryInformation$ScreenDataType == null) {
                int i4 = RatingCompat + 7;
                MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
            } else {
                iHashCode3 = deliveryInformation$ScreenDataType.hashCode();
            }
        } else {
            iHashCode = this.MediaBrowserCompatMediaItem.hashCode();
            iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
            deliveryInformation$ScreenDataType = this.MediaMetadataCompat;
            if (deliveryInformation$ScreenDataType == null) {
                int i6 = RatingCompat + 7;
                MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
            } else {
                iHashCode3 = deliveryInformation$ScreenDataType.hashCode();
            }
        }
        return Boolean.hashCode(this.IconCompatParcelizer) + IconCompatParcelizer.RemoteActionCompatParcelizer(d$$ExternalSyntheticOutline0.m(IconCompatParcelizer.RemoteActionCompatParcelizer((((iHashCode2 + (iHashCode * 31)) * 31) + iHashCode3) * 31, this.write, 31), 31, this.read), this.serializer, 31);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("DeliveryInformation(orderIds=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", deliveryIds=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", screenDataType=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", deliveryStatuses=");
        sb.append(this.write);
        sb.append(", hasBackToBackOrder=");
        sb.append(this.read);
        sb.append(", deliveryActions=");
        sb.append(this.serializer);
        sb.append(", hasLastStop=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.IconCompatParcelizer, ")");
        int i2 = MediaDescriptionCompat + 79;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
    
        if (r4.IconCompatParcelizer != r5.IconCompatParcelizer) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            if (r4 != r5) goto L7
            goto L5f
        L7:
            boolean r2 = r5 instanceof o.timesmpE4wyQ
            if (r2 != 0) goto Lc
            goto L4e
        Lc:
            o.timesmpE4wyQ r5 = (o.timesmpE4wyQ) r5
            java.util.Set r2 = r4.MediaBrowserCompatMediaItem
            java.util.Set r3 = r5.MediaBrowserCompatMediaItem
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L19
            goto L4e
        L19:
            java.util.Set r2 = r4.RemoteActionCompatParcelizer
            java.util.Set r3 = r5.RemoteActionCompatParcelizer
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L24
            goto L4e
        L24:
            com.roadrunner.delivery.repository.api.DeliveryInformation$ScreenDataType r2 = r4.MediaMetadataCompat
            com.roadrunner.delivery.repository.api.DeliveryInformation$ScreenDataType r3 = r5.MediaMetadataCompat
            if (r2 == r3) goto L2b
            goto L4e
        L2b:
            java.util.Map r2 = r4.write
            java.util.Map r3 = r5.write
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L36
            goto L4e
        L36:
            boolean r2 = r4.read
            boolean r3 = r5.read
            if (r2 == r3) goto L3d
            goto L4e
        L3d:
            java.util.Map r2 = r4.serializer
            java.util.Map r3 = r5.serializer
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L48
            goto L4e
        L48:
            boolean r2 = r4.IconCompatParcelizer
            boolean r5 = r5.IconCompatParcelizer
            if (r2 == r5) goto L5f
        L4e:
            int r5 = o.timesmpE4wyQ.RatingCompat
            int r5 = r5 + 57
            int r2 = r5 % 128
            o.timesmpE4wyQ.MediaDescriptionCompat = r2
            int r5 = r5 % r0
            if (r5 == 0) goto L5b
            r5 = 0
            return r5
        L5b:
            r1.hashCode()
            throw r1
        L5f:
            int r5 = o.timesmpE4wyQ.RatingCompat
            int r5 = r5 + 121
            int r2 = r5 % 128
            o.timesmpE4wyQ.MediaDescriptionCompat = r2
            int r5 = r5 % r0
            if (r5 == 0) goto L6c
            r5 = 1
            return r5
        L6c:
            r1.hashCode()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.timesmpE4wyQ.equals(java.lang.Object):boolean");
    }
}
