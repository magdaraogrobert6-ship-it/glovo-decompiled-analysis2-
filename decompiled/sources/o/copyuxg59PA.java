package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.huawei.riemann.location.common.utils.Constant;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes3.dex */
public final class copyuxg59PA implements copyYTHSh70 {
    private static int MediaDescriptionCompat = 0;
    private static int RatingCompat = 1;
    public final boolean IconCompatParcelizer;
    public final int MediaBrowserCompatMediaItem;
    public final boolean MediaMetadataCompat;
    public final getImeActioneUduSuo MediaSessionCompatQueueItem;
    public final boolean RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public static /* synthetic */ Object write(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i6;
        int i8 = ~i;
        int i9 = ~(i7 | i8 | i2);
        int i10 = ~((~i2) | i8 | i6);
        int i11 = i9 | i10;
        int i12 = ~(i8 | i6);
        int i13 = (~(i2 | i7)) | (~(i7 | i)) | i10;
        int i14 = i6 + i + i4 + (1787548100 * i3) + (1101416392 * i5);
        int i15 = i14 * i14;
        int i16 = (((-61410478) * i6) - 623378432) + (561581232 * i) + (i11 * (-311495855)) + ((-311495855) * i12) + (311495855 * i13) + (250085376 * i4) + ((-778043392) * i3) + ((-46137344) * i5) + (324403200 * i15);
        int i17 = (i6 * (-930662234)) + 656878810 + (i * (-930660720)) + (i11 * (-757)) + (i12 * (-757)) + (i13 * 757) + (i4 * (-930661477)) + (i3 * 2052861356) + (i5 * 749768216) + (i15 * (-2028863488));
        return i16 + ((i17 * i17) * (-1850081280)) != 1 ? write(objArr) : RemoteActionCompatParcelizer(objArr);
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        copyuxg59PA copyuxg59pa = (copyuxg59PA) objArr[0];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 89;
        RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getImeActioneUduSuo getimeactioneudusuo = copyuxg59pa.MediaSessionCompatQueueItem;
        int i5 = i2 + 47;
        RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 89 / 0;
        }
        return getimeactioneudusuo;
    }

    @Override // o.copyYTHSh70
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 119;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.write;
        }
        int i3 = 23 / 0;
        return this.write;
    }

    public final int read() {
        int i = 2 % 2;
        int i2 = RatingCompat + 35;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.MediaBrowserCompatMediaItem;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.copyYTHSh70
    public final boolean serializer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 115;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.IconCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.copyYTHSh70
    public final boolean write() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 81;
        RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.RemoteActionCompatParcelizer;
        int i4 = i2 + 97;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public copyuxg59PA(String str, String str2, int i, String str3, getImeActioneUduSuo getimeactioneudusuo, boolean z, boolean z2, boolean z3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        getimeactioneudusuo.getClass();
        this.serializer = str;
        this.read = str2;
        this.MediaBrowserCompatMediaItem = i;
        this.write = str3;
        this.MediaSessionCompatQueueItem = getimeactioneudusuo;
        this.RemoteActionCompatParcelizer = z;
        this.IconCompatParcelizer = z2;
        this.MediaMetadataCompat = z3;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        copyuxg59PA copyuxg59pa = (copyuxg59PA) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = RatingCompat + 105;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        copyuxg59PA copyuxg59paWrite = write(copyuxg59pa, zBooleanValue, false, Constant.ERROR_WSS_TIME_DIFF_LARGE);
        int i4 = MediaDescriptionCompat + 109;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return copyuxg59paWrite;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0037 A[PHI: r3 r5 r6 r7 r8
  0x0037: PHI (r3v5 java.lang.String) = (r3v4 java.lang.String), (r3v9 java.lang.String) binds: [B:9:0x0035, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0037: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v4 java.lang.String) binds: [B:9:0x0035, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0037: PHI (r6v1 int) = (r6v0 int), (r6v3 int) binds: [B:9:0x0035, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0037: PHI (r7v1 java.lang.String) = (r7v0 java.lang.String), (r7v3 java.lang.String) binds: [B:9:0x0035, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0037: PHI (r8v1 o.getImeActioneUduSuo) = (r8v0 o.getImeActioneUduSuo), (r8v3 o.getImeActioneUduSuo) binds: [B:9:0x0035, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0021 A[PHI: r3 r5 r6 r7 r8
  0x0021: PHI (r3v8 java.lang.String) = (r3v4 java.lang.String), (r3v9 java.lang.String) binds: [B:9:0x0035, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0021: PHI (r5v3 java.lang.String) = (r5v0 java.lang.String), (r5v4 java.lang.String) binds: [B:9:0x0035, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0021: PHI (r6v2 int) = (r6v0 int), (r6v3 int) binds: [B:9:0x0035, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0021: PHI (r7v2 java.lang.String) = (r7v0 java.lang.String), (r7v3 java.lang.String) binds: [B:9:0x0035, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0021: PHI (r8v2 o.getImeActioneUduSuo) = (r8v0 o.getImeActioneUduSuo), (r8v3 o.getImeActioneUduSuo) binds: [B:9:0x0035, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    public static copyuxg59PA write(copyuxg59PA copyuxg59pa, boolean z, boolean z2, int i) {
        String str;
        String str2;
        int i2;
        String str3;
        getImeActioneUduSuo getimeactioneudusuo;
        String str4;
        String str5;
        int i3;
        String str6;
        getImeActioneUduSuo getimeactioneudusuo2;
        boolean z3;
        boolean z4;
        int i4 = 2 % 2;
        int i5 = MediaDescriptionCompat + 25;
        int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RatingCompat = i6;
        if (i5 % 2 == 0) {
            str = copyuxg59pa.serializer;
            str2 = copyuxg59pa.read;
            i2 = copyuxg59pa.MediaBrowserCompatMediaItem;
            str3 = copyuxg59pa.write;
            getimeactioneudusuo = copyuxg59pa.MediaSessionCompatQueueItem;
            if ((i & 41) != 0) {
                str4 = str;
                str5 = str2;
                i3 = i2;
                str6 = str3;
                getimeactioneudusuo2 = getimeactioneudusuo;
                z3 = copyuxg59pa.RemoteActionCompatParcelizer;
            } else {
                z3 = z;
                str4 = str;
                str5 = str2;
                i3 = i2;
                str6 = str3;
                getimeactioneudusuo2 = getimeactioneudusuo;
            }
        } else {
            str = copyuxg59pa.serializer;
            str2 = copyuxg59pa.read;
            i2 = copyuxg59pa.MediaBrowserCompatMediaItem;
            str3 = copyuxg59pa.write;
            getimeactioneudusuo = copyuxg59pa.MediaSessionCompatQueueItem;
            if ((i & 32) != 0) {
                str4 = str;
                str5 = str2;
                i3 = i2;
                str6 = str3;
                getimeactioneudusuo2 = getimeactioneudusuo;
                z3 = copyuxg59pa.RemoteActionCompatParcelizer;
            } else {
                z3 = z;
                str4 = str;
                str5 = str2;
                i3 = i2;
                str6 = str3;
                getimeactioneudusuo2 = getimeactioneudusuo;
            }
        }
        boolean z5 = copyuxg59pa.IconCompatParcelizer;
        Object obj = null;
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0) {
            int i7 = i6 + 121;
            MediaDescriptionCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                boolean z6 = copyuxg59pa.MediaMetadataCompat;
                obj.hashCode();
                throw null;
            }
            z4 = copyuxg59pa.MediaMetadataCompat;
        } else {
            z4 = z2;
        }
        copyuxg59pa.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        getimeactioneudusuo2.getClass();
        copyuxg59PA copyuxg59pa2 = new copyuxg59PA(str4, str5, i3, str6, getimeactioneudusuo2, z3, z5, z4);
        int i8 = MediaDescriptionCompat + 41;
        RatingCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            return copyuxg59pa2;
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 121;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.MediaBrowserCompatMediaItem, af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.read), 31), 31, this.write);
        int iHashCode = Boolean.hashCode(this.MediaMetadataCompat) + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m((this.MediaSessionCompatQueueItem.hashCode() + iM) * 31, 31, this.RemoteActionCompatParcelizer), 31, this.IconCompatParcelizer);
        int i4 = RatingCompat + 47;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 15;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("HasImages(primaryImageUrl=", this.serializer, ", primaryImageId=", this.read, ", totalCount=");
        sbM.append(this.MediaBrowserCompatMediaItem);
        sbM.append(", address=");
        sbM.append(this.write);
        sbM.append(", tooltip=");
        sbM.append(this.MediaSessionCompatQueueItem);
        sbM.append(", isTooltipReady=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(", isTooltipAvailable=");
        String strSerializer = MediaSessionCompatQueueItem.serializer(sbM, this.IconCompatParcelizer, ", showBadge=", this.MediaMetadataCompat, ")");
        int i4 = RatingCompat + 35;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
        return strSerializer;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 67;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RatingCompat = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof copyuxg59PA) {
            copyuxg59PA copyuxg59pa = (copyuxg59PA) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, copyuxg59pa.serializer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, copyuxg59pa.read}, getCieXyz.write())).booleanValue() || this.MediaBrowserCompatMediaItem != copyuxg59pa.MediaBrowserCompatMediaItem) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, copyuxg59pa.write}, getCieXyz.write())).booleanValue()) {
                int i5 = RatingCompat + 97;
                MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, copyuxg59pa.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (this.RemoteActionCompatParcelizer == copyuxg59pa.RemoteActionCompatParcelizer) {
                if (this.IconCompatParcelizer != copyuxg59pa.IconCompatParcelizer) {
                    int i7 = RatingCompat + 125;
                    MediaDescriptionCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i7 % 2 != 0;
                }
                if (this.MediaMetadataCompat == copyuxg59pa.MediaMetadataCompat) {
                    return true;
                }
                int i8 = MediaDescriptionCompat + 75;
                RatingCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return false;
            }
            int i10 = RatingCompat + 21;
            MediaDescriptionCompat = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return false;
        }
        int i12 = i3 + 67;
        MediaDescriptionCompat = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i12 % 2 != 0;
    }

    @Override // o.copyYTHSh70
    public final copyYTHSh70 RemoteActionCompatParcelizer(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        return (copyYTHSh70) write(903435478, StreamResetException.serializer(), StreamResetException.serializer(), StreamResetException.serializer(), StreamResetException.serializer(), objArr, -903435478);
    }

    @Override // o.copyYTHSh70
    public final getImeActioneUduSuo RemoteActionCompatParcelizer() {
        int iSerializer = StreamResetException.serializer();
        int iSerializer2 = StreamResetException.serializer();
        return (getImeActioneUduSuo) write(744788467, iSerializer, StreamResetException.serializer(), iSerializer2, StreamResetException.serializer(), new Object[]{this}, -744788466);
    }
}
