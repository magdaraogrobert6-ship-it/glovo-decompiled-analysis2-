package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getTypeConverter {
    private static int MediaSessionCompatQueueItem = 1;
    private static int serializer;
    public final int IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final int write;

    public getTypeConverter(int i, int i2, int i3, int i4) {
        this.read = i;
        this.IconCompatParcelizer = i2;
        this.RemoteActionCompatParcelizer = i3;
        this.write = i4;
    }

    public /* synthetic */ getTypeConverter(int i, int i2, int i3) {
        this(i, i2, i3, com.logistics.rider.glovo.R.string.upload_receipt_retry_dialog_skip);
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 17;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.write) + af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, Integer.hashCode(this.read) * 31, 31), 31);
        int i4 = serializer + 75;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 19;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m(this.read, this.IconCompatParcelizer, "PermissionErrorData(title=", ", description=", ", buttonName=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(", buttonDismiss=");
        sbM.append(this.write);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaSessionCompatQueueItem + 61;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem;
        int i3 = i2 + 57;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof getTypeConverter) {
            getTypeConverter gettypeconverter = (getTypeConverter) obj;
            return this.read == gettypeconverter.read && this.IconCompatParcelizer == gettypeconverter.IconCompatParcelizer && this.RemoteActionCompatParcelizer == gettypeconverter.RemoteActionCompatParcelizer && this.write == gettypeconverter.write;
        }
        int i5 = i2 + 39;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
