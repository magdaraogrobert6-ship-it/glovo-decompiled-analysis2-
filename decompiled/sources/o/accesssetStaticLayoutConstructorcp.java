package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class accesssetStaticLayoutConstructorcp {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat;
    public final lookupAndInterpolate IconCompatParcelizer;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk RatingCompat;
    public final lerpInv RemoteActionCompatParcelizer;
    public final accessisInitializedcp read;
    public final MathUtils serializer;
    public final String write;

    public accesssetStaticLayoutConstructorcp(String str, String str2, String str3, MathUtils mathUtils, lerpInv lerpinv, lookupAndInterpolate lookupandinterpolate, accessisInitializedcp accessisinitializedcp) {
        kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector smallPersistentVector = kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector.RemoteActionCompatParcelizer;
        smallPersistentVector.getClass();
        this.MediaSessionCompatQueueItem = str;
        this.MediaMetadataCompat = str2;
        this.write = str3;
        this.serializer = mathUtils;
        this.RemoteActionCompatParcelizer = lerpinv;
        this.IconCompatParcelizer = lookupandinterpolate;
        this.read = accessisinitializedcp;
        this.RatingCompat = smallPersistentVector;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 79;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Earnings(tagName=", this.MediaSessionCompatQueueItem, ", title=", this.MediaMetadataCompat, ", paidDistance=");
        sbM.append(this.write);
        sbM.append(", primaryItemView=");
        sbM.append(this.serializer);
        sbM.append(", secondaryItemView=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(", promoBonusItemView=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(", showRecommendedIcon=false, multiplier=");
        sbM.append(this.read);
        sbM.append(", trackingEvents=");
        sbM.append(this.RatingCompat);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaBrowserCompatMediaItem + 97;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
        return string;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        String str = this.MediaSessionCompatQueueItem;
        int iHashCode5 = 0;
        if (str == null) {
            int i2 = MediaDescriptionCompat + 35;
            MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.MediaMetadataCompat;
        if (str2 == null) {
            int i4 = MediaBrowserCompatMediaItem + 27;
            MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.write;
        if (str3 == null) {
            int i6 = MediaDescriptionCompat;
            int i7 = i6 + 1;
            MediaBrowserCompatMediaItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            int i9 = i6 + 73;
            MediaBrowserCompatMediaItem = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str3.hashCode();
        }
        MathUtils mathUtils = this.serializer;
        int iHashCode6 = mathUtils == null ? 0 : mathUtils.hashCode();
        lerpInv lerpinv = this.RemoteActionCompatParcelizer;
        int iHashCode7 = lerpinv == null ? 0 : lerpinv.hashCode();
        lookupAndInterpolate lookupandinterpolate = this.IconCompatParcelizer;
        if (lookupandinterpolate == null) {
            int i11 = MediaBrowserCompatMediaItem + 61;
            int i12 = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            MediaDescriptionCompat = i12;
            int i13 = i11 % 2;
            int i14 = i12 + 105;
            MediaBrowserCompatMediaItem = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i15 = i14 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = lookupandinterpolate.hashCode();
        }
        int iM = d$$ExternalSyntheticOutline0.m(((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode4) * 31, 31, false);
        accessisInitializedcp accessisinitializedcp = this.read;
        if (accessisinitializedcp == null) {
            int i16 = MediaBrowserCompatMediaItem + 55;
            MediaDescriptionCompat = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i17 = i16 % 2;
        } else {
            iHashCode5 = accessisinitializedcp.hashCode();
        }
        return this.RatingCompat.hashCode() + ((iM + iHashCode5) * 31);
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof accesssetStaticLayoutConstructorcp)) {
                return false;
            }
            accesssetStaticLayoutConstructorcp accesssetstaticlayoutconstructorcp = (accesssetStaticLayoutConstructorcp) obj;
            Object[] objArr = {this.MediaSessionCompatQueueItem, accesssetstaticlayoutconstructorcp.MediaSessionCompatQueueItem};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                Object[] objArr2 = {this.MediaMetadataCompat, accesssetstaticlayoutconstructorcp.MediaMetadataCompat};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    Object[] objArr3 = {this.write, accesssetstaticlayoutconstructorcp.write};
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    Object[] objArr4 = {this.serializer, accesssetstaticlayoutconstructorcp.serializer};
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    Object[] objArr5 = {this.RemoteActionCompatParcelizer, accesssetstaticlayoutconstructorcp.RemoteActionCompatParcelizer};
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    Object[] objArr6 = {this.IconCompatParcelizer, accesssetstaticlayoutconstructorcp.IconCompatParcelizer};
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr6, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    Object[] objArr7 = {this.read, accesssetstaticlayoutconstructorcp.read};
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr7, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    Object[] objArr8 = {this.RatingCompat, accesssetstaticlayoutconstructorcp.RatingCompat};
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr8, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                } else {
                    i = MediaDescriptionCompat + 1;
                    MediaBrowserCompatMediaItem = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                }
            } else {
                i = MediaBrowserCompatMediaItem + 105;
                MediaDescriptionCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            int i3 = i % 2;
            return false;
        }
        return true;
    }
}
