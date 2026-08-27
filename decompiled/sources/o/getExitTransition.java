package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getExitTransition {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public final String IconCompatParcelizer;
    public final String MediaDescriptionCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public getExitTransition(String str, String str2, String str3, String str4, String str5, String str6) {
        this.write = str;
        this.MediaDescriptionCompat = str2;
        this.read = str3;
        this.IconCompatParcelizer = str4;
        this.RemoteActionCompatParcelizer = str5;
        this.serializer = str6;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 79;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("ChatParams(initialMessage=", this.write, ", reasonCode=", this.MediaDescriptionCompat, ", orderId=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.read, ", pageId=", this.IconCompatParcelizer, ", deliveryId=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.RemoteActionCompatParcelizer, ", flowVersion=", this.serializer, ")");
        int i4 = MediaSessionCompatQueueItem + 77;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 13 / 0;
        }
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem;
        int i3 = i2 + 103;
        RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.write;
        if (str == null) {
            int i5 = i2 + 51;
            RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i5 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.MediaDescriptionCompat;
        if (str2 == null) {
            int i6 = MediaSessionCompatQueueItem + 107;
            RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.read;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.IconCompatParcelizer;
        if (str4 == null) {
            int i8 = MediaSessionCompatQueueItem + 67;
            int i9 = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            RatingCompat = i9;
            iHashCode3 = 1 ^ (i8 % 2 != 0 ? 0 : 1);
            int i10 = i9 + 31;
            MediaSessionCompatQueueItem = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
        } else {
            iHashCode3 = str4.hashCode();
        }
        String str5 = this.RemoteActionCompatParcelizer;
        if (str5 == null) {
            int i12 = RatingCompat + 41;
            MediaSessionCompatQueueItem = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str5.hashCode();
        }
        String str6 = this.serializer;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode5) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RatingCompat;
            int i3 = i2 + 35;
            MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 103;
            MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof getExitTransition)) {
            return false;
        }
        getExitTransition getexittransition = (getExitTransition) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, getexittransition.write}, getCieXyz.write())).booleanValue()) {
            int i6 = MediaSessionCompatQueueItem + 9;
            RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i6 % 2 != 0;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaDescriptionCompat, getexittransition.MediaDescriptionCompat}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, getexittransition.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, getexittransition.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            int i7 = MediaSessionCompatQueueItem + 25;
            RatingCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, getexittransition.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, getexittransition.serializer}, getCieXyz.write())).booleanValue();
    }
}
