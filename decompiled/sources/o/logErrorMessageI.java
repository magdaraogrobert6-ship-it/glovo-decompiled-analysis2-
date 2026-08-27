package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class logErrorMessageI implements buildResponseData {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public final boolean IconCompatParcelizer;
    public final Integer RemoteActionCompatParcelizer;
    public final ResponseData1 read;
    public final String serializer;
    public final boolean write;

    @Override // o.buildResponseData
    public final Integer IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 125;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.RemoteActionCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.buildResponseData
    public final String read() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 1;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.serializer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.buildResponseData
    public final ResponseData1 serializer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 19;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.read;
        }
        int i3 = 17 / 0;
        return this.read;
    }

    public logErrorMessageI(String str, boolean z, ResponseData1 responseData1, Integer num, boolean z2) {
        str.getClass();
        responseData1.getClass();
        this.serializer = str;
        this.IconCompatParcelizer = z;
        this.read = responseData1;
        this.RemoteActionCompatParcelizer = num;
        this.write = z2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 119;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.IconCompatParcelizer);
        int iHashCode = this.read.hashCode();
        Integer num = this.RemoteActionCompatParcelizer;
        int iHashCode2 = Boolean.hashCode(this.write) + ((((iHashCode + iM) * 31) + (num == null ? 0 : num.hashCode())) * 31);
        int i4 = MediaSessionCompatQueueItem + 123;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 101;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m("StopWorking(text=", this.serializer, ", confirmationRequired=", ", style=", this.IconCompatParcelizer);
        sbM.append(this.read);
        sbM.append(", icon=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(", isOnDemand=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.write, ")");
        int i4 = MediaSessionCompatQueueItem + 123;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof logErrorMessageI)) {
                return false;
            }
            logErrorMessageI logerrormessagei = (logErrorMessageI) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, logerrormessagei.serializer}, getCieXyz.write())).booleanValue()) {
                if (this.IconCompatParcelizer != logerrormessagei.IconCompatParcelizer || this.read != logerrormessagei.read) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, logerrormessagei.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    return this.write == logerrormessagei.write;
                }
                int i2 = RatingCompat + 25;
                MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i2 % 2 != 0;
            }
            int i3 = MediaSessionCompatQueueItem + 19;
            RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = RatingCompat + 51;
        MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }
}
