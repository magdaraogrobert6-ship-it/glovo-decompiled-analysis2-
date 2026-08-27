package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.huawei.location.gwi.util.GwiErrorCode;

/* JADX INFO: loaded from: classes3.dex */
public final class DpOffsetCompanion implements getXD9Ej5fM {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final long write;

    public DpOffsetCompanion(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.write = j;
        this.read = str;
        this.RemoteActionCompatParcelizer = str2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 89;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.RemoteActionCompatParcelizer.hashCode() - af$$ExternalSyntheticOutline0.m(Long.hashCode(this.write) << 17, GwiErrorCode.ALG_LIBRARY_NOT_EXIST, this.read);
        } else {
            iHashCode = this.RemoteActionCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m(Long.hashCode(this.write) * 31, 31, this.read);
        }
        int i3 = serializer + 57;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 81;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return d$$ExternalSyntheticOutline0.m(getBitmapFromCache.read("OpenQrPaymentScreen(deliveryId=", ", deliveryState=", this.write, this.read), ", taskId=", this.RemoteActionCompatParcelizer, ")");
        }
        int i3 = 46 / 0;
        return d$$ExternalSyntheticOutline0.m(getBitmapFromCache.read("OpenQrPaymentScreen(deliveryId=", ", deliveryState=", this.write, this.read), ", taskId=", this.RemoteActionCompatParcelizer, ")");
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 71;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof DpOffsetCompanion) {
            DpOffsetCompanion dpOffsetCompanion = (DpOffsetCompanion) obj;
            if (this.write != dpOffsetCompanion.write) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, dpOffsetCompanion.read}, getCieXyz.write())).booleanValue()) {
                return !(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, dpOffsetCompanion.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue() ^ true);
            }
            int i4 = serializer + 95;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = IconCompatParcelizer + 91;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
