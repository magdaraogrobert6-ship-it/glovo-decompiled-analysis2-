package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class drawText extends getClipBounds {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public final getSaveCount IconCompatParcelizer;
    public final ArrayList MediaDescriptionCompat;
    public final String RemoteActionCompatParcelizer;
    public final boolean read;
    public final String serializer;
    public final getDrawFilter write;

    public drawText(String str, String str2, getDrawFilter getdrawfilter, boolean z, getSaveCount getsavecount, ArrayList arrayList) {
        str.getClass();
        this.serializer = str;
        this.RemoteActionCompatParcelizer = str2;
        this.write = getdrawfilter;
        this.read = z;
        this.IconCompatParcelizer = getsavecount;
        this.MediaDescriptionCompat = arrayList;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.serializer.hashCode();
        String str = this.RemoteActionCompatParcelizer;
        int iHashCode3 = 0;
        if (str == null) {
            int i2 = MediaSessionCompatQueueItem + 33;
            RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        getDrawFilter getdrawfilter = this.write;
        int iM = d$$ExternalSyntheticOutline0.m(((((iHashCode2 * 31) + iHashCode) * 31) + (getdrawfilter == null ? 0 : getdrawfilter.hashCode())) * 31, 31, this.read);
        getSaveCount getsavecount = this.IconCompatParcelizer;
        if (getsavecount == null) {
            int i4 = MediaSessionCompatQueueItem + 35;
            RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } else {
            iHashCode3 = getsavecount.hashCode();
        }
        return this.MediaDescriptionCompat.hashCode() + ((iM + iHashCode3) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RatingCompat + 39;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("LastStopOption(title=", this.serializer, ", description=", this.RemoteActionCompatParcelizer, ", location=");
        sbM.append(this.write);
        sbM.append(", isEnabled=");
        sbM.append(this.read);
        sbM.append(", lastStopAddressManageItems=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(", trackingEvents=");
        sbM.append(this.MediaDescriptionCompat);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaSessionCompatQueueItem + 49;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 123;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 73 / 0;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        }
        if (obj instanceof drawText) {
            drawText drawtext = (drawText) obj;
            Object[] objArr = {this.serializer, drawtext.serializer};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                Object[] objArr2 = {this.RemoteActionCompatParcelizer, drawtext.RemoteActionCompatParcelizer};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    Object[] objArr3 = {this.write, drawtext.write};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                        if (this.read != drawtext.read) {
                            int i4 = MediaSessionCompatQueueItem + 27;
                            RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i5 = i4 % 2;
                        } else {
                            Object[] objArr4 = {this.IconCompatParcelizer, drawtext.IconCompatParcelizer};
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue() && this.MediaDescriptionCompat.equals(drawtext.MediaDescriptionCompat)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
