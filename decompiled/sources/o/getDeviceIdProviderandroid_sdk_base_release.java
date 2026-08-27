package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getDeviceIdProviderandroid_sdk_base_release {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;
    public final getDeviceIdAsync IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final List read;
    public final long serializer;
    public final String write;

    public getDeviceIdProviderandroid_sdk_base_release(long j, getDeviceIdAsync getdeviceidasync, int i, String str, List list) {
        getdeviceidasync.getClass();
        this.serializer = j;
        this.IconCompatParcelizer = getdeviceidasync;
        this.RemoteActionCompatParcelizer = i;
        this.write = str;
        this.read = list;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Long.hashCode(this.serializer);
        int iM = af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, (this.IconCompatParcelizer.hashCode() + (iHashCode2 * 31)) * 31, 31);
        String str = this.write;
        if (str == null) {
            int i2 = RatingCompat + 123;
            MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = MediaBrowserCompatMediaItem + 63;
            RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        int iHashCode3 = this.read.hashCode() + ((iM + iHashCode) * 31);
        int i6 = MediaBrowserCompatMediaItem + 29;
        RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return iHashCode3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if ((!r11.read.equals(r12.read)) == true) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.getDeviceIdProviderandroid_sdk_base_release.MediaBrowserCompatMediaItem
            int r2 = r1 + 29
            int r3 = r2 % 128
            o.getDeviceIdProviderandroid_sdk_base_release.RatingCompat = r3
            int r2 = r2 % r0
            r2 = 1
            if (r11 != r12) goto L10
            goto L6b
        L10:
            boolean r3 = r12 instanceof o.getDeviceIdProviderandroid_sdk_base_release
            if (r3 != 0) goto L15
            goto L6c
        L15:
            o.getDeviceIdProviderandroid_sdk_base_release r12 = (o.getDeviceIdProviderandroid_sdk_base_release) r12
            long r3 = r11.serializer
            long r5 = r12.serializer
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L20
            goto L6c
        L20:
            o.getDeviceIdAsync r3 = r11.IconCompatParcelizer
            o.getDeviceIdAsync r4 = r12.IconCompatParcelizer
            if (r3 == r4) goto L27
            goto L6c
        L27:
            int r3 = r11.RemoteActionCompatParcelizer
            int r4 = r12.RemoteActionCompatParcelizer
            if (r3 == r4) goto L35
            int r1 = r1 + 101
            int r12 = r1 % 128
            o.getDeviceIdProviderandroid_sdk_base_release.RatingCompat = r12
            int r1 = r1 % r0
            goto L6c
        L35:
            java.lang.String r1 = r11.write
            java.lang.String r3 = r12.write
            java.lang.Object[] r9 = new java.lang.Object[]{r1, r3}
            int r4 = o.getCieXyz.write()
            int r8 = o.getCieXyz.write()
            int r10 = o.getCieXyz.write()
            int r7 = o.getCieXyz.write()
            r5 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r6 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L60
            goto L6c
        L60:
            java.util.List r1 = r11.read
            java.util.List r12 = r12.read
            boolean r12 = r1.equals(r12)
            r12 = r12 ^ r2
            if (r12 == r2) goto L6c
        L6b:
            return r2
        L6c:
            int r12 = o.getDeviceIdProviderandroid_sdk_base_release.MediaBrowserCompatMediaItem
            int r12 = r12 + 103
            int r1 = r12 % 128
            o.getDeviceIdProviderandroid_sdk_base_release.RatingCompat = r1
            int r12 = r12 % r0
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getDeviceIdProviderandroid_sdk_base_release.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "SubmitVendorReviewParams(deliveryId=" + this.serializer + ", scoreType=" + this.IconCompatParcelizer + ", score=" + this.RemoteActionCompatParcelizer + ", comment=" + this.write + ", tags=" + this.read + ")";
        int i2 = MediaBrowserCompatMediaItem + 29;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 5 / 0;
        }
        return str;
    }
}
