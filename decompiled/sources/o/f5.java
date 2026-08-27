package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class f5 {
    private static int PlaybackStateCompat = 1;
    private static int PlaybackStateCompatCustomAction;
    public final int IconCompatParcelizer;
    public final int MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final g1 MediaMetadataCompat;
    public final int MediaSessionCompatQueueItem;
    public final int MediaSessionCompatResultReceiverWrapper;
    public final String RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final int serializer;
    public final int write;

    public static /* synthetic */ Object write(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i5);
        int i9 = ~i3;
        int i10 = (~(i9 | i6)) | i8;
        int i11 = ~i5;
        int i12 = i11 | i6;
        int i13 = i10 | (~i12);
        int i14 = i7 | i3;
        int i15 = i8 | (~i14);
        int i16 = (~(i5 | i14)) | (~(i7 | i9 | i11)) | (~(i12 | i3));
        int i17 = i6 + i3 + i4 + ((-1254723898) * i2) + ((-1667789834) * i);
        int i18 = i17 * i17;
        int i19 = ((-534547663) * i6) + 1379663872 + ((-481802647) * i3) + ((-17581672) * i13) + (35163344 * i15) + (17581672 * i16) + ((-499384320) * i4) + ((-1033371648) * i2) + ((-106430464) * i) + (1552875520 * i18);
        int i20 = ((i6 * (-402395399)) - 1316031342) + (i3 * (-402392591)) + (i13 * (-936)) + (i15 * 1872) + (i16 * 936) + (i4 * (-402393527)) + (i2 * (-1219896714)) + (i * (-610841306)) + (i18 * (-825819136));
        return i19 + ((i20 * i20) * (-1063190528)) != 1 ? serializer(objArr) : read(objArr);
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        int i;
        f5 f5Var = (f5) objArr[0];
        int i2 = 2 % 2;
        int i3 = PlaybackStateCompat + 109;
        PlaybackStateCompatCustomAction = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            i = f5Var.MediaSessionCompatQueueItem;
            int i4 = 65 / 0;
        } else {
            i = f5Var.MediaSessionCompatQueueItem;
        }
        return Integer.valueOf(i);
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        f5 f5Var = (f5) objArr[0];
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 23;
        PlaybackStateCompatCustomAction = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return f5Var.MediaMetadataCompat;
        }
        g1 g1Var = f5Var.MediaMetadataCompat;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int IconCompatParcelizer() {
        int i;
        int i2 = 2 % 2;
        int i3 = PlaybackStateCompat;
        int i4 = i3 + 17;
        PlaybackStateCompatCustomAction = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            i = this.RemoteActionCompatParcelizer;
            int i5 = 57 / 0;
        } else {
            i = this.RemoteActionCompatParcelizer;
        }
        int i6 = i3 + 115;
        PlaybackStateCompatCustomAction = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return i;
    }

    public final String MediaBrowserCompatMediaItem() {
        String str;
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 101;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        PlaybackStateCompatCustomAction = i3;
        if (i2 % 2 != 0) {
            str = this.RatingCompat;
            int i4 = 21 / 0;
        } else {
            str = this.RatingCompat;
        }
        int i5 = i3 + 33;
        PlaybackStateCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 1 / 0;
        }
        return str;
    }

    public final String MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 39;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        PlaybackStateCompatCustomAction = i3;
        int i4 = i2 % 2;
        String str = this.MediaDescriptionCompat;
        int i5 = i3 + 23;
        PlaybackStateCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final int MediaSessionCompatToken() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 59;
        PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.MediaSessionCompatResultReceiverWrapper;
        }
        int i3 = 79 / 0;
        return this.MediaSessionCompatResultReceiverWrapper;
    }

    public final int RatingCompat() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 81;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        PlaybackStateCompat = i3;
        int i4 = i2 % 2;
        int i5 = this.MediaBrowserCompatMediaItem;
        int i6 = i3 + 95;
        PlaybackStateCompatCustomAction = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final int RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 111;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        PlaybackStateCompat = i3;
        int i4 = i2 % 2;
        int i5 = this.write;
        int i6 = i3 + 115;
        PlaybackStateCompatCustomAction = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int read() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat;
        int i3 = i2 + 83;
        PlaybackStateCompatCustomAction = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.serializer;
        int i6 = i2 + 43;
        PlaybackStateCompatCustomAction = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int serializer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 63;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        PlaybackStateCompat = i3;
        int i4 = i2 % 2;
        int i5 = this.IconCompatParcelizer;
        int i6 = i3 + 43;
        PlaybackStateCompatCustomAction = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int write() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 117;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        PlaybackStateCompat = i3;
        int i4 = i2 % 2;
        int i5 = this.read;
        int i6 = i3 + 69;
        PlaybackStateCompatCustomAction = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public f5(String str, String str2, int i, int i2, g1 g1Var, int i3) {
        if ((i3 & androidx.compose.ui.graphics.Fields.CameraDistance) != 0) {
            int i4 = PlaybackStateCompatCustomAction + 39;
            PlaybackStateCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                g1Var = g1.ROUNDED_SQUARE;
                int i5 = 58 / 0;
            } else {
                g1Var = g1.ROUNDED_SQUARE;
            }
            int i6 = PlaybackStateCompatCustomAction + 119;
            PlaybackStateCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
        }
        g1Var.getClass();
        this.MediaDescriptionCompat = str;
        this.RatingCompat = str2;
        this.IconCompatParcelizer = i;
        this.write = com.logistics.rider.glovo.R.color.primary_main;
        this.MediaSessionCompatResultReceiverWrapper = com.logistics.rider.glovo.R.color.neutral_00;
        this.MediaBrowserCompatMediaItem = com.logistics.rider.glovo.R.color.neutral_00;
        this.read = com.logistics.rider.glovo.R.color.neutral_00;
        this.RemoteActionCompatParcelizer = com.logistics.rider.glovo.R.color.primary_main;
        this.MediaSessionCompatQueueItem = com.logistics.rider.glovo.R.color.primary_main;
        this.serializer = i2;
        this.MediaMetadataCompat = g1Var;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 59;
        PlaybackStateCompatCustomAction = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("ActionablePinContent(title=", this.MediaDescriptionCompat, ", subtitle=", this.RatingCompat, ", iconDrawable=");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.IconCompatParcelizer, this.write, ", backgroundColor=", ", titleColor=", sbM);
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper, this.MediaBrowserCompatMediaItem, ", subtitleColor=", ", subtitleBackgroundColor=0, iconColor=", sbM);
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.read, this.RemoteActionCompatParcelizer, ", pinPointColor=", ", pinStringColor=", sbM);
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.MediaSessionCompatQueueItem, this.serializer, ", badgeCount=", ", pinShape=", sbM);
        sbM.append(this.MediaMetadataCompat);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = PlaybackStateCompat + 75;
        PlaybackStateCompatCustomAction = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
        return string;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 23;
        PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.MediaMetadataCompat.hashCode() + af$$ExternalSyntheticOutline0.m(this.serializer, af$$ExternalSyntheticOutline0.m(this.MediaSessionCompatQueueItem, af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, af$$ExternalSyntheticOutline0.m(this.read, af$$ExternalSyntheticOutline0.m(0, af$$ExternalSyntheticOutline0.m(this.MediaBrowserCompatMediaItem, af$$ExternalSyntheticOutline0.m(this.MediaSessionCompatResultReceiverWrapper, af$$ExternalSyntheticOutline0.m(this.write, af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, af$$ExternalSyntheticOutline0.m(this.MediaDescriptionCompat.hashCode() * 31, 31, this.RatingCompat), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i4 = PlaybackStateCompatCustomAction + 95;
        PlaybackStateCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 7;
        PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof f5) {
            f5 f5Var = (f5) obj;
            Object[] objArr = {this.MediaDescriptionCompat, f5Var.MediaDescriptionCompat};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                Object[] objArr2 = {this.RatingCompat, f5Var.RatingCompat};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue() && this.IconCompatParcelizer == f5Var.IconCompatParcelizer) {
                    if (this.write != f5Var.write) {
                        int i3 = PlaybackStateCompatCustomAction + 87;
                        PlaybackStateCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i4 = i3 % 2;
                    } else if (this.MediaSessionCompatResultReceiverWrapper == f5Var.MediaSessionCompatResultReceiverWrapper && this.MediaBrowserCompatMediaItem == f5Var.MediaBrowserCompatMediaItem && this.read == f5Var.read && this.RemoteActionCompatParcelizer == f5Var.RemoteActionCompatParcelizer && this.MediaSessionCompatQueueItem == f5Var.MediaSessionCompatQueueItem && this.serializer == f5Var.serializer && this.MediaMetadataCompat == f5Var.MediaMetadataCompat) {
                        return true;
                    }
                }
            }
        }
        int i5 = PlaybackStateCompatCustomAction + 97;
        PlaybackStateCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }

    public final int MediaDescriptionCompat() {
        int iWrite = setReferencedIds.write();
        int iWrite2 = setReferencedIds.write();
        int iWrite3 = setReferencedIds.write();
        return ((Integer) write(setReferencedIds.write(), iWrite3, -441067836, iWrite2, iWrite, new Object[]{this}, 441067837)).intValue();
    }

    public final g1 MediaSessionCompatQueueItem() {
        int iWrite = setReferencedIds.write();
        int iWrite2 = setReferencedIds.write();
        int iWrite3 = setReferencedIds.write();
        return (g1) write(setReferencedIds.write(), iWrite3, -2129248991, iWrite2, iWrite, new Object[]{this}, 2129248991);
    }
}
